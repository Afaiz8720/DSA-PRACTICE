import java.util.*;
public class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row :");
        int row = sc.nextInt();
        System.out.println("Enter col :");
        int col = sc.nextInt();
        
        int count = 1 ;
        for (int i = 1 ; i < row ; i++) {
            for (int j = 1 ; j <= i ; j++) {
                System.out.print(count++ + " ");
            }System.out.println();
        }System.out.println();
        sc.close();

    }
}
