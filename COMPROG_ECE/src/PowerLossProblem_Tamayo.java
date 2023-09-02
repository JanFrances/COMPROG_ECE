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
import java.text.DecimalFormat;

public class PowerLossProblem_Tamayo {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        
        float R_OHM;// Resistance Flowing through Cable
        float I_AMP; // Current Flowing through cable
        double P_WATT; // Power Loss of the Cable
        
        
        System.out.print("Enter the current flowing through the cable: ");
        I_AMP = myScanner.nextFloat(); //ex. 6.12
        
        System.out.print("Enter the resistance flowing through the cable: ");
        R_OHM= myScanner.nextFloat(); //ex. 2.34
        
        //Formula to get the Power Loss of the cable
        // WE can also use the Math.pow(I_AMP, 2)
        P_WATT = R_OHM * (I_AMP *I_AMP); 
        
        
        System.out.println("Power loss is " + df.format(P_WATT));
        //Output 87.643296
    }
}
