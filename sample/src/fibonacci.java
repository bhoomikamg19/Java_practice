import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        int sum = 0;
        for(int i=1;i<=n;i++){
            System.out.print( first + " ");
            sum = first + second;
            first = second;
            second = sum;

        }

    }
}
