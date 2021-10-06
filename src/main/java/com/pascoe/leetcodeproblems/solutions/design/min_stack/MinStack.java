package com.pascoe.leetcodeproblems.solutions.design.min_stack;

import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MinStack<T extends Comparable> {

  /** Keep track of min stack as you add elements. */
  private List<T> stack;

  private T currentMinElement;

  public MinStack() {
    this.stack = new ArrayList();
  }

  public void push(T value) {
    if (currentMinElement == null) {
      currentMinElement = value;
    } else if (value.compareTo(currentMinElement) < 0) {
      currentMinElement = value;
    }
    stack.add(value);
  }

  public T pop() {
    T t = stack.get(stack.size() - 1);
    stack.remove(t);
    return t;
  }

  public T top() {
    return stack.get(stack.size() - 1);
  }

  public T getMin() {
    return currentMinElement;
  }
}
