package com.pascoe.leetcodeproblems.solutions.design.min_stack;

public class MinStackUsage {

  /**
   * https://leetcode.com/explore/featured/card/top-interview-questions-easy/98/design/562/
   *
   * <p>Design a stack that supports push, pop, top, and retrieving the minimum element in constant
   * time.
   *
   * <p>Implement the MinStack class:
   *
   * <p>MinStack() initializes the stack object. void push(val) pushes the element val onto the
   * stack. void pop() removes the element on the top of the stack. int top() gets the top element
   * of the stack. int getMin() retrieves the minimum element in the stack.
   */
  public static void main(String[] args) {
    MinStack minStack = new MinStack();
    minStack.push(98);
    minStack.push(3);
    minStack.push(100);
    minStack.push(1);
    minStack.push(234);
    minStack.push(12);
    minStack.push(4);

    System.out.println(minStack.pop());
    System.out.println(minStack.top());
    System.out.println(minStack.getMin());
  }
}
