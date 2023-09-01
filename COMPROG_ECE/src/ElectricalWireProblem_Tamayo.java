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
        
        // Example 1000 ; the total amount is 0
        // first add a 500 foot wires 
        
        int total_value = 0;
        int costumer_Needed;
        
        
        int Foot_Wire_500= 0;
        int Foot_Wire_300 = 0;
        int Foot_Wire_100 = 0;
        int Feet_Wire_1 = 0;
        
        System.out.print("Enter length of wire needed by a costumer: "); // 950
        costumer_Needed = myScanner.nextInt();
        
        System.out.println(costumer_Needed + " feet needed");
        
      while(true){
        if(500 <= (costumer_Needed - total_value)){
            total_value += 500;
            Foot_Wire_500++;
        }
        else
            if(300 <= (costumer_Needed - total_value)){
            total_value += 300;
            Foot_Wire_300++;
        }
        else
             if(100 <= (costumer_Needed - total_value)){
            total_value += 100;
            Foot_Wire_100++;
        }
        else
             if(50 <= (costumer_Needed - total_value)){
            total_value += 50;
            Feet_Wire_1++;
        }
        else{
              break;
        }
      }
      
      System.out.println("500 fool roll(s)   -   " + Foot_Wire_500);
      System.out.println("300 fool roll(s)   -   " + Foot_Wire_300);
      System.out.println("100 fool roll(s)   -   " + Foot_Wire_100);
      System.out.println("Add 1 feet wire    -   " + Feet_Wire_1);
    }


}
