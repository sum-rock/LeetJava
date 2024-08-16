package com.leet;

import java.util.HashMap;

import com.leet.modules.LongestStringWithoutRepeatingCharacters;
import com.leet.interfaces.Solution;

public final class Globals {
  private static Globals INSTANCE;

  public static class PuzzleFeatures {
    public Solution solution;
    public String title;
    public String description;
    public String inputs;

    public PuzzleFeatures(Solution solution, String title, String description, String inputs) {
      this.solution = solution;
      this.title = title;
      this.description = description;
      this.inputs = inputs;
    }
  }

  private Globals() {
    registry.put(
        "longest_string_without_repeates",
        new PuzzleFeatures(
            new LongestStringWithoutRepeatingCharacters(),
            "Longest String Without Repeating Characters",
            "Given a string, find the length of the longest substring without repeating characters.",
            "A string"));
  }

  public HashMap<String, PuzzleFeatures> registry = new HashMap<String, PuzzleFeatures>();

  public static Globals get_instance() {
    if (INSTANCE == null) {
      INSTANCE = new Globals();
    }
    return INSTANCE;
  }

}
