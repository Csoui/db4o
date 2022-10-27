/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author Mine
 */
public class OrderList {
    
    ArrayList<Order> OrderList;

    public ArrayList<Order> getOrderList() {
        return OrderList;
    }

    public void setOrderList(ArrayList<Order> OrderList) {
        this.OrderList = OrderList;
    }
    
    public Order addNewOrder() {
        Order newOrder = new Order();
        OrderList.add(newOrder);
        return newOrder;
    }
    public void removePerson(Order o) {
        OrderList.remove(o);
    }
    
}
