# AnnaCoffee
A Java application that simulates a coffee shop ordering system. Built using Object-Oriented Programming principles, featuring class design for menu management, category handling, and order processing. Designed for learning and practicing clean code, encapsulation, and inheritance concepts.

## 🏠 Project Overview
AnnaCoffee is a Java console-based coffee shop ordering system built using Object-Oriented Programming (OOP) principles.  
It allows users to browse menu items, add them to a cart, calculate tax, and generate a receipt.

---

## 🧩 Main Components
MenuItem (record)
Represents a single menu item (name, category, price).

Category / BeverageCategory / FoodCategory
Encapsulate grouping of menu items.

Cart & CartItem
Store selected items and quantities, and provide methods to calculate subtotal.

FlatRateTaxCalculator
Applies a flat tax rate to the cart total.

Order (record)
Represents a finalized order including items, subtotal, tax, and total.

ReceiptSaver & ReceiptDbSaver (interfaces)
Abstractions defining how a receipt is persisted.

Repositories

FileReceiptRepository: saves receipts to a file

SqliteReceiptRepository: saves receipts to a SQLite database

InMemoryCatalogRepository: provides menu items from in-memory data

ReceiptService
High-level service coordinating cart, tax calculation, order creation, and saving the receipt via a chosen repository.

UI components

CLI (com.sureeporn.kiosk.app.cli.Main)
Simple command-line interface allowing basic ordering flow.

Swing UI (MainGUI / MainFrame and CartTableModel)
A minimal graphical UI skeleton that shows menu items, the cart, and totals.

---

## ⚙️ Build & Run Instructions
1. Clone the repository:
   ```bash
   git clone https://github.com/sureeporn-sudo/AnnaCoffee.git
   cd AnnaCoffee
   mvn clean compile exec:java
   ```
## 🧪 Running Tests
To run automated tests:
```bash
mvn test
```

The test suite includes:

CartTest – verifies cart behavior, subtotal, and quantity updates.

MenuItemTest – checks record creation and basic invariants.

OrderTests – validates order totals and tax calculations.

ReceiptFileTests – ensures receipts are correctly saved to files.

ReceiptServiceTest – integration-style tests for the main service.

SqliteReceiptRepositoryTest – tests SQLite persistence using schema.sql.


Developed by Sureeporn Apaikawee
for CCTB - Software Quality Assurance / Java OOP Project
