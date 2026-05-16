# MERENE - Luxury Motorcycle E-Commerce Application 🏍️

MERENE is a desktop e-commerce application developed in Java, specifically designed for exploring and purchasing luxury motorcycles. The project demonstrates core Object-Oriented Programming (OOP) concepts, robust GUI design using Java Swing, and strict data encapsulation policies.

---

## 🚀 Key Features

* **User Management:** Secure user registration and login workflows with data persistence across forms.
* **Encapsulation & Validation:** Advanced input checking (e.g., credit card security code length verification) and robust setter/getter mechanisms.
* **Dynamic Inventory System:** Automated stock management that handles successful purchases, tracking items, and reducing stock efficiently.
* **User Interface:** User-friendly navigation built with custom Java Swing components, featuring a smooth window fade-in effect on startup.

---

## 📐 Architecture & OOP Principles

This project leverages a well-structured Model-View architecture to decouple business logic from UI elements:

* **Encapsulated Skeletons:** Data parameters are kept inside highly encapsulated entities like `User`, `Product`, `Order`, and `CreditCard`.
* **Dynamic Associations:** The `Order` entity forms a bridge by utilizing instances of `User`, `Product`, and `CreditCard` simultaneously to mimic real-world transaction management.
* **Collections Framework:** Leveraged `ArrayList` mechanisms to track user properties like ordered products, favorite items, and credit cards.

### Class Architecture Diagram

```text
       +------------------+          +-------------------+
       |       User       |          |      Product      |
       +------------------+          +-------------------+
       | - userName       |          | - pName           |
       | - productOrdered |<-------->| - pStock          |
       | - creditCard     |          | - pPrice          |
       +------------------+          +-------------------+
                 |                             ^
                 |      +---------------+      |
                 +----->|     Order     |------+
                        +---------------+
                        | +ControlStock |
                        | +BuyProduct   |
                        +---------------+
```

## 💻 Tech Stack & Tools
- Language: Java (JDK 8 or higher)

- GUI Framework: Java Swing / AWT

- IDE: NetBeans IDE

## ⚙️ Installation & Running the App
1. Clone this repository to your local machine:

git clone [https://github.com/MehmetMertYigit/MERENE-ECommerce.git](https://github.com/MehmetMertYigit/MERENE-ECommerce.git)

2. Open the project inside NetBeans IDE.

3. Clean and build the project to settle dependencies.

4. Run the LoginForm.java to start the application.
