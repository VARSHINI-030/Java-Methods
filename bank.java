
import java.util.Scanner;

class bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pin = 2345;
        float balance = 1000;

        System.out.print("Enter ATM PIN: ");
        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter withdraw amount: ");
                    float withdraw = sc.nextFloat();
                    if (withdraw < 500 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdraw Successful");
                    } else {
                        System.out.println("Invalid amount");
                    }
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    float deposit = sc.nextFloat();
                    balance += deposit;
                    System.out.println("Amount Deposited");
                    break;

                case 3:
                    System.out.println("Balance: " + balance);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } else {
            System.out.println("Incorrect PIN");
        }
    }
}
