/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.RestaurantAdminRole.AdminWorkAreaJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Mine
 */
public class AdminRole extends Role{
    
        public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system ){    
            return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
        }
}
