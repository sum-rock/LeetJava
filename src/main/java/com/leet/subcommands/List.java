package com.leet.subcommands;

import java.util.HashMap;

import com.leet.Globals;

import picocli.CommandLine.Command;

@Command(name = "list", description = "List of puzzles")
public class List implements Runnable {

  private Globals global = Globals.get_instance();

  public void run() {
    System.out.println("List of puzzles");

    for (HashMap.Entry<String, Globals.PuzzleFeatures> entry : global.registry.entrySet()) {
      System.out.println(entry.getKey());
    }

  }
}
