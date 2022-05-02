package peekingiterator;

import java.util.Iterator;

/**
 * Status: Accepted
 *
 * 6ms 60.82% faster | 43 mb less than 41.60% of Java submissions on 5/2/2022
 *
 * Design an iterator that supports the peek operation on an existing iterator in addition
 * to the hasNext and the next operations.
 *
 * Implement the PeekingIterator class:
 *
 * PeekingIterator(Iterator<int> nums) Initializes the object with the given integer iterator.
 * int next() Returns the next element in the array and moves the pointer to the next element.
 * boolean hasNext() Returns true if there are still elements in the array.
 * int peek() Returns the next element in the array without moving the pointer.
 * Note: Each language may have a different implementation of the constructor and Iterator,
 * but they all support the int next() and boolean hasNext() functions.
 */
public class PeekingIterator implements Iterator<Integer>{
        Object peekObj;
        Iterator iterator;

        public PeekingIterator(Iterator<Integer> iterator) {
            // initialize any member here.
            this.iterator = iterator;
            peekObj = null;
        }

        // Returns the next element in the iteration without advancing the iterator.
        public Integer peek() {
            if(iterator.hasNext())
                if(peekObj == null)
                    peekObj = iterator.next();
            return (int) peekObj;
        }

        // hasNext() and next() should behave the same as in the Iterator interface.
        // Override them if needed.
        @Override
        public Integer next() {
            Object temp = peekObj;
            if(peekObj != null){
                peekObj = null;
                return (int) temp;
            }
            else if(iterator.hasNext())
                return (int) iterator.next();
            return null;
        }

        @Override
        public boolean hasNext() {
            if(peekObj != null)
                return true;
            return iterator.hasNext();
        }
}
