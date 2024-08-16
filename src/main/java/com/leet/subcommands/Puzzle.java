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
    @Parameters(index = "0", description = "Name of the puzzle to run in camelCase")
    String puzzleName;

    @Option(names = { "--inputs" }, split = ",", description = "Inputs for the puzzle")
    String[] inputs;
  }

  @ArgGroup(exclusive = false, multiplicity = "1")
  PuzzleArgs puzzle;

  public void run() {
    System.out.println("Running puzzle: " + puzzle.puzzleName);

    Globals globals = Globals.get_instance();
    Solution solution = globals.registry.get(puzzle.puzzleName);
    System.out.println(solution.solve(puzzle.inputs));

  }

}
