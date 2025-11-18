# AnnaCoffee
A Java application that simulates a coffee shop ordering system. Built using Object-Oriented Programming principles, featuring class design for menu management, category handling, and order processing. Designed for learning and practicing clean code, encapsulation, and inheritance concepts.

## 🏠 Project Overview
AnnaCoffee is a Java console-based coffee shop ordering system built using Object-Oriented Programming (OOP) principles.  
It allows users to browse menu items, add them to a cart, calculate tax, and generate a receipt.

---

## 🧩 Main Components
### ✔ **Domain Models (Records & Classes)**
- `MenuItem (record)` → Immutable item (name, category, price)  
- `Cart & CartItem` → Track items and quantities  
- `Order (record)` → Finalized order with totals  
- `FlatRateTaxCalculator` → Applies fixed-rate tax  
- `Category / BeverageCategory / FoodCategory` → Classify items  
- `ReceiptSaver / ReceiptDbSaver` → Prepare receipt output structures  

### ✔ **`Interfaces`**
- `CatalogRepository` → Provides menu items (categories, beverages, food).  
- `ReceiptRepository` → Abstraction for saving receipts (file system, in-memory, etc.).
- `ReceiptDbRepository` → Defines how receipts are saved to a database (SQLite implementation).
- `TaxCalculator` → General contract for any tax calculation strategy  
(implemented by **FlatRateTaxCalculator**).

### ✔ **Repositories**
- `FileReceiptRepository` → Saves receipts to text files  
- `SqliteReceiptRepository` → Saves receipts to SQLite database  
- `InMemoryCatalogRepository` → Demo menu data loaded in memory  

### ✔ **Services**
- `ReceiptService` → Business logic for generating and saving receipts
- `MenuFilters` → Utility service for filtering menu items by category or name.


## 🖥️ **User Interface**

### 💻 **CLI Application**
Located in: com.sureeporn.kiosk.app.cli.Main

Allows basic ordering from the terminal, adding items, viewing cart, and printing the receipt.

---

### 🪟 **GUI Application (Swing)**
Located in: com.sureeporn.kiosk.app.GUI.MainGUI

A UI skeleton using:
- `MainFrame`
- `CartTableModel`

Displays menu, cart table, totals, and basic buttons (skeleton only).

## 🛠️ **How to Build**

This is a **Maven project**.

```bash
mvn clean install
 ```
For compilation only:

```bash
mvn compile
 ```

Run the CLI:
   ```bash
mvn exec:java -Dexec.mainClass="com.sureeporn.kiosk.app.cli.Main"
 ```

Run the GUI:
   ```bash
mvn exec:java -Dexec.mainClass="com.sureeporn.kiosk.app.GUI.MainGUI"
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

## 🛠️ Required Configuration
**SQLite Database**

The schema is located at:
```bash
src/main/resources/schema.sql
```

The SQLite DB file is managed by SqliteReceiptRepository.
No additional configuration is required.

**File Output**

File-based receipts are created by:
```ba
FileReceiptRepository
```


Developed by Sureeporn Apaikawee
for CCTB - Software Quality Assurance / Java OOP Project
