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

public class ChangeProblem_Tamayo {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        
        int change = 0; //change
        int amount; //total purchase
        
        int P50 = 0; //50 Pesos
        int P20 = 0; //20 Pesos
        int P10 = 0; //10 Pesos
        int P05 = 0; //05 Pesos
        int P01 = 0; //01 Pesos
        
     System.out.print("Enter amount of purchase which is less than 100: ");
     amount = myScanner.nextInt();
     
     while(true){
         
         if(50 <= ((100 -amount) - change)){
             change += 50;
             P50 += 1;
         }
         else
             if(20 <= ((100 - amount) - change)){
             change += 20;
             P20 += 1;
         }
         else
             if(10 <= ((100 - amount) - change)){
             change += 10;
             P10 += 1;
         }
         else
             if(5 <= ((100 - amount) - change)){
             change += 5;
             P05 += 1;
         }
         else
             if(1 <= ((100 - amount) - change)){
             change += 1;
             P01 += 1;
         }
         else{
                 break;
                 }
     }
     
     System.out.println("P50    -   "  + P50);
     System.out.println("P20    -   "  + P20);
     System.out.println("P10    -   "  + P10);
     System.out.println("P05    -   "  + P05);
     System.out.println("P01    -   "  + P01);
     
     
     /*
     Enter amount of purchase which is less than 100: 23
     P50    -   1
     P20    -   1
     P10    -   0
     P05    -   1
     P01    -   2
     */
     
    }
}
