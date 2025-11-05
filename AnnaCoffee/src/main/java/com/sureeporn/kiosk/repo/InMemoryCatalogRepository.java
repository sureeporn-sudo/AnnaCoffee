package com.sureeporn.kiosk.repo;

import com.sureeporn.kiosk.interfaces.CatalogRepository;
import com.sureeporn.kiosk.model.BeverageCategory;
import com.sureeporn.kiosk.model.FoodCategory;
import com.sureeporn.kiosk.model.MenuItem;
import com.sureeporn.kiosk.model.Category;

import java.math.BigDecimal;
import java.util.List;

public class InMemoryCatalogRepository implements CatalogRepository {
    private final List<MenuItem> data = List.of(
            new MenuItem("Americano", new BigDecimal("3.50"), Category.DRINK),
            new MenuItem("Latte", new BigDecimal("4.20"), Category.DRINK),
            new MenuItem("Croissant", new BigDecimal("4.25"), Category.BAKERY),
            new MenuItem<>("Burger", new BigDecimal("9.99"), FoodCategory.MAIN),
            new MenuItem<>("Latte", new BigDecimal("4.20"), BeverageCategory.HOT),
            new MenuItem("Tea", new BigDecimal("2.50"), Category.DRINK)
    );
    @Override public List<MenuItem> all(){ return data; }
    @Override
    public List<MenuItem> byCategory(Category c) {
        return data.stream().filter(mi -> mi.getCategory()==c).toList(); }
}
