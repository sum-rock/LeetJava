package com.leet;

import com.leet.interfaces.Solution;

import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.util.concurrent.Callable;

@Command(name = "leet", mixinStandardHelpOptions = true, version = "leet 1.0", description = "LeetCode solutions")
public class App implements Callable<Integer> {

  @Parameters(index = "0", description = "Name of the puzzle to run in camelCase")
  private String puzzle;

  @Option(names = { "--inputs" }, description = "Inputs for the puzzle")
  private String[] inputs;

  public Integer call() {
    System.out.println("Running puzzle: " + puzzle);

    Globals globals = Globals.get_instance();
    Solution solution = globals.registry.get(puzzle);
    System.out.println(solution.solve(inputs));

    return 0;
  }

  public static void main(String... args) {
    int exitCode = new CommandLine(new App()).execute(args);
    System.exit(exitCode);
  }
}
