import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch(choice){
            case 90:
                System.out.println("A+");
                break;
            case 80:
                System.out.println("A");
                break;
            case 70:
                System.out.println("B+");
                break;
            case 60:
                System.out.println("B");
                break;
            case 50:
                System.out.println("C+");
                break;
            case 40:
                System.out.println("C");
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}
