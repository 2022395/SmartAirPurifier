/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartairpurifier;

/**
 *
 * @author volkan
 */
public class AirConditionSystem extends SmartAirPurifier {

    private double livingRoomTemp;
    private double bedRoomTemp;
    private double mainHallTemp;
    private double kitchenTemp;

    public double getLivingRoomTemp() {
        return livingRoomTemp;
    }

    public void setLivingRoomTemp(double livingRoomTemp) {
        this.livingRoomTemp = livingRoomTemp;
    }

    public double getBedRoomTemp() {
        return bedRoomTemp;
    }

    public void setBedRoomTemp(double bedRoomTemp) {
        this.bedRoomTemp = bedRoomTemp;
    }

    public double getMainHallTemp() {
        return mainHallTemp;
    }

    public void setMainHallTemp(double mainHallTemp) {
        this.mainHallTemp = mainHallTemp;
    }

    public double getKitchenTemp() {
        return kitchenTemp;
    }

    public void setKitchenTemp(double kitchenTemp) {
        this.kitchenTemp = kitchenTemp;
    }
    
    
    
    
}
