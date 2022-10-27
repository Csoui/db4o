/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;
import Business.Order.OrderList;
import Business.DeliveryMan.DeliveryManDirectory;
/**
 *
 * @author harold
 */
public class RestaurantManager {
    
    String name;
    Menu menu;
    OrderList orderList;
    DeliveryManDirectory deliverymanDirectory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public OrderList getOrderList() {
        return orderList;
    }

    public void setOrderList(OrderList orderList) {
        this.orderList = orderList;
    }

    public DeliveryManDirectory getDeliverymanDirectory() {
        return deliverymanDirectory;
    }

    public void setDeliverymanDirectory(DeliveryManDirectory deliverymanDirectory) {
        this.deliverymanDirectory = deliverymanDirectory;
    }
    
    
    
    
    
    
    
    
}
