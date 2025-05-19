import java.util.Scanner;

public class Vendingmachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        char choice = sc.next().charAt(0);
        switch(choice){
            case 'A':
                System.out.println("chocolate");
                break;
            case 'B':
                System.out.println("mango");
                break;
            case 'C':
                System.out.println("apple");
                break;
            case 'D':
                System.out.println("juice");
                break;
            case 'E':
                System.out.println("cookies");
                break;
            case 'F':
                System.out.println("toy");
                break;
            case 'G':
                System.out.println("ice cream");
                break;
            case 'H':
                System.out.println("Teddy");
                break;
            case 'I':
                System.out.println("Bear");
                break;
            case 'J':
                System.out.println("Green tea");
                break;
            default:
                System.out.println("Invalid choice ");
        }
    }
}
