
import java.util.Scanner;

public class harshad {

    static void main(int num) {
        int sum = 0;
        int temp = num;
        while (num != 0) {
            int last = num % 10;
            sum = sum + last;
            num = num / 10;
        }
        if (temp % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        main(num);
    }
}
