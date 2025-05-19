import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int n1=10;
        int n2=20;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        char choice = sc.next().charAt(0);
        switch(choice){
            case '+':
                int sum= n1 + n2;
                System.out.println("Addition:" + sum);
                break;
            case '-':
                int diff= n1 - n2;
                System.out.println("Difference:" + diff);
                break;
            case '*':
                int mul= n1 * n2;
                System.out.println("Multiplication:" + mul);
                break;
            case '/':
                int div= n2 / n1;
                System.out.println("Quotient:" + div);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
