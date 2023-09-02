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

public class ElectricalWireProblem_Tamayo {
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        int total_value = 0;
        int costumer_Needed;
        
        
        int F500 = 0; // 500 foot roll(s);
        int F300 = 0; // 300 foot roll(s);
        int F100 = 0; // 100 foot roll(s);
        int F01 = 0; // 01 feet roll(s);
        
        System.out.print("Enter length of wire needed by a costumer: "); // 950
        costumer_Needed = myScanner.nextInt();
        
        System.out.println(costumer_Needed + " feet needed");
        
       //Conditions
      while(true){
        if(500 <= (costumer_Needed - total_value)){
            total_value += 500;
            F500++;
        }
        else
            if(300 <= (costumer_Needed - total_value)){
            total_value += 300;
            F300++;
        }
        else
             if(100 <= (costumer_Needed - total_value)){
            total_value += 100;
            F100++;
        }
        else
             if(100 > (costumer_Needed - total_value) && (costumer_Needed - total_value) > 0){
            total_value = total_value + (costumer_Needed - total_value);
            F01++;
        }
        else{
              break;
        }
      }
      
      System.out.println("500 fool roll(s)   -   " + F500);
      System.out.println("300 fool roll(s)   -   " + F300);
      System.out.println("100 fool roll(s)   -   " + F100);
      System.out.println("Add 1 feet wire    -   " + F01);
    }


}
