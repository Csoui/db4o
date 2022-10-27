/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantManagerDirectory {
    
    private ArrayList<RestaurantManager> RestaurantManagerDirectory = new ArrayList();

    public ArrayList<RestaurantManager> getRestaurantManagerDirectory() {
        return RestaurantManagerDirectory;
    }

    public void setRestaurantManagerDirectory(ArrayList<RestaurantManager> RestaurantManagerDirectory) {
        this.RestaurantManagerDirectory = RestaurantManagerDirectory;
    }

    public RestaurantManager addRestaurantManager() {
    RestaurantManager newRestaurantManager = new RestaurantManager();
    RestaurantManagerDirectory.add(newRestaurantManager);
    return newRestaurantManager;
    }
    public void removeRestaurantManager(RestaurantManager m) {
        RestaurantManagerDirectory.remove(m);
    }
}
