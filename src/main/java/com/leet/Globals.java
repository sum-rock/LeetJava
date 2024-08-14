package com.leet;

import java.util.HashMap;

import com.leet.modules.LongestStringWithoutRepeatingCharacters;
import com.leet.interfaces.Solution;

public final class Globals {
  private static Globals INSTANCE;

  private Globals() {
    registry.put("longestStringWithoutRepeatingCharacters", new LongestStringWithoutRepeatingCharacters());
  }

  public HashMap<String, Solution> registry = new HashMap<String, Solution>();

  public static Globals get_instance() {
    if (INSTANCE == null) {
      INSTANCE = new Globals();
    }
    return INSTANCE;
  }

}
