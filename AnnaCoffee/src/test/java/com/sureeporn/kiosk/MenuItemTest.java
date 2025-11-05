package com.sureeporn.kiosk;

import com.sureeporn.kiosk.model.BeverageCategory;
import com.sureeporn.kiosk.model.FoodCategory;
import com.sureeporn.kiosk.model.MenuItem;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class MenuItemTest {

    @Test
    void createsWithFoodCategory() {
        var m = new MenuItem<>("Fries", new BigDecimal("3.50"), FoodCategory.SIDE);
        assertEquals(FoodCategory.SIDE, m.getCategory());
    }

    @ParameterizedTest
    @EnumSource(BeverageCategory.class)
    void parameterizedAcrossBeverageEnum(BeverageCategory cat) {
        var drink = new MenuItem<>("Water", new BigDecimal("1.00"), cat);
        assertSame(cat, drink.getCategory());
    }

    @Test
    void rejectsNegativePrice() {
        assertThrows(IllegalArgumentException.class,
                () -> new MenuItem<>("X", new BigDecimal("-1"), FoodCategory.MAIN));
    }
}
