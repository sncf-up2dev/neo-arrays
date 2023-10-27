package fr.sncf.up2dev.arrays;

import java.util.Arrays;

public class OrderedArray<E extends Comparable<E>> extends ImmutableArray<E> {
    public OrderedArray(E[] elements) {
        super(elements);
        Arrays.sort(this.elements);
    }
}
