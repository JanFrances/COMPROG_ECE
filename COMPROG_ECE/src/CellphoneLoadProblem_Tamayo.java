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

public class CellphoneLoadProblem_Tamayo {
    public static void main(String[] args){
        
        DecimalFormat df = new DecimalFormat("0.0");
        Scanner myScanner = new Scanner(System.in);
        
        float Load, costPerText, costPerMins;
        float num_Messages, calls_Mins;
        double total, balance;
        
        System.out.print("Load: ");
        Load = myScanner.nextFloat();
        System.out.print("Cost per text: ");
        costPerText = myScanner.nextFloat();
        System.out.print("Cost per minutes: ");
        costPerMins = myScanner.nextFloat();
        System.out.print("Number of messages: ");
        num_Messages = myScanner.nextFloat();
        System.out.print("Calls in minutes: ");
        calls_Mins = myScanner.nextFloat();
        
        System.out.println();
        
        total = (num_Messages*costPerText) + (calls_Mins*costPerMins);
        
        balance = Load - total;
        System.out.println("Calls of messages: " + (num_Messages*costPerText));
        System.out.println("Calls of calls: " + (calls_Mins*costPerMins));
        System.out.println("total Usage: " + (total));
        System.out.println("Balance: " + df.format(balance));
    }
}
