import java.util.Scanner;

public class Hotelservices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch(choice){
            case 101:
                System.out.println("You ordered veg");
                break;
            case 102:
                System.out.println("You ordered non-veg");
                break;
            case 103:
                System.out.println("You ordered ice-cream");
                break;
            case 104:
                System.out.println("You ordered biryani");
                break;
            case 105:
                System.out.println("You ordered paneer rice");
                break;
            case 106:
                System.out.println("You ordered gobi");
                break;
            default:
                System.out.println("Invalid choice");


        }
    }
}
