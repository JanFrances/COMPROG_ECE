/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * TAMAYO, Jan Frances C. 
 * BSECE 1-2
 * COMPROG ECE
 */

public class HelloWorld {
    public static void main(String[] args){
        
        //Excercise for modification we can create in Hello World 
        
        //First Modification
        
        //Print "Hello, " without a newline
        System.out.print("Hello, "); 
        
        //Print "world!" with a newline
        System.out.println("world!");
        
        /*
        The System.out.print() prints the output but does not move the cursor to a new line
        while System.out.println(); prints the output and moves the cursor to a new line
        If the make both use System.out.println(); the "world!" will be print in new line because
        when the "Hello, " has been print and the cursor moves to a new line where the "world!" printed;
        
        From the code above the the "world!" prints in the line of "Hello, " because the "Hello, " 
        use does not move the cursor to new line because of System.out.print();
        */
        
        // Second Modification
        
        //Combine "Hello" and "world!" and print
        System.out.println("Hello, " + "world!");
        /*
        The Second modification combined the "Hello, " and "world" string using the symbol '+'.
        The '+' sysmbol is used for string concatenation, this combine the 2 or more string together into
        a single string.
        */
        
    }
}
