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
import java.util.Scanner;

public class Letter {
    public static void main(String[] args){
        
        
        //This excercise is to give a an example on how to get an input from the user
        //The program use a Scanner to read the user input
        
        //We create 2 Scanner one for the String and one the integer
        Scanner inputString = new Scanner(System.in);
        Scanner inputNumber = new Scanner(System.in);
        
        //We declare variables for the name, age, your name and the present
        String name, present, yourName;
        int age;
        
        //Here we are requesting an user input for the name
        //we use nextLine() to read the string name
        System.out.print("What is the name of the gift give? ");
        name = inputString.nextLine();
        
        //Here we are requesting an user input for the present
        //we use nextLine() to read the string present
        System.out.print("What is the present they gave you? ");
        present = inputString.nextLine();
        
        //Here we are requesting an user input for the age
        //we use nextInt() to read the Integer age
        System.out.print("How old are you in your birthday? ");
        age = inputNumber.nextInt();
        
        //Here we are requesting an user input for the your name
        //we use nextLine() to read the string  yourName
        System.out.print("What is your name? ");
        yourName = inputString.nextLine();
        
        //In this letter we subsitute the value of assign variable
        //name = Tito Tamayo
        //age = 18
        //present = food
        //yourName  = Jan Frances
        
        System.out.println();
        System.out.println();
        System.out.println("Dear " + name +", ");
        System.out.println();
        System.out.print("Thank you for the " + present + ".");
        System.out.println("I realy like it. I can't believe ");
        System.out.print("I'm already " + age + " years old, but ");
        System.out.println("it doesn't feel that much different than");
        System.out.println("being " + (age-1) + ". ");
        System.out.println();
        System.out.println("Sincerely, ");
        System.out.println();
        System.out.println(yourName);
        
        
    }
    
}
