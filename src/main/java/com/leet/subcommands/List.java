package com.leet.subcommands;

import de.vandermeer.asciitable.AsciiTable;
import de.vandermeer.skb.interfaces.transformers.textformat.TextAlignment;
import picocli.CommandLine.Command;

import com.leet.Globals;

@Command(name = "list", description = "List of puzzles")
public class List implements Runnable {

  private Globals global = new Globals(false);

  private AsciiTable addRow(AsciiTable table, Globals.PuzzleFeatures feat) {
    table.addRule();
    table.addRow(feat.title, feat.description, feat.inputs);
    return table;
  }

  public void printList() {
    System.out.println("Puzzle Features:");
    AsciiTable table = new AsciiTable();
    table.addRule();
    table.addRow("Title", "Description", "Inputs");

    global.registry.forEach((k, v) -> {
      addRow(table, v);
    });

    table.addRule();
    table.setTextAlignment(TextAlignment.LEFT);
    System.out.println(table.render());
  }

  public void run() {
    printList();
  }
}
