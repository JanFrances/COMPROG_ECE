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

public class GradeProblem_Tamayo {
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        int grade;
        String description = "";
        
        System.out.print("Enter a grade: ");
        grade = myScanner.nextInt();
     
        /*
        conditions
        Grade       Description
        93 – 99     Excellent
        87 – 92     Very Good
        80 – 86     Good
        70 – 79     Fair
        65 - 69     Poor
        */
        
        if(grade <= 99 && grade >= 93){
            description = "Excelent";
        }
        else
            if(grade <= 92 && grade >= 87){
            description = "Very Good";
        }
        else
            if(grade <= 86 && grade >= 80){
            description = "Good";
        }
        else
            if(grade <= 79 && grade >= 70){
            description = "Fair";
        }
        else
            if(grade <= 69 && grade >= 65){
            description = "Failed";
        }
        
        System.out.println(description);
    }
}
