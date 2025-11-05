# AnnaCoffee
A Java application that simulates a coffee shop ordering system. Built using Object-Oriented Programming principles, featuring class design for menu management, category handling, and order processing. Designed for learning and practicing clean code, encapsulation, and inheritance concepts.

## 🏠 Project Overview
AnnaCoffee is a Java console-based coffee shop ordering system built using Object-Oriented Programming (OOP) principles.  
It allows users to browse menu items, add them to a cart, calculate tax, and generate a receipt.

---

## 🧩 Main Components
- **MenuItem / Category** – defines products and their properties.  
- **Cart / CartItem** – handles order management and totals.  
- **FlatRateTaxCalculator** – applies tax rate to subtotal.  
- **ReceiptSaver / ReceiptRepository** – handles file saving for receipts.  
- **ReceiptFileTests** – automated test verifying receipt generation.

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

Developed by Sureeporn Apaikawee
for CCTB - Software Quality Assurance / Java OOP Project
