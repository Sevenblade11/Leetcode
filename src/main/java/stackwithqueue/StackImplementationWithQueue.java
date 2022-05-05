package stackwithqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Status: Accepted
 *
 * 0ms 100% faster | 41.6 mb less than 58.55% of Java submissions on 5/5    /2022
 *
 * Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).
 *
 * Implement the MyStack class:
 *
 * void push(int x) Pushes element x to the top of the stack.
 * int pop() Removes the element on the top of the stack and returns it.
 * int top() Returns the element on the top of the stack.
 * boolean empty() Returns true if the stack is empty, false otherwise.
 */
public class StackImplementationWithQueue {
    private Queue<Integer> q;

    public StackImplementationWithQueue() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        q.add(x);
        for(int i = 1; i < q.size(); i ++)
            q.add(q.poll());
    }

    public int pop() {
       return q.poll();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
