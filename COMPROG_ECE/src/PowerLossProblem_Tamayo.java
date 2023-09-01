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
        
        double P_WATT; // 
        
        
        System.out.print("Enter the current flowing through the cable: ");
        I_AMP = myScanner.nextFloat();
        System.out.print("Enter the resistance flowing through the cable: ");
        R_OHM= myScanner.nextFloat();
        
        P_WATT = R_OHM * (I_AMP *I_AMP);
        
        System.out.println("Power loss is " + df.format(P_WATT));
    }
}
