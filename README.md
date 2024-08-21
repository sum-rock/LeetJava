# LeetJava

A command line utility to run [LeetCode](https://leetcode.com/problemset/) solutions written in
Java.

## Installation

1. Install the [Nix package manager](https://nixos.org/download/).
2. (optionally) Install [direnv](https://direnv.net/) or [nix-direnv](https://github.com/nix-community/nix-direnv)
3. Clone this repo and `cd` inside
4. Run either `direnv allow` if you installed direnv or `nix develop` if you did not.
5. Run `leet --help` to access to the CLI

## Usage

### List

Lists the puzzles available to run.

```
❯ leet list
```

Output

```
Puzzle Features:
┌──────────────────────────┬─────────────────────────┬─────────────────────────┐
│Title                     │Description              │Inputs                   │
├──────────────────────────┼─────────────────────────┼─────────────────────────┤
│Longest String Without    │Given a string, find the │A string                 │
│Repeats                   │length of the longest    │                         │
│                          │substring without        │                         │
│                          │repeating characters.    │                         │
├──────────────────────────┼─────────────────────────┼─────────────────────────┤
│Longest Palindrome        │Given a string, find the │A string                 │
│                          │longest palindrome.      │                         │
└──────────────────────────┴─────────────────────────┴─────────────────────────┘
```

### Puzzles

Run a specific puzzle. For example...

```bash
❯ leet puzzle longest_palindrome --inputs "bananas"
```

Output

```
Running puzzle: longest_palindrome
Results: anana
```
