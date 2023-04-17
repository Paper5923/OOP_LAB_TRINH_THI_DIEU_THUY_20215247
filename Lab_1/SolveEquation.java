import java.util.Scanner;
import java.lang.Math;
// Ex6: Solve equation
// Trinh Thi Dieu Thuy 20215247 
public class SolveEquation {

    //Equation 1
    public static void eq1(double a, double b){
       

        if ( a == 0 && b == 0) System.out.print("Infinite solution!\n");
        else if ( a == 0 && b != 0) System.out.print("No solution!\n");
        else System.out.print("One solution: x = " + -b/a +"\n");
    }

    // Equation 2
    public static void eq2(double a11, double a12, double a21, double a22, double b1, double b2){
        if( a11/a21 == a21/a22){
            if (a11/a21 != b1/b2) System.out.print("No solution!\n");
            else System.out.print("Infinite solution!\n");
        } 
        else{
            double y = (b1 * a21 - b2 * a11)/ (a21 * a12 - a11 * a22);
            double x = (b1 - a12 * y)/a11;
            System.out.print("One solution x = " + x + ", y = " + y  + "\n" );


        }
        
    }
    public static void eq3(double a, double b, double c){
        double delta = b * b - 4 * a * c;
        if( delta < 0) System.out.print("No solution!\n");
        else if( delta == 0) System.out.print("One solution x = " + -b / ( 2 * a ));
        else{
            double x1 = ( -b - Math.sqrt(delta))/( 2 * a);
            double x2 = ( -b + Math.sqrt(delta))/( 2 * a);
            System.out.print("Two solution: x1 = " + x1 + ", x2 = " + x2);
        }
    }

    public static void main(String[] args ){

        Scanner scan = new Scanner(System.in);
        
        System.out.print("1. Linear equation with one variable: ax + b = 0\n");
        System.out.print("2. Linear system with two variable :a11x1 + a12y1 = b1  a21x2 + a22y2 = b2\n");
        System.out.print("3. Second degree equation with one variable: ax^2 + bx + c = 0\n");
        System.out.print("What kind of equation do you want?( enter 1, 2 or 3 to choose)\nEnter your choice:  ");
        int ch = scan.nextInt();
        if( ch == 1){
            System.out.print("----Linear equation with one variable----\n");
            System.out.print("Enter value a = ");
            double a = scan.nextDouble();
            System.out.print("Enter value b = ");
            double b = scan.nextDouble();
            eq1(a, b);
        }
        else if ( ch == 2){
            System.out.print("----Linear system with two variable :a11x1 + a12y1 = b1; a21x2 + a22y2 = b2----\n");
            System.out.print("Enter coefficients\n");

            System.out.print("a11 = ");
        double a11 = scan.nextDouble();

        System.out.print("a12 = ");
        double a12 = scan.nextDouble();

        System.out.print("b1 = ");
        double b1 = scan.nextDouble();

        System.out.print("a21 = ");
        double a21 = scan.nextDouble();

        System.out.print("a22 = ");
        double a22 = scan.nextDouble();

        System.out.print("b2 = ");
        double b2 = scan.nextDouble();

        eq2(a11, a12, a21, a22, b1, b2);


        }
        else{
            System.out.print("----Second degree equation with one variable: ax^2 + bx + c = 0----\n");
            System.out.print("Enter coefficients\n");
            System.out.print("a = ");
            double a = scan.nextDouble();

            System.out.print("b = ");
            double b = scan.nextDouble();

            System.out.print("c = ");
            double c = scan.nextDouble();
            eq3(a, b, c);
        }
    
    }
    
}
