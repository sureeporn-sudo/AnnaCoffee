package com.sureeporn.kiosk;

import com.sureeporn.kiosk.model.*;
import com.sureeporn.kiosk.repo.FileReceiptRepository;
import com.sureeporn.kiosk.services.ReceiptService;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReceiptFileTests {
    @Test
    void writes_receipt_file() throws Exception {
        var cart = new Cart();
        cart.add(new MenuItem("Coffee", new BigDecimal("3.00"), Category.DRINK), 2);

        var Tax = new FlatRateTaxCalculator(new BigDecimal(0.06));

        var svc = new ReceiptService(new BigDecimal("0.00")::add);

        var lines = svc.render(cart);

        Path temp = Files.createTempDirectory("receipts_test");
        var saver = new ReceiptSaver(svc, new FileReceiptRepository(temp));

        var dir = Path.of("C:\\Users\\golkhandani\\Desktop\\Fall2025\\SQA109\\TestDemo");

        Path p = saver.renderAndSave(cart);
        assertTrue(Files.exists(p));
        assertTrue(Files.size(p) > 0);

        var r = new FileReader(p.toFile());
        var br = new BufferedReader(r);

        String line = br.readLine();
        int counter = 0;
        while (line != null) {
            assertEquals(lines.get(counter), line);
            line = br.readLine();
            counter++;
        }
        br.close();
        r.close();
    }
    }
