import java.util.Scanner;

public class QNo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= n; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}