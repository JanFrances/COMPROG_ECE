/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * TAMAYO, Jan Frances C. 
 * BSECE 1-2
 * COMPROG ECE 2441
 */
public class Formulas {
    public static void main(String[] args){
        
        //This program gives view on how operators works and how Math library works
        
        //x / y - 3
        //1 / ( x + y)
        //The square root of x to the 6th plus y to the 5th
        //Absolute value of x + y
        
        double x, y, z;
        x = 13.0;
        y = 2.0;
        
        //First is the x / y - 3
        z = x / y - 3;
        System.out.println(z); //output = 3.5
        /*
        The formula will follow the the PEMDAS rule where the division is first and before the minus
        We can modify the formula by adding parenthesis in the y - 3; ex. ( y -3 ), this gives priority of the parenthesis
        before execute the division operator;
        
        z = x / (y - 3);
        System.out.println(z); //output = -13.0
        
        */
        
        //Here is anothe example with the parenthesis
        //1 / (x + y)
        z = 1 / (x + y);
        System.out.println(z); //output = 0.066666666667
        
        //Second is the square root of x to the 6th plus y to the 5th
         z = Math.sqrt(Math.pow(x,6)) + Math.pow(y, 5);
         System.out.println(z);
        /*
         To get the square root and the power of the given, we can use the Math Library
         On the square root, the syntax is Math.sqrt(double x); we can also change inside the 
         sqrt() with variables, numbers and as long as it is a number;
         meanwhile to get the power,we use the syntax Math.pow(variable/number, nth Term); inside the pow()
         the first given is what is the coifficient and the nth term is the exponent;
         There are many Sysntax in Math Library to be used example is the absolute number
         */
        
        //Lastly is getting the absolute number
        //Absolute value of x + y
        x = -13.0;
        
        z = x + y; 
        System.out.println(z);
        /*
         To get the absolute of the given, we can use the Math Library, the syntax is Math.abs();
         we can also change inside the abs(); by inputing formula or the a number;
         The absolute number get the positive answer even the answer is negative
         The abs(x+y); = 11 even the answer is -11;
         */
        
    }
}
