/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.RestaurantManagerDirectory;
import Business.Role.AdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;


/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantManagerDirectory restaurantManagerDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;

  
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }

    public ArrayList<Role> getSupportedRole(){
        ArrayList<Role> roleList = new ArrayList<Role>();
        roleList.add(new AdminRole());
        return roleList;
        
    }
    
    private EcoSystem(){
        super(null);
        this.restaurantManagerDirectory = new RestaurantManagerDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.deliveryManDirectory = new DeliveryManDirectory();
    }



    public RestaurantManagerDirectory getRestaurantManagerDirectory() {
        return restaurantManagerDirectory;
    }

    public void setRestaurantManagerDirectory(RestaurantManagerDirectory restaurantManagerDirectory) {
        this.restaurantManagerDirectory = restaurantManagerDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
