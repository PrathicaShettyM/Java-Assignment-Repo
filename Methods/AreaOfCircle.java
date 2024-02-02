import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        int r = sc.nextInt();
        sc.close();

        Area a = new Area();
        double result = a.area(r);
        System.out.println("The area of the circle is: " + result);
    }
}

class Area{
    public double area(int r){
        double area = 3.14*r*r;
        return area;
    }
}
