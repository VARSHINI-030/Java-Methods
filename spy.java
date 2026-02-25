
import java.util.Scanner;

public class spy {

    static boolean isSpy(int num) {
        int sum = 0;
        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            product = product * digit;
            num = num / 10;
        }
        return sum == product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isSpy(num)) {
            System.out.println(num + " is a Spy Number");
        } else {
            System.out.println(num + " is NOT a Spy Number");
        }
    }
}
