import java.util.Scanner;

public class Theatre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Final destination");
                break;
            case 2:
                System.out.println("Marco");
                break;
            case 3:
                System.out.println("Batman");
                break;
            case 4:
                System.out.println("HIT");
                break;
            case 5:
                System.out.println("Hey Sinamika");
                break;
            case 6:
                System.out.println("Conjuring");
                break;
            case 7:
                System.out.println("Dragon");
                break;
            case 8:
                System.out.println("Court");
                break;
            case 9:
                System.out.println("Mrs.");
                break;
            case 10:
                System.out.println("KGF");
                break;
            case 11:
                System.out.println("Chhaava");
                break;
            case 12:
                System.out.println("Angry bird");
                break;
            case 13:
                System.out.println("Friends");
                break;
            case 14:
                System.out.println("Rio");
                break;
            case 15:
                System.out.println("Fight Club");
                break;
            default:
                System.out.println("Invalid choice");

        }
    }
}
