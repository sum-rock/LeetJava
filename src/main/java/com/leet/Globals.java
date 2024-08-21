package com.leet;

import java.util.HashMap;
import com.leet.modules.*;

public final class Globals {
  public Globals(boolean verbose) {
    this.verbose = verbose;

    registry.put(
        "longest_string_without_repeates",
        new PuzzleFeatures(
            new LongestStringWithoutRepeatingCharacters(verbose),
            "Longest String Without Repeats",
            "Given a string, find the length of the longest substring without repeating characters.",
            "A string"));
    registry.put(
        "longest_palindrome",
        new PuzzleFeatures(
            new LongestPalindromicSubstring(verbose),
            "Longest Palindrome",
            "Given a string, find the longest palindrome.",
            "A string"));
  }

  public final boolean verbose;
  public final HashMap<String, PuzzleFeatures> registry = new HashMap<String, PuzzleFeatures>();

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

}
