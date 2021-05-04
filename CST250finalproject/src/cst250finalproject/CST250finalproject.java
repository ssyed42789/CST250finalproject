
package cst250finalproject;

import java.util.Scanner;


public class CST250finalproject {

    
    public static void main(String[] args) {
        String name;
        int numberShares;
        double buyPrice, sellPrice;
        
        Scanner user_input = new Scanner(System.in);
        
        String first_name;
        System.out.print("First Name");
        first_name = user_input.next();
        
        String last_name;
        System.out.print("Last Name");
        last_name = user_input.next();
        
        String full_name;
        full_name = first_name + "" + last_name;
        
        System.out.println("Your name is verified, now you can move on towards the next step thank you!");
        
        
        
        
        
        
        
        
        
        
        
        

        String[] shares = new String[] { "Jp Morgan Chase", "Walmart" , "Gamestop","Amc Entertainment","Shell" ,"Google", "Twitter", "Samsung", "Lenovo", "Intel", "Bitcoin", "Litecoin", "SunPower", "American Airlines", "Dave and Buster", "Hecla Mining", "Tilray", "Dogecoin", "Boeing", "Nikola", "Facebook", "British Petroleum", "Bank Of America"  };

        System.out.println("Going trough the list: ");

        for (String share : shares) {
            System.out.println(share);
        }

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Which share would you like to purchase?");
            name = input.nextLine();
            
            System.out.print("How many shares bought?");
            numberShares = input.nextInt();
            System.out.print("Buy price?");
            buyPrice = input.nextDouble();
            System.out.print("Sale price?");
            sellPrice = input.nextDouble();
        }
        
        
       
            

        System.out.println(name + "here is the information of your stock transactions:");
        System.out.println("Number of shares:" + numberShares);
        System.out.println("Amount of purchase:" + buyPrice * numberShares);
        System.out.println("Amount of sell:" + sellPrice * numberShares);
        System.out.println("Transaction fee paid:" + 15 + 15);
        System.out.println("Net profit:" + (sellPrice * numberShares - buyPrice));
        System.out.println("Net loss:" + (buyPrice - sellPrice ));
        
        
        
    }
}

            
        

    


  
  


        
    
   
   


        
    
    
    

