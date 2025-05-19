import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice) {

            case 1:
                System.out.println("Balance Inquiry");
                break;
            case 2:
                System.out.println("Mini statement");
                break;
            case 3:
                System.out.println("Services");
                break;
            case 4:
                System.out.println("Cash withdrawal");
                break;
            case 5:
                System.out.println("Pin change");
                break;
            case 6:
                System.out.println("Funds transfer");
                break;
            case 7:
                System.out.println("Bill payment");
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}