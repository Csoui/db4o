/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.CustomerRole.CustomerAreaJPanel;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;

/**
 *
 * @author Mine
 */
public class CustomerRole extends Role {
    
        public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business ){   
            return new CustomerAreaJPanel(userProcessContainer,account, business );
        }
}
