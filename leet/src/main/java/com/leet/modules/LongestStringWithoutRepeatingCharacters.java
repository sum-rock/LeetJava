package com.leet.modules;

import com.leet.interfaces.SolutionInterface;

import java.util.HashSet;

public class LongestStringWithoutRepeatingCharacters implements SolutionInterface {
  public void solve(String[] args) {
    String s = args[0];
    Integer maxLength = 0;
    Integer left = 0;
    Integer right = 1;
    HashSet<Character> charSet = new HashSet<Character>();

    while (left < s.length()) {
      Character leftChar = s.charAt(left);
      if (!charSet.contains(leftChar)) {
        charSet.add(leftChar);
      }

      if (right >= s.length()) {
        maxLength = (maxLength == 0) ? 1 : maxLength;
        break;
      }

      Character rightChar = s.charAt(right);
      while (!charSet.contains(rightChar)) {
        charSet.add(rightChar);
        if (right < s.length()) {
          right += 1;
          rightChar = s.charAt(right);
        }
        ;
      }

      charSet.remove(leftChar);
      if (right >= left) {
        right += 1;
      }
    }
  };
}
