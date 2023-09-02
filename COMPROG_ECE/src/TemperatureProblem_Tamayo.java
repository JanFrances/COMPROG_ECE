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

public class TemperatureProblem_Tamayo {
    public static void main(String[] args){
        
       Scanner myScanner = new Scanner(System.in);
       DecimalFormat df = new DecimalFormat(".0");
       
       float F;
       double C;
       
       System.out.print("Enter a temperature in degrees Fahrenheit: ");
       F = myScanner.nextFloat();
       
       C = (F - 32)/1.8;
       
       System.out.println("The equivalent temperature in degree Celcius is " + df.format(C));
       
       
    }
}
