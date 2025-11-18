package com.sureeporn.kiosk;

import com.sureeporn.kiosk.model.*;
import com.sureeporn.kiosk.repo.SqliteReceiptRepository;
import com.sureeporn.kiosk.services.ReceiptService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.math.BigDecimal;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SqliteReceiptRepositoryTest {
    @TempDir
    Path temp;

    @Test
    void saves_receipt_and_returns_id() throws Exception {
        // Arrange
        Cart cart = new Cart();
        cart.add(new MenuItem("Coffee", new BigDecimal("3.00"), Category.DRINK), 2);
        ReceiptService svc = new ReceiptService(new FlatRateTaxCalculator(new BigDecimal("0.06")));

//        var repo = new SqliteReceiptRepository(temp.resolve("receipts.db"));
        var repo = new SqliteReceiptRepository(Path.of("target/Anna.db"));
        var saver = new ReceiptDbSaver(svc, repo);

        // Act
        long id = saver.renderAndSave(cart, "Alice");

        // Assert
        assertTrue(id > 0);
    }
}
