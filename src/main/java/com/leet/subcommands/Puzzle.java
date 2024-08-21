package com.leet.subcommands;

import com.leet.*;
import com.leet.puzzles.*;
import java.util.HashMap;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.ArgGroup;

@Command(name = "puzzle", description = "Run a puzzle")
public class Puzzle implements Runnable {

  private HashMap<String, Features> registry() {
    HashMap<String, Features> ret = new HashMap<String, Features>();

    ret.put(
        "longest_string_without_repeates",
        new Features(
            new LongestStringWithoutRepeatingCharacters(puzzle.verbose),
            "Longest String Without Repeats",
            "Given a string, find the length of the longest substring without repeating characters.",
            "A string"));
    ret.put(
        "longest_palindrome",
        new Features(
            new LongestPalindromicSubstring(puzzle.verbose),
            "Longest Palindrome",
            "Given a string, find the longest palindrome.",
            "A string"));

    return ret;
  }

  public static class Features {
    public Solution solution;
    public String title;
    public String description;
    public String inputs;

    public Features(Solution solution, String title, String description, String inputs) {
      this.solution = solution;
      this.title = title;
      this.description = description;
      this.inputs = inputs;
    }
  }

  static class PuzzleArgs {
    @Parameters(index = "0", description = "Name of the puzzle to run in snake_case")
    String puzzleName;

    @Option(names = { "--inputs" }, split = ",", description = "Inputs for the puzzle")
    String[] inputs;

    @Option(names = { "--verbose", "-v" }, defaultValue = "false", description = "Print verbose output")
    boolean verbose;
  }

  @ArgGroup(exclusive = false, multiplicity = "1")
  PuzzleArgs puzzle;

  public void run() {
    System.out.println("Running puzzle: " + puzzle.puzzleName);

    Features features = registry().get(puzzle.puzzleName);
    if (features == null) {
      System.out.println("Puzzle not found.");
      List listCommand = new List();
      listCommand.printList();

    } else {
      System.out.println(features.solution.solve(puzzle.inputs));
    }

  }

}
