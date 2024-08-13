package com.leet;

import picocli.CommandLine;
import picocli.CommandLine.Command;

import java.util.concurrent.Callable;
//import picocli.CommandLine.Option; import picocli.CommandLine.Parameters;

@Command(name = "leet", mixinStandardHelpOptions = true, version = "leet 1.0", description = "LeetCode solutions")
public class App implements Callable<Integer> {
  public Integer call() {
    System.out.println("Hello World!");
    return 0;
  }

  // this example implements Callable, so parsing, error handling and handling
  // user requests for usage help or version help can be done with one line of
  // code.
  public static void main(String... args) {
    int exitCode = new CommandLine(new App()).execute(args);
    System.exit(exitCode);
  }
}
