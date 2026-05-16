/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo2
 */
public class order { // Class name should be capitalized
    User user; // User associated with the order
    Product product; // Product being ordered
    CreditCard card; // Credit card used for the purchase
    
    // Constructor to initialize the order with user, product, and credit card
    order(User user, Product product, CreditCard card) {
        this.user = user;
        this.product = product;
        this.card = card;
    }

    // Getter for the user
    public User getUser() {
        return user;
    }

    // Setter for the user
    public void setUser(User user) {
        this.user = user;
    }

    // Getter for the product
    public Product getProduct() {
        return product;
    }

    // Setter for the product
    public void setProduct(Product product) {
        this.product = product;
    }

    // Getter for the credit card
    public CreditCard getCard() {
        return card;
    }

    // Setter for the credit card
    public void setCard(CreditCard card) {
        this.card = card;
    }
    
    // Method to control the stock of the product
    public boolean ControlStock() {
        if (product.getpStock() > 0) { // Check if the product is in stock
            product.DecreaseStock(1); // Decrease the stock by 1
            return true; // Return true if the product is available
        } else {
            System.out.println("Product out of stock."); // Print out of stock message
            return false; // Return false if the product is not available
        }
    }           
    
    // Method to process the purchase of the product
    public void BuyProduct() {
        user.PurchaseProduct(product); // User purchases the product
    }
}
