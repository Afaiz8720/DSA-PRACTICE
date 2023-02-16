package Loops;
import java.util.*;
public class numberInWords {
    private static int i;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

       String str = "" ;
        while(num > 0){
            int rem = num % 10 ;
            num /= 10 ;
            str += rem ;   
        }
        System.out.println("Reverse of String is : " + str);

        char c ;
        
        for (int i = str.length() - 1 ; i >= 0 ; i--) {
            
            c = str.charAt(i);
            switch (c) {
                case '0' : System.out.print(" zero"); break ;
                case '1' : System.out.print(" one"); break ;
                case '2' : System.out.print(" two"); break ;
                case '3' : System.out.print(" three"); break ;
                case '4' : System.out.print(" four"); break ;
                case '5' : System.out.print(" five"); break ;
                case '6' : System.out.print(" six"); break ;
                case '7' : System.out.print(" seven"); break ;
                case '8' : System.out.print(" eight"); break ;
                case '9' : System.out.print(" nine"); break ;
    
            }
        }
    }
}
