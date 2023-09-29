/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package smartairpurifier;

import java.util.Scanner;

/**
 *
 * @author volkan
 */
public class SmartAirPurifier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double oxygenClarity= 70.5;
        double carbondioxideLevel=10.2;
        int fanSpeed;
        int selection= menuSelection();
        
        
        switch (selection){
            case 1 : {
                System.out.println("Oxygen Clarity: "+ oxygenClarity);
                System.out.println("Carbondioxide Level:"+ carbondioxideLevel);
                break;
            }
             case 2 : {
                AirConditionSystem airConditionSystem = new AirConditionSystem();
                System.out.println("Living Room Temperature is :"+ airConditionSystem.getLivingRoomTemp());
                System.out.println("Bedroom Temperature is :"+ airConditionSystem.getBedRoomTemp());
                System.out.println("Main Hall Temperature is :"+ airConditionSystem.getMainHallTemp());
                System.out.println("Kitchen Temperature is :"+airConditionSystem.getKitchenTemp());
                break;
                
            }
            
            
        
            
        }
    
        
        
        
    }
    public static int menuSelection(){
        System.out.println("Welcome To The SmartAirPurifier Main Menu");
        System.out.println("Please make a Selection from this menu");
        System.out.println("1: AirPurifier");
        System.out.println("2: AirCondition System");
        Scanner scanner=new Scanner(System.in);
     
        String selection = scanner.nextLine();
        return Integer.parseInt(selection);
        
    }

}
