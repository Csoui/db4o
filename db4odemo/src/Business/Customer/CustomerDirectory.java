/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerList = new ArrayList();
    
    public  ArrayList<Customer> CustomerDirectory(){
        return customerList;
    }
    
    
    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer() { 
        Customer newCustomer = new Customer();
        customerList.add(newCustomer);
        return newCustomer;
    }
    public void removeCustomer(Customer c) {
        customerList.remove(c);
    }
}
