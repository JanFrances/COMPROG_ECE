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

public class TelephoneAreaCodeProblem_Tamayo {
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        String tel_Area_Code;
        
        System.out.print("Enter telephone area code: ");
        tel_Area_Code = myScanner.nextLine();
        
        //Conditions
        /*
        First digit starts with 1 or 9
        Second digit starts with 5, 6, 7, 8, 9
        Third digit should not be equal to zero
        */
        
        if('1' == tel_Area_Code.charAt(0) || '9' == tel_Area_Code.charAt(0)){
            if(tel_Area_Code.charAt(1) == '5' || tel_Area_Code.charAt(1) == '6' || tel_Area_Code.charAt(1) == '7' || tel_Area_Code.charAt(1) == '8' || tel_Area_Code.charAt(1) == '9'){
                if(tel_Area_Code.charAt(2) != '0'){
                    System.out.println("Valid Code");
                }
                else{
                    System.out.println("Invalid Code");
                }
            }
            else{
                    System.out.println("Invalid Code");
            }
        }
        else{
            System.out.println("Invalid Code");
        }
        
        
    }
}
