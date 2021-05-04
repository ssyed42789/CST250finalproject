
package cst250finalproject;

import java.util.Scanner;



public class CST250finalproject {

    
    public static void main(String[] args) {
        String name;
        int numberShares;
        double buyPrice, sellPrice;

        Scanner user_input = new Scanner(System.in);
        
        //The program starts by asking the user information for example their name, date, 
        String first_name;
        System.out.print("First Name");
        first_name = user_input.next();
        
        String last_name;
        System.out.print("Last Name");
        last_name = user_input.next();
        
        String Date_name;
        System.out.print("Date");
        Date_name = user_input.next();
        
        String email_name;
        System.out.print("Email");
        email_name = user_input.next();
        
       
        
        
        
        String full_name;
        full_name = first_name + "" + last_name;
        
        String Datewhenbought_name;
        Datewhenbought_name = Date_name;
        
        String emailnew;
        emailnew = email_name ;
        
        
        
        System.out.println("Your personal information is been verfied, now you may move on towards the next step thank you!" + full_name);
        System.out.println("Date" + Datewhenbought_name);
        System.out.println("Email" + emailnew);
        
        
        
        
        
        
        
        
        
        
        
        
        // This step is an list of stocks from which to chose and, are performing well in the stock market
        String[] shares = new String[] { "Jp Morgan Chase", "Walmart" , "Gamestop","Amc Entertainment","Shell" ,"Google", "Twitter", "Samsung", "Lenovo", "Intel", "Bitcoin", "Litecoin", "SunPower", "American Airlines", "Dave and Buster", "Hecla Mining", "Tilray", "Dogecoin", "Boeing", "Nikola", "Facebook", "British Petroleum", "Bank Of America", "Bitcoin Cash", "Moderna", "Pfizer", "United Airlines", "SouthWest Airlines", "Shell", "U.S. Wells", "Bitcoin SV", "Johnson and Johnson", "Disney", "Royal Carribean", "Carnival", "MGM Resort", "Heat Biologics", "Tonix Pharmaceutical", "Dow Jones", "Tesla", "Google"  };

        System.out.println("Going trough the list: ");

        for (String share : shares) {
            System.out.println(share);
        }
        // This ask you for the name of the stock that you want to buy
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Which share would you like to purchase?");
            name = input.nextLine();
        //profit/ loss is being calculated using the data such as the number of shares bought, the price at which stock is bought at, the price where the stock is sold at    
            System.out.print("How many shares bought?");
            numberShares = input.nextInt();
            System.out.print("Buy price?");
            buyPrice = input.nextDouble();
            System.out.print("Sale price?");
            sellPrice = input.nextDouble();
        }
      

        
       
            
        // Takes all the information that the program asks you to put in and, displays the result
        System.out.println(name + "here is the information of your stock transactions:");
        System.out.println("Number of shares:" + numberShares);
        System.out.println("Amount of purchase:" + buyPrice * numberShares);
        System.out.println("Amount of sell:" + sellPrice * numberShares);
        System.out.println("Transaction fee paid:" + 15 + 15);
        System.out.println("Net profit:" + (sellPrice * numberShares - buyPrice));
        System.out.println("Net loss:" + (buyPrice - sellPrice ));
        
        
        
    }
}

            
        

    


  
  


        
    
   
   


        
    
    
    

