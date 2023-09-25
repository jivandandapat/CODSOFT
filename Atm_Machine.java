import java.util.*;

public class Atm_Machine {
    private static int totalAmount = 100000;
    private static int WithdrawAmount = 0;
    private static int amountToDeposit = 0;

    public static void choose() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select option:");
        System.out.println("Cash withdraw - press 1 :");
        System.out.println("Check Balance - press 2 :");
        System.out.println("Deposit - press 3 :");
        System.out.println("Exit - press 4 :");
        System.out.println();
        System.out.print("Please press the number: " );
        int number = sc.nextInt();


        switch(number) {
            case 1:
                System.out.println("Enter your 4 digit pin number: ");
                int pin = sc.nextInt();
                if (isValidPin(pin)) {
                    System.out.print("Enter the amount to withdraw: ");
                    WithdrawAmount = sc.nextInt();

                    if (WithdrawAmount <= totalAmount) {
                        System.out.println("Please wait while your transaction is being processed...");
                        System.out.println("Please collect your cash");
                        System.out.println("Your transaction has been successful.....");
                        totalAmount -= WithdrawAmount;
                    } else {
                        System.out.println("You don't have sufficient balance");
                        System.out.println("Your transaction has been declined....");
                    }
                } else {
                    System.out.println("Invalid PIN. Please enter a 4-digit PIN.");
                }
                break;

            case 2:
                System.out.println("Please enter your 4 digit pin number: ");
                pin = sc.nextInt();
                if (isValidPin(pin)) {
                    System.out.println("Your available balance is : " + totalAmount);
                } else {
                    System.out.println("Invalid PIN. Please enter a 4-digit PIN.");
                }
                break;

            case 3:
                System.out.print("Please enter your amount to deposit: ");
                amountToDeposit = sc.nextInt();
                System.out.println("Please enter your 4 digit pin number: ");
                pin = sc.nextInt();
                if (isValidPin(pin)) {
                    totalAmount += amountToDeposit;
                    System.out.println("Please wait while your transaction is being processed....");
                    System.out.println("Your amount of " + amountToDeposit + " has been successfully deposited.");
                } else {
                    System.out.println("Invalid PIN. Please enter a 4-digit PIN.");
                }
                break;

            case 4:
                System.out.println("Please remove your debit card.");
                System.out.println();
                System.out.println("!!--- THANK YOU FOR USING SBI BANK ATM ---!!");
                System.out.println();
                System.exit(0);
                break;

            default:
                System.out.println("Invalid option. Please select a valid option.");
        }
        System.out.println();
        choose();
    }

    public static boolean isValidPin(int pin) {
        // Check if the PIN is exactly 4 digits
        return pin >= 1000 && pin <= 9999;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("!!--- Welcome to SBI ATM ----!!");
        System.out.println();
        System.out.println("Please Insert Your Debit Card...");
        System.out.println("Please enter any Random number...");
        int num = sc.nextInt();
        System.out.println("Please wait while we are fetching your Details...");
        System.out.println();
        choose();

    }
}
