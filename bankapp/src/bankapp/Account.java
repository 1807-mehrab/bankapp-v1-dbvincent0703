/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankapp;

/**
 *
 * @author vb
 */
public class Account {
    private String AccountNumber,date;
    private double Currency;

    public Account(String AccountNumber, String date, double Currency) {
        this.AccountNumber = AccountNumber;
        this.date = date;
        this.Currency = Currency;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String AccountNumber) {
        this.AccountNumber = AccountNumber;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getCurrency() {
        return Currency;
    }

    public void setCurrency(double Currency) {
        this.Currency = Currency;
    }
    
   public void makeDeposit(){
       
   }
   public void makeWithdrawal(){
       
   }
   public void changeFees(){
       
   }
}
