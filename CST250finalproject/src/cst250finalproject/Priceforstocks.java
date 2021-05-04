
package cst250finalproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;



public class Priceforstocks {
    public static void main(String[] args) throws IOException {
        
        final String svl = "KO";
        URL url = new URL("https://www.google.com/finance?q=ko&ei=ga4QWNiF0obBe4LShvAF");
        URLConnection urlConn = url.openConnection();
        InputStreamReader inStream = new InputStreamReader(urlConn.getInputStream());
        BufferedReader buff = new BufferedReader(inStream);
        String price = "not found";
        String line = buff.readLine();
        while(line !=null){
            if(line.contains("[\"KO\",")){
                int target = line.indexOf("[\"KO\",");
                int deal = line.indexOf(",", target);
                int start = deal;
                while(line.charAt(start) != '\"'){
                    start--;
                }
                price = line.substring(start + 1, deal + 3);
                
                
            }
            line = buff.readLine();
        }
        System.out.println(price);
                
        
    }
    
}
