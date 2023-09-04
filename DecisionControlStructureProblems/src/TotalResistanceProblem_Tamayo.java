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

public class TotalResistanceProblem_Tamayo {
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        
        String typeOfConnection; //series or parallel
        
        float r1, r2, r3;
        double totalResistance = 0;
        
        System.out.print("Enter Resistor1: ");
        r1 = myScanner.nextFloat();
        
        System.out.print("Enter Resistor2: ");
        r2 = myScanner.nextFloat();
        
        System.out.print("Enter Resistor3: ");
        r3 = myScanner.nextFloat();

        
        System.out.print("Enter type of Connection: ");
        typeOfConnection = stringScanner.nextLine();

        //Condition
        if("Series".equals(typeOfConnection) || "series".equals(typeOfConnection)){
            totalResistance = r1 + r2 + r3;
        }
        else
            if("Parallel".equals(typeOfConnection)|| "parallel".equals(typeOfConnection)){
                totalResistance = 1 / ((1/r1)+(1/r2)+(1/r3));
            }
        
        System.out.println("The total resistance is " + totalResistance);
        
        
        /*
        Enter Resistor1: 2.34
        Enter Resistor2: 4.23
        Enter Resistor3: 6.7
        Enter type of Connection: series
        The total resistance is 13.269999504089355
        */
        
        /*
        Enter Resistor1: 4.21
        Enter Resistor2: 2.67
        Enter Resistor3: 3.98
        Enter type of Connection: parallel
        The total resistance is 1.1583219766616821
        */
    }
}
