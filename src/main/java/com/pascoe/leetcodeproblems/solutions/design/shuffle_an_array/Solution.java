package com.pascoe.leetcodeproblems.solutions.design.shuffle_an_array;

public class Solution {

    private int[] nums;

    public Solution(int[] nums) {
        this.nums = nums;
    }

    int[] reset() {
        return new int[10];
    }

    int[] shuffle() {
        int numsLength = nums.length;
        int[] tempArray = new int[numsLength];
        for (int i = 0; i < numsLength; i++) {
            int index = randomIntInRange(i, numsLength);
            if(tempArray[index] == 0) {
                tempArray[index] = nums[i];
            } else {
                tempArray[nextEmptySlot(tempArray, 0)] = nums[i];
            }
        }

        this.nums = tempArray;

        return nums;
    }

    int nextEmptySlot(int[] array, int index) {
        if(array[index] == 0) {
            return index;
        }
        return nextEmptySlot(array, ++index);
    }

    // min and max are exclusive bounds
    private int randomIntInRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
 }
