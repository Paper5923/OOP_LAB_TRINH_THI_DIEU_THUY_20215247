import java.util.Scanner;

public class DaysOfMonth {
    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String m ;
        String y1;
        System.out.print("Enter the month: ");
        m = scan.nextLine();
        //1
        boolean check;
        int i, y;
        
        do{
            System.out.print("Enter the year: ");
            y1 = scan.nextLine();
            
            check = isNumeric(y1);
            y = Integer.parseInt(y1);
            
        } while( check == false || y <= 0 );
        
        
        if( m.equals("January") || m.equals("Jan") || m.equals("Jan.") || m.equals("1")) System.out.print("31 days");
        else if( m.equals("February") || m.equals("Feb") || m.equals("Feb.") || m.equals("2")){
            if( y % 400 == 0   ) System.out.print("29 days");
            else if( y % 400 != 0 && y % 100 == 0) System.out.print("28 days");
            else if( y % 4 == 0) System.out.print("29 days");
            else System.out.print("28 days");
        }
        else if( m.equals("March") || m.equals("Mar") || m.equals("Mar.") || m.equals("3")) System.out.print("31 days");
        else if( m.equals("April") || m.equals("Apr") || m.equals("Apr.") || m.equals("4")) System.out.print("30 days");
        else if( m.equals("May") || m.equals("5")) System.out.print("31 days");
        else if( m.equals("June") || m.equals("Jun") || m.equals("Jun..") || m.equals("6")) System.out.print("30 days");
        else if( m.equals("July") || m.equals("Jul") || m.equals("Jul.") || m.equals("7")) System.out.print("31 days");
        else if( m.equals("August") || m.equals("Aug") || m.equals("Aug.") || m.equals("8")) System.out.print("31 days");
        else if( m.equals("September") || m.equals("Sep") || m.equals("Sep.") || m.equals("9")) System.out.print("30 days");

        else if( m.equals("October") || m.equals("Oct") || m.equals("Oct.") || m.equals("10")) System.out.print("31 days");
        else if( m.equals("November") || m.equals("Nov") || m.equals("Nov.") || m.equals("11")) System.out.print("30 days");
        else if( m.equals("December") || m.equals("Dec") || m.equals("Dec.") || m.equals("12")) System.out.print("31 days");
    }
}
