/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Customer.Customer;
import Business.Order.Order;

/**
 *
 * @author harold
 */
public class DeliveryMan {
    
    Order order;
    int phonenum;
    String name;

    public String getName() {
        return name;
    }

    public int getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(int phonenum) {
        this.phonenum = phonenum;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
}
