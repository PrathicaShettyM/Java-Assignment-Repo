import java.util.Scanner;

public class QNo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the no. of cols: ");
        int m = sc.nextInt();
        sc.close();
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
