package org.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ShopTest {

    @Test
    public void getAllEmpty() {
        Shop shop = new Shop();
        int actual = shop.countItems();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void addNull() {
        Shop shop = new Shop();
        Assertions.assertThrows(NullPointerException.class, () -> shop.add(null, 12, 0.9));

    }

    @Test
    @Disabled
    public void addTest() {
        Shop shop = new Shop();
        shop.add("водка", 500, 0.75);
        int actualSize = shop.countItems();
        int expectedSize = 40;
        Assertions.assertEquals(expectedSize, actualSize);
    }

}
