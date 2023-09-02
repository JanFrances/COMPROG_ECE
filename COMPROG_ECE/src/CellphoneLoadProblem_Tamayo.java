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
        float number_of_Messages, calls_in_Minutes;
        float calls_of_Messages, calls_of_Calls;
        double total, balance;
        
        System.out.print("Load: ");
        Load = myScanner.nextFloat(); //ex. 500
        
        System.out.print("Cost per text: ");
        costPerText = myScanner.nextFloat(); //ex1. 1 & ex2. 0.50
        
        System.out.print("Cost per minutes: ");
        costPerMins = myScanner.nextFloat(); //ex1. 5.50 & ex2. 3.50
        
        System.out.print("Number of messages: ");
        number_of_Messages = myScanner.nextFloat(); //ex1. 24 & ex2. 100
        
        System.out.print("Calls in minutes: "); 
        calls_in_Minutes = myScanner.nextFloat(); //ex1. 12  &  ex2. 10
        
        System.out.println();
        
        //Multiplying the number of messages to the cost per text will get the total cost
        calls_of_Messages = number_of_Messages * costPerText;
        System.out.println("Calls of messages: " + df.format(calls_of_Messages));
        
        //Multiplying the calls in minutes to the cost per minutes will get the total cost
        calls_of_Calls = calls_in_Minutes * costPerMins;
        System.out.println("Calls of calls: " + df.format(calls_of_Calls));
        
        //Formula to get the total usage
        total = calls_of_Messages + calls_of_Calls;
        System.out.println("total Usage: " + (total));
        
        //Formula to get the remaining balance
        balance = Load - total;
        System.out.println("Balance: " + df.format(balance));
        
        /*
        Load: 500
        Cost per text: 1
        Cost per minutes: 5.50
        Number of messages: 24
        Calls in minutes: 12

        Calls of messages: 24.0
        Calls of calls: 66.0
        total Usage: 90.0
        Balance: 410.0
        */
        /*
        Load: 500
        Cost per text: 0.50
        Cost per minutes: 3.50
        Number of messages: 100
        Calls in minutes: 10

        Calls of messages: 50.0
        Calls of calls: 35.0
        total Usage: 85.0
        Balance: 415.0
        */
    }
}
