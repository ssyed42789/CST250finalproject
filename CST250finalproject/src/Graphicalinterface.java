import javax.swing.JOptionPane;
public class Graphicalinterface {
     public static void main(String[] args) {
         String name = JOptionPane.showInputDialog(null,
                 "What is your name?");
         int choice = JOptionPane.showConfirmDialog(null,
                 "Do you like cake, " + name + "?");
         if (choice == JOptionPane.YES_OPTION) {
              JOptionPane.showMessageDialog(null,
                      "Of course! Who doesn't?");
              } else { // choice == NO_OPTION or CANCEL_OPTION
             JOptionPane.showMessageDialog(null,
                     "We'll have to agree to disagree.");
             
         }
             
         
                 
     }
     
 }
     