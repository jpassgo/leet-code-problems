package com.pascoe.leetcodeproblems.solutions.design.shuffle_an_array;

public class ShuffleAnArray {

  /**
   * https://leetcode.com/explore/featured/card/top-interview-questions-easy/98/design/670/
   *
   * <p>Given an integer array nums, design an algorithm to randomly shuffle the array. All
   * permutations of the array should be equally likely as a result of the shuffling.
   *
   * <p>Implement the Solution class:
   *
   * <p>Solution(int[] nums) Initializes the object with the integer array nums. int[] reset()
   * Resets the array to its original configuration and returns it. int[] shuffle() Returns a random
   * shuffling of the array.
   */

  public static void main(String[] args) {
    int[] ints = {1, 2, 3, 4, 5};
    var solution = new Solution(ints);

    int[] shuffle = solution.shuffle();
    for (int i = 0; i < shuffle.length; i++) {
      System.out.print(shuffle[i] + " ");
    }
  }
}
