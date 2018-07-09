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

    public CheckingAccount(String AccountNumber, String date, double Currency) {
        super(AccountNumber, date, Currency);
    }

    public double getOverdraftLimit() {
        return OverdraftLimit;
    }

    public void setOverdraftLimit(double OverdraftLimit) {
        this.OverdraftLimit = OverdraftLimit;
    }
    
}
