package Pair;

import java.util.ArrayList;
import java.util.Collections;

/**
 * You need to store two values of type `E`, set them in a constructor, and have the following methods,
 * getFirst
 * getSecond
 * min -> returns the minimum of the pair
 * max -> returns the maximum of the pair
 */
public class Pair<E extends Comparable> {

    private E first;
    private E second;

    public Pair(E thing1, E thing2) {
        this.first = thing1;
        this.second = thing2;
    }

    public E getFirst() {
        return this.first;
    }

    public E getSecond() {
        return this.second;
    }

    public E min() {
        if (first.compareTo(second) < 0) {
            return first;
        } else {
            return second;
        }
    }

    public E max() {
        if (first.compareTo(second) > 0) {
            return first;
        } else{
            return second;
        }
    }


}
