package com.leet.subcommands;

import com.leet.interfaces.Solution;
import com.leet.Globals;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;
import picocli.CommandLine.ArgGroup;

@Command(name = "puzzle", description = "Run a puzzle")
public class Puzzle implements Runnable {

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

    Globals globals = new Globals(puzzle.verbose);
    Globals.PuzzleFeatures puzzleFeatures = globals.registry.get(puzzle.puzzleName);

    if (puzzleFeatures == null) {
      System.out.println("Puzzle not found.");
      List listCommand = new List();
      listCommand.printList();
    } else {
      Solution solution = globals.registry.get(puzzle.puzzleName).solution;
      System.out.println(solution.solve(puzzle.inputs));
    }

  }

}
