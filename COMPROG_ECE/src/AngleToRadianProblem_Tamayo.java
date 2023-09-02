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

public class AngleToRadianProblem_Tamayo {
    public static void main(String[] args){
        
    Scanner myScanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.0000");
    
    float PI = (float) 3.14;
    float deg, min ,sec; // Degree(s), Minute(s), Second(s)
    
    double rad; //Radians
    
    System.out.print("Enter an angle that expressed in degrees: ");
    deg = myScanner.nextFloat();
    
    System.out.print("Enter an angle that expressed in minutes: ");
    min = myScanner.nextFloat();
    
    System.out.print("Enter an angle that expressed in seconds: ");
    sec = myScanner.nextFloat();
    
    
    //Formula to get the Radians
    rad = PI*((deg + (min/36) + (sec/3600))/180);
    System.out.println("The equivalent angle in radians is " + df.format(rad));
    
    /*
    Enter an angle that expressed in degrees: 36
    Enter an angle that expressed in minutes: 24
    Enter an angle that expressed in seconds: 35
    The equivalent angle in radians is 0.6355 / 0.3898
    */
    
    
    }
}
