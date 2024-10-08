package com.leet;

import java.util.concurrent.Callable;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import com.leet.subcommands.*;

@Command(name = "leet", mixinStandardHelpOptions = true, version = "leet 1.0", subcommands = { Puzzle.class,
    List.class })
public class App implements Callable<Integer> {

  @Override
  public Integer call() {
    System.out.println("Subcommand needed. Run --help for more information.");
    return 0;
  }

  public static void main(String... args) {
    int exitCode = new CommandLine(new App()).execute(args);
    System.exit(exitCode);
  }
}
