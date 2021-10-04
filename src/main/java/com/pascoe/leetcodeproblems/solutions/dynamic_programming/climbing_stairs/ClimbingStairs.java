package com.pascoe.leetcodeproblems.solutions.dynamic_programming.climbing_stairs;

import java.util.ArrayList;
import java.util.Optional;

public class ClimbingStairs {

    /**
     *
     * https://leetcode.com/explore/featured/card/top-interview-questions-easy/97/dynamic-programming/569/
     *
     * You are climbing a staircase. It takes n steps to reach the top.
     *
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     *
     * @param args
     */

  public static void main(String[] args) {
      System.out.println(waysToClimbNStairs(1));
      System.out.println(waysToClimbNStairs(2));
      System.out.println(waysToClimbNStairs(3));
      System.out.println(waysToClimbNStairs(4));
      System.out.println(waysToClimbNStairs(5));
  }

  public static int waysToClimbNStairs(int numberOfStairs) {

      return waysToClimbNStairs(numberOfStairs, new Integer[100]);
  }

  private static Integer waysToClimbNStairs( int index, Integer[] memo) {
      if(index == 1 || index == 2 || index == 3) {
          return index;
      }

      if(isValueMemoized(memo, index)) {
          return memo[index];
      } else {
          memo[index] = waysToClimbNStairs(index -1, memo) +  waysToClimbNStairs(index - 2, memo);
      }
      return memo[index];
  }

    private static boolean isValueMemoized(Integer[] memo, Integer index) {
        try {
            if(memo[index] != null) return true;
        } catch(Exception e) {
            return false;
        }
        return false;
    }
}
