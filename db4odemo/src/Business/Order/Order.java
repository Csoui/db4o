/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import Business.Customer.Customer;
import Business.Restaurant.Dish;
import java.util.ArrayList;

/**
 *
 * @author Mine
 */
public class Order {

        ArrayList<OrderItem> orderItemList;
    
    public Order(){
        this.orderItemList = new ArrayList<OrderItem>();

    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    public void addNewOrderItem(Dish dish, double price, int quantity){
        OrderItem orderItem = new OrderItem(dish,quantity);
        orderItemList.add(orderItem);       
    } 
    public void deleteItem(OrderItem item){
        this.orderItemList.remove(item);
    }
    
    public OrderItem findDish(Dish dish){
        for (OrderItem oi : this.getOrderItemList()){
            if (oi.getDish().equals(dish)){
                return oi;
            }
        }
        return null;
    }
    
}
