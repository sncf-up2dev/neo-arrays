package fr.sncf.up2dev.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OrderedArrayTest {

    @Test
    public void test_empty_array() {
        OrderedArray<String> empty = new OrderedArray<>(new String[0]);
        Assertions.assertEquals(0, empty.length());
    }

    @Test
    public void test_non_empty_array() {
        OrderedArray<String> OrderedArray = new OrderedArray<>(new String[] { "one", "two", "three" });
        Assertions.assertEquals(3, OrderedArray.length());
    }

    @Test
    public void test_get() {
        OrderedArray<String> OrderedArray = new OrderedArray<>(new String[] { "one", "two", "three" });
        Assertions.assertEquals("three", OrderedArray.get(1));
    }

    @Test
    public void test_immutability() {
        String[] strings = { "one", "two", "three" };
        OrderedArray<String> OrderedArray = new OrderedArray<>(strings);
        strings[1] = "deux";
        Assertions.assertEquals("three", OrderedArray.get(1));
    }
}