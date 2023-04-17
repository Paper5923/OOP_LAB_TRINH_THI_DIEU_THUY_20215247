
// Exercise 6.5: Sorting element in array. Calculate sum and average 
// Trinh Thi Dieu Thuy 20215247
import java.util.Scanner;
import java.lang.ArrayIndexOutOfBoundsException;
import javax.swing.JOptionPane;
public class Sorting {
        
        

        public static void main(String [] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int  n = scan.nextInt();
        int[] a = new int[n];
        
        for(int i = 0; i < n; i++){
            System.out.print("Enter the " + (i + 1) + "th element: ");
            a[i] = scan.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if( a[i] > a[j]){
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            }
        }
    
        int sum = 0;
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
            sum += a[i];
        }
        double avg = (double)sum/ n;
        System.out.print("\nSum of array elements : " + sum + "\nAverage of array elements: " + avg);
    }
}
