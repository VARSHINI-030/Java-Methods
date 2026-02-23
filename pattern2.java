/*    1
    1 2
  1 2 3
1 2 3 4
 */

import java.util.Scanner;

public class pattern2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            for (int k = 1; k <= input - i; k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
