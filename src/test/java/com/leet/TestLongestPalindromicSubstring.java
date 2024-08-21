package com.leet;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.leet.puzzles.LongestPalindromicSubstring;

public class TestLongestPalindromicSubstring extends TestCase {

  public TestLongestPalindromicSubstring(String testName) {
    super(testName);
  }

  public static Test suite() {
    return new TestSuite(TestLongestPalindromicSubstring.class);
  }

  private LongestPalindromicSubstring puzzle = new LongestPalindromicSubstring(false);

  public void testBananas() {
    assertTrue(puzzle.solve(new String[] { "bananas" }).equals("anana"));
  }

  public void testRepeatingChars() {
    assertTrue(puzzle.solve(new String[] { "aaaaaaa" }).equals("aaaaaaa"));
    assertTrue(puzzle.solve(new String[] { "baaaaaaas" }).equals("aaaaaaa"));
    assertTrue(puzzle.solve(new String[] { "baaaaaaab" }).equals("baaaaaaab"));
  }

  public void testRepeatingDigraph() {
    assertTrue(puzzle.solve(new String[] { "babababab" }).equals("babababab"));
    assertTrue(puzzle.solve(new String[] { "bababab" }).equals("bababab"));
    assertTrue(puzzle.solve(new String[] { "xbabababy" }).equals("bababab"));
  }

  public void testLongSequence() {
    String testString = "abcdefghijklmnopqrstuvvutsrqponmlkjihgfedcba";
    assertTrue(puzzle.solve(new String[] { testString }).equals(testString));
  }

}
