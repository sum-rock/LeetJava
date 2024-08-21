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

  private LongestStringWithoutRepeatingCharacters puzzle = new LongestStringWithoutRepeatingCharacters(false);

  public void testDvd() {
    assertEquals(puzzle.solve(new String[] { "dvdfd" }), "3");
  }

  public void testAllRepeating() {
    assertEquals(puzzle.solve(new String[] { "aaaaaaa" }), "1");
  }

  public void testSingleCharacter() {
    assertEquals(puzzle.solve(new String[] { "a" }), "1");
  }

  public void testBoundaries() {
    assertEquals(puzzle.solve(new String[] { "asdfodfq" }), "5");
    assertEquals(puzzle.solve(new String[] { "abcabcaql" }), "5");
  }

}
