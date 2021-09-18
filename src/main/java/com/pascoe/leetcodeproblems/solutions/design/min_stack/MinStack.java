package com.pascoe.leetcodeproblems.solutions.design.min_stack;

public class MinStack<T extends Comparable> {

    /**
     *
     * Internally implement the stack as a min heap. For each node associate a value and a key that represents the
     * node's place within the virtual stack.
     *
     */
    private T[] heap;

    class Node<T extends Comparable> {
        private T val;
        private int position;

        public Node(T val, int position) {
            this.val = val;
            this.position = position;
        }

        public T getVal() {
            return val;
        }

        public void setVal(T val) {
            this.val = val;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }
    }

    public void push(T value) {
        for (int i = 0; i < ; i++) {
            
        }
    }
}
