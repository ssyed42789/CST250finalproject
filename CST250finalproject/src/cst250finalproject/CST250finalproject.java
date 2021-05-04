
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
        
        String Dateofbirth_name;
        System.out.print("Email");
        Dateofbirth_name = user_input.next();
        
       
        
        
        
        String full_name;
        full_name = first_name + "" + last_name;
        
        String Datewhenbought_name;
        Datewhenbought_name = Date_name;
        
        String Dateofbirthnew;
        Dateofbirthnew = Dateofbirth_name;

        String emailnew;
        emailnew = email_name;

        System.out.println("Your personal information is been verfied, now you may move on towards the next step thank you!" + full_name);
        System.out.println("Date" + Datewhenbought_name);
        System.out.println("Date of birth" + Dateofbirthnew);
        System.out.println("Email" + emailnew);
        
        
        
        
        
        
        
        
        
        
        
        
        
        // This step is an list of stocks from which to chose and, are performing well in the stock market
        String[] shares = new String[] { "Jp Morgan Chase $155.12", "Walmart $140.37" , "Gamestop  $159.40 ","Amc Entertainment $9.28 ","Shell $38.83 " ,"Google $2,299 ", "Twitter  $54.22", "Samsung $82,600", "Lenovo $27.20 ", "Intel $56.65 ", "Bitcoin $54,577.10 ", "Litecoin $306.37 ", "SunPower $22.72 ", "American Airlines $21.16 ", "Dave and Buster $45.98 ", "Hecla Mining $6.28 ", "Tilray $16.34 ", "Dogecoin $0.55", "Boeing $231.47 ", "Nikola $10.80 ", "Facebook $316.47 ", "British Petroleum $25.94 ", "Bank Of America $40.92 ", "Bitcoin Cash $977.11 ", "Moderna $172.30 ", "Pfizer $39.85", "United Airlines $52.20 ", "SouthWest Airlines $60.25 ", "Shell $38.76", "U.S. Wells $0.79", "Bitcoin SV $336.68 ", "Johnson and Johnson $167.13 ", "Disney $183.73 ", "Royal Carribean $84.20 ", "Carnival $26.53", "MGM Resort $40.34", "Heat Biologics $6.74", "Tonix Pharmaceutical $1.12", "Dow Jones $34,028.69", "Tesla $664.53"};

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

            
        

    


  
  


        
    
   
   


        
    
    
    

