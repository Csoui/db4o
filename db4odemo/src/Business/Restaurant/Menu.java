/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author Mine
 */
public class Menu {
    
    private ArrayList<Dish> Menu;

    public ArrayList<Dish> getMenu() {
        return Menu;
    }

    public void setMenu(ArrayList<Dish> Menu) {
        this.Menu = Menu;
    }
    
    public Dish addDish(){
        Dish newdish = new Dish();
        Menu.add(newdish);
        return newdish;
    }
    public void removeDish(Dish d){
        Menu.remove(d);
    }
    
}
