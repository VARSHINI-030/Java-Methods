
import java.util.Scanner;

public class overload {

    static void add(int a, int b) {
        System.out.println("The sum of two integers is: " + (a + b));
    }

    static void add(int a, int b, int c) {
        System.out.println("The sum of three integers is: " + (a + b + c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();
        add(num1, num2);
        add(num1, num2, num3);
    }
}
