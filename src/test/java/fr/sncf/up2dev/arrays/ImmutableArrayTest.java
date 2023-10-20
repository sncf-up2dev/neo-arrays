package fr.sncf.up2dev.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ImmutableArrayTest {

    @Test
    public void test_empty_array() {
        ImmutableArray<Void> empty = new ImmutableArray<>(new Void[0]);
        Assertions.assertEquals(0, empty.length());
    }

    @Test
    public void test_non_empty_array() {
        ImmutableArray<String> immutableArray = new ImmutableArray<>(new String[] { "one", "two", "three" });
        Assertions.assertEquals(3, immutableArray.length());
    }

    @Test
    public void test_get() {
        ImmutableArray<String> immutableArray = new ImmutableArray<>(new String[] { "one", "two", "three" });
        Assertions.assertEquals("two", immutableArray.get(1));
    }

    @Test
    public void test_immutability() {
        String[] strings = { "one", "two", "three" };
        var immutableArray = new ImmutableArray<>(strings);
        strings[1] = "deux";
        Assertions.assertEquals("two", immutableArray.get(1));
    }
}