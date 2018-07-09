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
public class SavingAccount extends Account{
    private double InterestRate;

    public SavingAccount(String AccountNumber, String date, double Currency) {
        super(AccountNumber, date, Currency);
    }
    private void ApplyInterest(){
        
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double InterestRate) {
        this.InterestRate = InterestRate;
    }
    
}
