package com.sureeporn.kiosk;

import com.sureeporn.kiosk.model.Cart;
import com.sureeporn.kiosk.model.Category;
import com.sureeporn.kiosk.model.MenuItem;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CartTest {

    @Test
    void adds_and_sums() {
        MenuItem coffee = new MenuItem(
                "Coffee",
                new BigDecimal("3.00"),
                Category.DRINK
        );
        Cart c = new Cart();
        c.add(coffee, 2);
        assertEquals(new BigDecimal("6.00"), c.subtotal());
    }

    @Test
    void merge_same_item(){
        MenuItem tea = new MenuItem(
                "Tea",
                new BigDecimal("2.50"),
                Category.DRINK
        );
        Cart c = new Cart();
        c.add(tea, 1);
        c.add(tea, 2);
        assertEquals(1, c.items().size());
        assertEquals(3, c.items().get(0).getQuantity());
    }
}
