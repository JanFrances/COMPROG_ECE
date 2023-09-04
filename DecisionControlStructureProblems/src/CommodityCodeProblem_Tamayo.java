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

public class CommodityCodeProblem_Tamayo {
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        
        String commodityCode;
        int quantityOfCommodity;
        double taxes, discount, price, totalPrice;
        
        System.out.print("Enter Commodity Code: ");
        commodityCode = stringScanner.nextLine();
        

        
        if("A".equals(commodityCode)){
            
            System.out.print("Enter quantity of commodity: ");
            quantityOfCommodity = myScanner.nextInt();
                
            System.out.print("Enter unit price: ");
            price = myScanner.nextDouble();
            
            discount =  price * (0.12 * quantityOfCommodity);
            totalPrice = (price * quantityOfCommodity) - discount;
            
            System.out.println("Enter quantity of commodity: " + totalPrice);
        }
        else
            if("B".equals(commodityCode)){
                System.out.print("Enter quantity of commodity: ");
                quantityOfCommodity = myScanner.nextInt();
                
                System.out.print("Enter unit price: ");
                price = myScanner.nextDouble();
                
                taxes = price * (0.12 * quantityOfCommodity);
                totalPrice = (price * quantityOfCommodity) + taxes;
                System.out.println("Enter quantity of commodity: " + totalPrice);
            }
        else
            if("C".equals(commodityCode)){
                System.out.print("Enter quantity of commodity: ");
                quantityOfCommodity = myScanner.nextInt();
                
                System.out.print("Enter unit price: ");
                price = myScanner.nextDouble();
                
                totalPrice = price * quantityOfCommodity;
                System.out.println("Enter quantity of commodity: " + totalPrice);
             
            }
        else{
            System.out.println("Invalid Code");
        }
        
        //Conditions
        /*
        Commodity Code:
        A - commodities are discounted by 15%
        B - commodities are taxed by 12%
        C - commodities are charged as priced
        */
        
        
        
        
    }
}
