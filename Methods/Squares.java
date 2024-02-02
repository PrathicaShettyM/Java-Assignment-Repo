import java.util.Scanner;

public class Squares{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        // create an instance of the class
        Square sq = new Square();
        sq.squares(n);
    }
}

class Square{
    public void squares(int n){
        System.out.print("Squares are: ");
        for(int i = 1; i <=n ; i++){
            System.out.print(i*i + " ");
        }
    }
}