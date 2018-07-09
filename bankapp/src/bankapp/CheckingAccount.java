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
public class CheckingAccount extends Account{
    private double OverdraftLimit; 

    public CheckingAccount(String AccountNumber, String date, double Currency, double fees, double overdraftLimit) {
        super(AccountNumber, date, Currency, fees);
       this. OverdraftLimit = overdraftLimit;
    }
    @Override
    public String toString(){
           String account = "Account type: Checking\t Account#: "+getAccountNumber()+"\t"+"Balance: $"+getCurrency() +"\t"+"Monthly fees: $"+getFees() +"\t"+"Overdraft Limit = $"+Double.toString(OverdraftLimit);
        return account;
    }
    public double getOverdraftLimit() {
        return OverdraftLimit;
    }

    public void setOverdraftLimit(double OverdraftLimit) {
        this.OverdraftLimit = OverdraftLimit;
    }
    
}
