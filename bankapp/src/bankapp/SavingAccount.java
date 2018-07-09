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

    public SavingAccount(String AccountNumber, String date, double Currency, double fees, double InterestRate) {
        super(AccountNumber, date, Currency, fees);
        this.InterestRate = InterestRate; 
    }
        @Override
    public String toString(){
           String account = "Account type: Saving\t Account#: "+getAccountNumber()+"\t"+"Balance: $"+getCurrency() +"\t"+"Monthly fees: $"+getFees() +"\tInterest rate= "+ Double.toString(InterestRate)+" %";
        return account;
    }
    private void ApplyInterest(){
        setCurrency(getCurrency()*InterestRate + getCurrency()); //After a year will apply this method to the saving account. 
    }

    public double getInterestRate() {
        return InterestRate;
    }

    public void setInterestRate(double InterestRate) {
        this.InterestRate = InterestRate;
    }
    
}
