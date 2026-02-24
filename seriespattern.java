
import java.util.Scanner;

public class seriespattern {

    static void printSeries(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0) {
                System.out.print((i * i * i) + ",");
            } else {
                System.out.print((i * i) + ",");
            }
        }
        System.out.print("...");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        printSeries(n);
    }
}
