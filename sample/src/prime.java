import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        if(n % 2 != 0){
            System.out.println("It is prime");
        }
        else System.out.println("Not a prime number");
    }
}
