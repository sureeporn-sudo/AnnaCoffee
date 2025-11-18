# AnnaCoffee
A Java application that simulates a coffee shop ordering system. Built using Object-Oriented Programming principles, featuring class design for menu management, category handling, and order processing. Designed for learning and practicing clean code, encapsulation, and inheritance concepts.

## 🏠 Project Overview
AnnaCoffee is a Java console-based coffee shop ordering system built using Object-Oriented Programming (OOP) principles.  
It allows users to browse menu items, add them to a cart, calculate tax, and generate a receipt.

---

## 🧩 Main Components
### ✔ **`MenuItem` (record)**
Represents a single item in the menu (name, category, price).

### ✔ **`Cart` & `CartItem`**
Handles item selection, quantity updates, and subtotal calculations.

### ✔ **`Order` (record)**
Immutable model storing subtotal, tax, and total.

### ✔ **`FlatRateTaxCalculator`**
Applies a flat tax rate and calculates final totals.

### ✔ **Repositories**
- `FileReceiptRepository` → Saves receipts to text files  
- `SqliteReceiptRepository` → Saves receipts to SQLite database  
- `InMemoryCatalogRepository` → Demo menu data loaded in memory  

### ✔ **Services**
- `ReceiptService` → business logic for generating and saving receipts


## 🖥️ **User Interface**

### 💻 **CLI Application**
Located in:

com.sureeporn.kiosk.app.cli.Main

yaml
Copy code

Allows basic ordering from the terminal, adding items, viewing cart, and printing the receipt.

---

### 🪟 **GUI Application (Swing)**
Located in:

com.sureeporn.kiosk.app.GUI.MainGUI

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
