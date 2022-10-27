package Business;


import Business.Role.AdminRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", new AdminRole());
        
        return system;
    }
    
}
