/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    
    ArrayList<DeliveryMan> DeliveryManDirectory = new ArrayList();

    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return DeliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> DeliveryManDirectory) {
        this.DeliveryManDirectory = DeliveryManDirectory;
    }
    
    public DeliveryMan addDeliveryMan() {
        DeliveryMan newDeliveryMan = new DeliveryMan();
        DeliveryManDirectory.add(newDeliveryMan);
        return newDeliveryMan;
    }
    public void removeDeliveryMan(DeliveryMan d) {
        DeliveryManDirectory.remove(d);
    }
    
}
