import java.util.*;
public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row :");
        int row = sc.nextInt();
        System.out.println("Enter col :");
        int col = sc.nextInt();

        for (int i = 1 ; i < row ; i++) {
            for (int j = 1 ; j < col ; j++) {
                System.out.print(i + j + " ");
            }System.out.println();
        }System.out.println();
        sc.close();

    }
}
