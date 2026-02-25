
import java.util.Scanner;

public class strong {

    static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static boolean Strong(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum = sum + factorial(digit);
            temp = temp / 10;
        }

        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (Strong(num)) {
            System.out.println(num + " is a Strong Number");
        } else {
            System.out.println(num + " is NOT a Strong Number");
        }
    }
}
