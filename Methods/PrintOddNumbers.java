import java.util.Scanner;

public class PrintOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        OddNumbers n = new OddNumbers();
        n.printOdd(a, b);
    }
}
class OddNumbers{
    public void printOdd(int a, int b){
        System.out.println("All the odd numbers between "+a+" and " + b + " are:");
        for(int i = a; i < b; i++){
            if(i%2==1){
                System.out.print(i + " ");
            }
        }
    }
}
