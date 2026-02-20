
import java.util.Scanner;

public class age {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birth_year = sc.nextInt();
        int current_year = sc.nextInt();
        if (birth_year > current_year) {
            System.out.println((100 - birth_year) - current_year);
        } else {
            System.out.println(current_year - birth_year);
        }
    }
}
