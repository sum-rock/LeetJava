package com.leet.puzzles;

import com.leet.Solution;

public class LongestPalindromicSubstring extends Solution {

  public LongestPalindromicSubstring(boolean verbose) {
    super(verbose);
  }

  public String solve(String[] args) {
    String s = args[0];
    int l = 0;
    int r = 0;

    for (int i = 0; i < s.length(); i++) {
      int[] oddRange = longestSymetricalSubstring(i, i, s);
      int[] evenRange = longestSymetricalSubstring(i, i + 1, s);

      int[] a = { l, r };
      int cur = distance(a);

      if (distance(oddRange) > cur) {
        l = oddRange[0];
        r = oddRange[1];
        logAttr("Best candidate Found!", s.substring(l, r + 1));
      }
      if (distance(evenRange) > cur) {
        l = evenRange[0];
        r = evenRange[1];
        logAttr("Best candidate Found!", s.substring(l, r + 1));
      }
    }

    return s.substring(l, r + 1);
  }

  private int distance(int[] r) {
    return r[1] - r[0];
  }

  private int[] longestSymetricalSubstring(int nodeLeft, int nodeRight, String s) {
    int resL = nodeLeft;
    int resR = nodeRight;

    while (equalAtIndex(nodeLeft, nodeRight, s)) {
      resL = nodeLeft;
      resR = nodeRight;
      --nodeLeft;
      ++nodeRight;
    }

    int[] res = { resL, resR };
    int[] alt = { 0, 0 };

    if (distance(res) <= 1) {
      if ((distance(res) == 1) && equalAtIndex(resL, resR, s)) {
        return res;
      } else {
        return alt;
      }
    }
    return res;
  }

  private boolean equalAtIndex(int l, int r, String s) {
    if (l < 0) {
      return false;
    } else if (r >= s.length()) {
      return false;
    } else if (s.charAt(l) == s.charAt(r)) {
      return true;
    } else {
      return false;
    }
  }
}
