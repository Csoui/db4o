/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Mine
 */
public abstract class Role {
    
    public enum RoleType{
        RestaurantManager("RestaurantManager"),
        Customer("Customer"),
        Deliveryman("Deliveryman"),
        Admin("Admin");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
     
        @Override
        public String toString(){
            return this.value;
        }
    }
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business);
    
    @Override
    public String toString(){
        return this.getClass().getName();
    }
}
