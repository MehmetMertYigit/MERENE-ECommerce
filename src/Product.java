/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo2
 */
public class Product {
    private String pName;
    private String pColor;
    private String pCategory;   
    private int pStock;
    private float pWeight;
    private String pDescription;
    private int pPrice;
    
    // Constructor to initialize Product object
    public Product(String pName, String pColor, String pCategory, int pStock, 
    float pWeight, String pDescription, int pPrice) {
        
        this.pName = pName;
        this.pColor = pColor;
        this.pCategory = pCategory;
        this.pStock = pStock;
        this.pWeight = pWeight;
        this.pDescription = pDescription;
        this.pPrice = pPrice;
    }

    // Getter for pName
    public String getpName() {
        return pName;
    }

    // Setter for pName
    public void setpName(String pName) {
        this.pName = pName;
    }

    // Getter for pColor
    public String getpColor() {
        return pColor;
    }

    // Setter for pColor
    public void setpColor(String pColor) {
        this.pColor = pColor;
    }

    // Getter for pCategory
    public String getpCategory() {
        return pCategory;
    }

    // Setter for pCategory
    public void setpCategory(String pCategory) {
        this.pCategory = pCategory;
    }

    // Getter for pStock
    public int getpStock() {
        return pStock;
    }

    // Setter for pStock
    public void setpStock(int pStock) {
        this.pStock = pStock;
    }

    // Getter for pWeight
    public float getpWeight() {
        return pWeight;
    }

    // Setter for pWeight
    public void setpWeight(float pWeight) {
        this.pWeight = pWeight;
    }

    // Getter for pPrice
    public int getpPrice() {
        return pPrice;
    }

    // Setter for pPrice
    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    // Getter for pDescription
    public String getpDescription() {
        return pDescription;
    }

    // Setter for pDescription
    public void setpDescription(String pDescription) {
        this.pDescription = pDescription;
    }
    
    // Method to decrease stock by a given amount
    public void DecreaseStock(int amount) {
        if (this.pStock >= amount) {
            this.pStock -= amount;
        } else {
            System.out.println("Don't have enough product.");
        }
    }
}
