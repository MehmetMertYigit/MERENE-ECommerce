/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo2
 */
 public class CreditCard {
    private String cardHolder;
    private String cardNumber;
    private String cardUser;
    private String secCode;
    private String cardDate;
    
    // Constructor to initialize CreditCard object
    public CreditCard(String cardHolder, String cardNumber, String cardUser, String secCode, String cardDate) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.cardUser = cardUser;
        this.cardDate = cardDate;
        
        // Validate security code length
        if (secCode.length() == 3) {
            this.secCode = secCode;
        } else {
            System.out.println("Please enter a valid security number.");  
        }
    }
    
    // Getter for cardHolder
    public String getcardHolder() {
        return cardHolder;
    }

    // Setter for cardHolder
    public void setcardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }
    
    // Getter for cardNumber
    public String getcardNumber() {
        return cardNumber;
    }

    // Setter for cardNumber
    public void setcardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    // Getter for cardUser
    public String getcardUser() {
        return cardUser;
    }

    // Setter for cardUser
    public void setcardUser(String cardUser) {
        this.cardUser = cardUser;
    }
    
    // Getter for secCode
    public String getsecCode() {
        return secCode;
    }

    // Setter for secCode
    public void setsecCode(String secCode) {
        this.secCode = secCode;
    }
    
    // Getter for cardDate
    public String getcardDate() {
        return cardDate;
    }

    // Setter for cardDate
    public void setcardDate(String cardDate) {
        this.cardDate = cardDate;
    }
}

