import java.util.Scanner;

public class Atm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1- Balance");
        System.out.println("2- Withdraw");
        System.out.println("3- Deposit");
        System.out.println("4- Exit");
        int choice = sc.nextInt();
        int balance = 1000;
        switch (choice){
            case 1:
                System.out.println("Your balance is" + balance);
                break;
            case 2:
                System.out.println("amount to be withdrawn: ");
                int withdraw = sc.nextInt();
                System.out.println("Amount withdrawn: " + withdraw);
                break;
            case 3:
                System.out.println("Amount to be deposited: ");
                int deposit = sc.nextInt();
                System.out.println("Amount deposited: " + deposit);
                break;
            case 4:
                System.out.println("Exit");
        }
    }
}
