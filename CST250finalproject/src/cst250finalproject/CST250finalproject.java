
package cst250finalproject;

import java.util.Scanner;


public class CST250finalproject {

    
    public static void main(String[] args) {
        String name;
        int numberShares;
        double buyPrice, sellPrice;

        String[] shares = new String[] { "Jp Morgan Chase", "Walmart" , "Gamestop","Amc Entertainment","Shell" ,"Google", "Twitter", "Samsung", "Lenovo", "Intel", "Bitcoin", "Litecoin", "SunPower", "American Airlines", "Dave and Buster", "Hecla Mining", "Tilray", "Dogecoin", "Boeing", "Nikola", "Facebook", "British Petroleum", "Bank Of America"  };

        System.out.println("Going trough the list: ");

        for (int i = 0; i < shares.length; i++) {
            System.out.println(shares[i]);
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Which share would you like to purchase?");
        name = input.nextLine();

        System.out.print("How many shares bought?");
        numberShares = input.nextInt();
        System.out.print("Buy price?");
        buyPrice = input.nextDouble();
        System.out.print("Sale price?");
        sellPrice = input.nextDouble();
        input.close();

        System.out.println(name + "here is the information of your stock transactions:");
        System.out.println("Number of shares:" + numberShares);
        System.out.println("Amount of purchase:" + buyPrice * numberShares);
        System.out.println("Amount of sell:" + sellPrice * numberShares);
        System.out.println("Transaction fee paid:" + 15 + 15);
        System.out.println("Net profit:" + (sellPrice * numberShares - buyPrice));

    }

}
        
    
    
    

