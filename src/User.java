/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo2
 */

import java.util.ArrayList;
import java.util.ArrayList;

public class User {
    // Private variables for user information
    private String userName;  // User's username
    private String name;      // User's first name
    private String surname;   // User's last name
    private String bDay;      // User's birth date
    private String password;  // User's password
    private String eMail;     // User's email address
    private String homeAdress;// User's home address
    private String workAdress;// User's work address
    private ArrayList<Product> productOrdered = new ArrayList<Product>();   // List of products ordered by the user
    private ArrayList<Product> favProducts = new ArrayList<Product>();      // List of user's favorite products
    private ArrayList<CreditCard> credıtCard = new ArrayList<CreditCard>(); // List of user's credit cards

    // Constructors with and without parameters
    public User() {
        // Parameterless constructor
    }
    
    public User(String userName, String name, String surname, String bDay, String password, String eMail, String homeAdress, String workAdress) {
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.bDay = bDay;
        this.password = password;
        this.eMail = eMail;
        this.homeAdress = homeAdress;
        this.workAdress = workAdress;
    }
    
    // Getter and setter methods
    public String getuserName() {
        return userName;    // Returns the user's username
    }

    public void setuserName(String userName) {
        this.userName = userName;   // Sets the user's username
    }

    public String getname() {
        return name;    // Returns the user's first name
    }

    public void setname(String name) {
        this.name = name;   // Sets the user's first name
    }

    public String getsurname() {
        return surname;    // Returns the user's last name
    }

    public void setsurname(String surname) {
        this.surname = surname;   // Sets the user's last name
    }

    public String getbDay() {
        return bDay;    // Returns the user's birth date
    }

    public void setbDay(String bDay) {
        this.bDay = bDay;   // Sets the user's birth date
    }

    public String getpassword() {
        return password;    // Returns the user's password
    }

    public void setpassword(String password) {
        this.password = password;   // Sets the user's password
    }

    public String geteMail() {
        return eMail;    // Returns the user's email address
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;   // Sets the user's email address
    }

    public String gethomeAdress() {
        return homeAdress;    // Returns the user's home address
    }

    public void sethomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;   // Sets the user's home address
    }

    public String getworkAdress() {
        return workAdress;    // Returns the user's work address
    }

    public void setworkAdress(String workAdress) {
        this.workAdress = workAdress;   // Sets the user's work address
    }

    public ArrayList<Product> getproductOrdered() {
        return productOrdered;    // Returns the list of products ordered by the user
    }

    public void setproductOrdered(ArrayList<Product> productOrdered) {
        this.productOrdered = productOrdered;   // Sets the list of products ordered by the user
    }

    public ArrayList<Product> getfavProducts() {
        return favProducts;    // Returns the user's favorite products list
    }

    public void setfavProducts(ArrayList<Product> favProducts) {
        this.favProducts = favProducts;   // Sets the user's favorite products list
    }

    public ArrayList<CreditCard> getCredtCard() {
        return credıtCard;    // Returns the user's credit cards list
    }

    public void setCredıtCard(ArrayList<CreditCard> credıtcard) {
        this.credıtCard = credıtcard;   // Sets the user's credit cards list
    }

    // Method to add a credit card
    public void AddCredıtCard(CreditCard card) {
        this.credıtCard.add(card);   // Adds a new card to the user's credit cards list
    }

    // Method to add a favorite product
    public void FavoriteProduct(Product product) {
        favProducts.add(product);   // Adds a new product to the user's favorite products list
    }

    // Method to purchase a product
    public void PurchaseProduct(Product product) {
        productOrdered.add(product);   // Adds a new product to the list of products ordered by the user
    }
}
