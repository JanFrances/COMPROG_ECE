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
        
        float outDia;
        float inDia;
        
        double T;
        
        System.out.print("Enter outside diameter: ");
        outDia = myScanner.nextFloat();
        System.out.print("Enter inside diameter: ");
        inDia = myScanner.nextFloat();
        
        T = (outDia - inDia)/2.0;
        
        System.out.println("The thickness of the wall of the pipe is " + df.format(T));
            
    }
}
