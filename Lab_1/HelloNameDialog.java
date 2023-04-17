// Example 3: HelloNameDiaog.java
// Trinh Thi Dieu Thuy - 20215247
import javax.swing.JOptionPane;
public class HelloNameDialog{
public static void main(String args[]){
   String result;
   result = JOptionPane.showInputDialog("Please enter your name: ");
   JOptionPane.showMessageDialog(null, "Hi " + result + "!");
   System.exit(0);
}
}