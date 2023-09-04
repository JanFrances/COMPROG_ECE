/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
import java.util.Scanner;

public class ParkingFeeProblem_Tamayo {
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        int hours;
        
        int min_Charge = 35;
        int additionalCharge = 15;
        int max_Charge = 250;
        int totalCharge;
        
        System.out.print("Enter number of hours: ");
        hours = myScanner.nextInt();
        
        //Conditions
        /*
        Less that or Equal to 4 hours is P35.00
        Excess hours have additional P15/hour
        The maximum charge will be P250
        */
        
        if(hours <= 4){
            System.out.print("Parking Fees: P " + min_Charge );
        }
        else
            if(hours > 4){
                totalCharge = 35 + ((hours - 4) * additionalCharge);
                if(totalCharge >= max_Charge){
                    System.out.println("Parking fees: P " + max_Charge);
                } 
                else {
                    System .out.println("Paking fees: P " + totalCharge);
                }
            } 
    }
}
