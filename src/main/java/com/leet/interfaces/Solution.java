package com.leet.interfaces;

public abstract class Solution {
  public boolean VERBOSE;

  public Solution(boolean verbose) {
    this.VERBOSE = verbose;
  }

  public abstract String solve(String[] args);

  public void logAttr(String message, String value) {
    if (this.VERBOSE) {
      System.out.println(message + " " + value);
    }
  }

  public void logMessage(String message) {
    if (this.VERBOSE) {
      System.out.println(message);
    }
  }

  public void logThinLine() {
    if (this.VERBOSE) {
      System.out.println("-".repeat(80));
    }
  }

  public void logThickLine() {
    if (this.VERBOSE) {
      System.out.println("=".repeat(80));
    }
  }
}
