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

public class PipeProblem_Tamayo {
    public static void main(String[] args){
    
        Scanner myScanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat(".00");
        
        /*
        outdia = Outside Diameter
        inDia = Inside Diameter
        T = Thickness of the wall of the pipe
        */
        
        float outDia, inDia;
        double T;
        
        System.out.print("Enter outside diameter: ");
        outDia = myScanner.nextFloat(); //ex. 24.32
        
        System.out.print("Enter inside diameter: ");
        inDia = myScanner.nextFloat(); //ex. 13.64
        
        
        //Formula to get the thickness of the wall of the pipe
        T = (outDia - inDia)/2.0;
        
        
        System.out.println("The thickness of the wall of the pipe is " + df.format(T));
        //Output: 5.34
            
    }
}
