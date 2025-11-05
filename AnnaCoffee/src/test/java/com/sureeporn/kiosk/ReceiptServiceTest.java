package com.sureeporn.kiosk;

import com.sureeporn.kiosk.model.Cart;
import com.sureeporn.kiosk.model.FlatRateTaxCalculator;
import com.sureeporn.kiosk.repo.InMemoryCatalogRepository;
import com.sureeporn.kiosk.services.ReceiptService;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReceiptServiceTest {
    @Test
    void totals_and_tax(){
        var repo = new InMemoryCatalogRepository();
        var cart = new Cart();

        cart.add(repo.all().get(0), 2); // coffee
        var svc = new ReceiptService(new FlatRateTaxCalculator(new BigDecimal("0.06")));
        var lines = svc.render(cart);
        assertTrue(lines.get(lines.size() - 1).contains("Total:"));
    }
}
