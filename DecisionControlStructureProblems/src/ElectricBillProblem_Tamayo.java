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

public class ElectricBillProblem_Tamayo {
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        int electric_Consumption;
        double electric_Bill;
        
        System.out.println("Enter electric consumption: ");
        electric_Consumption = myScanner.nextInt();
        
        //Condition
        /*
        If the electric consumption is less than or equal to 400 KWH will be charge
        P35.12 and the excess is charge P25.23
        */
        if(electric_Consumption > 400 ){
            electric_Bill = 400 * 30.12;
            electric_Bill += ((electric_Consumption - 400) * 25.23);
        }
        else{
            electric_Bill = electric_Consumption * 30.12;
        }
        
        System.out.println("Electric Bill is " + electric_Bill);
    }
}
