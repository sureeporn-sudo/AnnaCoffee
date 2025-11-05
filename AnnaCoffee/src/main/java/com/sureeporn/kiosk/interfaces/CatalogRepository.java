package com.sureeporn.kiosk.interfaces;

import com.sureeporn.kiosk.model.MenuItem;
import com.sureeporn.kiosk.model.Category;
import java.util.List;

public interface CatalogRepository {
    List<MenuItem> all();
    List<MenuItem> byCategory(Category category);
}
