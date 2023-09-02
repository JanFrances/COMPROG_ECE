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

public class TriangleProblem_Tamayo {

    public static void main(String[] args){
    
        Scanner myScanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        
    int a, b, c;
    double A, ins;
    double S;
    double r_insc;
    double r_circ;

    System.out.print("Enter the three sides of a triangle; ");
    
    System.out.print("Enter side a: ");
    a = myScanner.nextInt();
    
    System.out.print("Enter side b: ");
    b = myScanner.nextInt();
    
    System.out.print("Enter side c: ");
    c = myScanner.nextInt();

    S = (a+b+c)/2.0;
    ins = S*(S-a)*(S-b)*(S-c); // inside the square root
    
    System.out.println();
   

    A = Math.sqrt(ins);
    System.out.println("The area of the triangle is " + df.format(A));
    
    r_insc = A/S;
    System.out.println("The area of the largest inscribed circle is " + df.format(r_insc));

    r_circ = (a*b*c)/(4*A);
    System.out.println("The area of the smallest circumscribed circle is " + df.format(r_circ));
    }


}
