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
    private double Currency, fees;

    public Account(String AccountNumber, String date, double Currency, double fees) {
        this.AccountNumber = AccountNumber;
        this.date = date;
        this.Currency = Currency;
        this.fees = fees;
    }
    @Override
    public String toString(){
        String account = "Account type: Account\tAccount#: "+getAccountNumber()+"\t"+"Balance: $"+getCurrency() +"\t"+"Monthly fees: $"+getFees();
        return account;
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

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }
    
   public void makeDeposit(double deposit){
       double d = deposit + getCurrency();
       setCurrency(d);
       System.out.println("New Balance = "+ getCurrency());
   }
   public void makeWithdrawal(double withdrawal){
       double w = withdrawal+ getCurrency();
       setCurrency(w);
       System.out.println("New Balance = "+ getCurrency());
   }
   public void changeFees(double newFees){
       setFees(newFees);
       System.out.println("The new fees is $"+getFees());
   }
}
