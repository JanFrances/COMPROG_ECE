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

public class YearProblem_Tamayo {
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        int year;
        
        System.out.print("Enter year: ");
        year = myScanner.nextInt();
        
       //Conditions
       // all leap year and century year are divisible by 4 except century not divisible by 400
       //Ordinary Year are not divisible by 4
       if( year % 4 == 0){
           if( year % 100 == 0 && year % 400 == 0 ){
               System.out.println("It's a leap year.");
           }
           else
               if( year % 100 == 0 ){
               System.out.println("It's a century year.");
           }
           else{
               System.out.println("It's a leap year.");
               }
       }
       else{
           System.out.println("It's ordinary year.");
       }
    }
}
