package fr.sncf.up2dev.arrays;

public class ImmutableArray<E> {
    protected final E[] elements;

    public ImmutableArray(E[] elements) {
        this.elements = elements.clone();
    }

    public E get(int position) {
        return this.elements[position];
    }

    public int length() {
        return this.elements.length;
    }
}
