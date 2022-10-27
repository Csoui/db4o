/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DeliveryManRole.DeliveryManWorkAreaJPanel;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author Mine
 */
public class DeliverymanRole extends Role{
    
        public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business ){
            return new DeliveryManWorkAreaJPanel(userProcessContainer,account, business);
        }
}
