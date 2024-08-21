package com.leet;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import com.leet.puzzles.LongestStringWithoutRepeatingCharacters;

public class TestLongestStringWithoutRepeatingCharacters extends TestCase {

  public TestLongestStringWithoutRepeatingCharacters(String testName) {
    super(testName);
  }

  public static Test suite() {
    return new TestSuite(TestLongestStringWithoutRepeatingCharacters.class);
  }

  public void testDvd() {
    LongestStringWithoutRepeatingCharacters puzzle = new LongestStringWithoutRepeatingCharacters(false);
    assertEquals(puzzle.solve(new String[] { "dvdfd" }), "3");
  }

  public void testAllRepeating() {
    LongestStringWithoutRepeatingCharacters puzzle = new LongestStringWithoutRepeatingCharacters(false);
    assertEquals(puzzle.solve(new String[] { "aaaaaaa" }), "1");
  }

  public void testSingleCharacter() {
    LongestStringWithoutRepeatingCharacters puzzle = new LongestStringWithoutRepeatingCharacters(false);
    assertEquals(puzzle.solve(new String[] { "a" }), "1");
  }

  public void testBoundaries() {
    LongestStringWithoutRepeatingCharacters puzzle = new LongestStringWithoutRepeatingCharacters(false);
    assertEquals(puzzle.solve(new String[] { "asdfodfq" }), "5");
    assertEquals(puzzle.solve(new String[] { "abcabcaql" }), "5");
  }

}
