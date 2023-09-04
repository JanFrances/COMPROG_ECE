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

public class ThreeNumbersProblem_Tamayo {
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        
        int x, y, z;
        int HN, MN,SN;
        
        System.out.print("Enter x: ");
        x = myScanner.nextInt();
        
        System.out.print("Enter y: ");
        y = myScanner.nextInt();
        
        System.out.print("Enter z: ");
        z = myScanner.nextInt();
        
        //Condition for getting highest
        while(true){
        if(x > y && x > z){
            HN = x;
            break;
        } 
        else
            if(y > x && y > z){
            HN = y;
            break;
        }
        else
            if(z > x && z > y){
            HN = z;
            break;
        }
        }
        
        //Condition for getting the lowest
        while(true){
        if(x < y && x < z){
            SN = x;
            break;
        } 
        else
            if(y < x && y < z){
            SN = y;
            break;
        }
        else
            if(z < y && z < x){
            SN = z;
            break;
        }
        }
         
        /*    
        Condition for getting the median
        
        while(true){
        if(HN == x && SN == y){
            MN = z;
            break;
        } 
         else
            if(HN == y && SN == x){
            MN = y;
            break;
        }
         else
            if(HN == z && SN == x){
            MN = y;
            break;
        }
        else
            if(HN == x && SN == z){
            MN = y;
            break;
        }
        else
            if(HN == y && SN == z){
            MN = x;
            break;
        }
         else
            if(HN == z && SN == y){
            MN = x;
            break;
        }
        }
        */
        
        //We can also use the condition MN = x+y+z-HN-SN
        MN = x+y+z-HN-SN;
        
        System.out.println("The Highest Number is " + HN);
        System.out.println("The Median Number is " + MN);
        System.out.println("The Smallest Number is " + SN);
        System.out.println("Ascending Order: " + SN + " " + MN + " " + HN);
        
        
        /*
        Enter x: 4
        Enter y: 2
        Enter z: 9
        The Highest Number is 9
        The Median Number is 4
        The Lowest Number is 2
        Ascending Order: 2 4 9
        */
        
        /*
        Enter x: 1
        Enter y: 8
        Enter z: 5
        The Highest Number is 8
        The Median Number is 5
        The Smallest Number is 1
        Ascending Order: 1 5 8
        */
        
        /*
        Enter x: 6
        Enter y: 2
        Enter z: 4
        The Highest Number is 6
        The Median Number is 2
        The Lowest Number is 4
        Ascending Order: 2 4 6
        */
    }
}
