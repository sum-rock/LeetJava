package com.leet.modules;

import com.leet.interfaces.Solution;

import java.util.HashSet;

public class LongestStringWithoutRepeatingCharacters implements Solution {
  public String solve(String[] args) {
    String s = args[0];
    Integer maxLength = 0;
    Integer left = 0;
    Integer right = 1;
    HashSet<Character> charSet = new HashSet<Character>();

    while (left < s.length()) {
      Character leftChar = s.charAt(left);
      System.out.println("CharSet: " + charSet);

      if (!charSet.contains(leftChar)) {
        charSet.add(leftChar);
        System.out.println("Adding Left: " + leftChar);
      }

      if (right >= s.length()) {
        maxLength = (maxLength == 0) ? 1 : maxLength;
        break;
      }

      Character rightChar = s.charAt(right);
      while (!charSet.contains(rightChar)) {
        charSet.add(rightChar);
        System.out.println("Adding Right: " + rightChar);

        if (right + 1 < s.length()) {
          right += 1;
          rightChar = s.charAt(right);
        }
        if (charSet.size() > maxLength) {
          maxLength = charSet.size();
          System.out.println("New Max Size: " + maxLength);
        }
      }

      System.out.println("Final CharSet: " + charSet);
      System.out.println("=".repeat(20));

      charSet.remove(leftChar);
      left += 1;
      if (right <= left) {
        right += 1;
      }
    }
    return maxLength.toString();
  };
}
