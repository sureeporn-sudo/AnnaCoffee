package com.sureeporn.kiosk.services;

import com.sureeporn.kiosk.model.MenuItem;

import java.util.EnumSet;
import java.util.List;

public class MenuFilters {
    public static <T extends Enum<T>> List<MenuItem<T>> filterByCategories(
            List<MenuItem<T>> items, EnumSet<T> allowed) {
        return items.stream().filter(mi -> allowed.contains(mi.getCategory())).toList();
    }
}
