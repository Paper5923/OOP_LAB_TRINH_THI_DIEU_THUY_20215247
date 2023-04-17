import javax.swing.JOptionPane;
import java.lang.Math;
import java.util.Scanner;
public class CalculationTwoNum {
    
    public static void main(String[] args ) {
        String strNum1, strNum2;
        System.out.println("Enter the first number: ");
        Scanner scanner = new Scanner(System.in);
        strNum1 = scanner.nextLine();
        System.out.println("Enter the second number: ");
        strNum2= scanner.nextLine();
        double Num1 = Double.parseDouble(strNum1);
        double Num2 = Double.parseDouble(strNum2);
        double sum = Num1 + Num2;
        double diff = Num1 - Num2;
        double product = Num1 * Num2;
        double quotient;
        
        System.out.println("----Trinh Thi Dieu Thuy - 20215247 perforom calculation of " + Num1 + " and " + Num2 + "-----\nSum       : " + sum + "\nDifference: " + diff + "\nProduct   : " + product);
        if(Num2 != 0){
            quotient = Num1/ Num2;
            System.out.println("Quotient  : " + quotient);
        }
        else{
            System.out.println("Quotient  : Cannot perform divsion since divisor = 0");
        }


    }
}
