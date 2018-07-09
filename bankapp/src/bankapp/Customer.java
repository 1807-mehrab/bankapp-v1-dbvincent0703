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
public class Customer {
    private String id, firstName,lastName, DOB;
    private Address address; 
    private Account account;
    public Customer(String id, String firstName, String lastName, String DOB, Address address, Account account) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
        this.address = address;
        this.account = account;
    }
    @Override 
    public String toString(){
        String customer ="ID:"+getId()+ "\tF:"+getFirstName()+" L:"+getLastName()+"\tDOB:"+getDOB();
        return customer; 
    }
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
    
  
    
}
