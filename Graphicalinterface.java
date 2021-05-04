import javax.swing.JOptionPane;
public class Graphicalinterface {
     public static void main(String[] args) {
         String name = JOptionPane.showInputDialog(null,
                 "Name of Stock Chosen");
         int choice = JOptionPane.showConfirmDialog(null,
                 "Based on Internet Research would you think this Stock will give profit" + name + "?");
       
       if (choice == JOptionPane.YES_OPTION){
              JOptionPane.showMessageDialog(null,
                      "Well good Choice because it's on the rise these days");
              } else { // choice == NO_OPTION or CANCEL_OPTION
             JOptionPane.showMessageDialog(null,
                     "So sorry but, the stock is doing well in the stock Market.");
             
         }
             
         
                 
     }
     
 }
     