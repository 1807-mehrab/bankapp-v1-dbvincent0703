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
public class Bankapp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Arlington Virtue Bank\n");
        Address address1 = new Address("123 Fake Lane", "Fort Worth", "76112", "United States");
        Account mike1 = new Account("12345678910", "01/01/2018", 10000.00, 25.00);       
        Customer mike = new Customer("1", "Mike", "Johnson", "01/01/1111",address1, mike1);
        System.out.println(mike);
        System.out.println(mike1);
        System.out.println(address1);
        System.out.println("\n\n");
        
        Address address2 = new Address("321 Disney Lane", "Arlington", "76019", "United States");
        CheckingAccount Beth1 = new CheckingAccount("12222222", "01/01/2018", 25000.00, 25.00, 50.00);       
        Customer Beth = new Customer("2", "Beth", "Thomson", "02/02/2222",address2, Beth1);
        System.out.println(Beth);
        System.out.println(Beth1);
        System.out.println(address2);
         System.out.println("\n\n");
        Address address3 = new Address("785 Road Lane", "Arlington", "76019", "United States");
        SavingAccount Tom1 = new SavingAccount("333333333", "01/01/2017", 30000.00, 25.00, 0.18);       
        Customer Tom = new Customer("3", "Tom", "Thomson", "02/02/2222",address3, Tom1);
        System.out.println(Tom);
        System.out.println(Tom1);
        System.out.println(address3);
    }
    
}
