import java.util.Scanner;

public class CountAndSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        Method m = new Method();
        m.func(n);
    }
}
class Method{
    public void func(int n){
        System.out.println("Square of " + n + " is: " + n*n);
        int count = 0;
        while(n!=0){
            count++;
            n/=10;
        }
        System.out.println("Number of digits in the number: " + count);

    }
}
