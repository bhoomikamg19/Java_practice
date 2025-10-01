import java.util.Scanner;

public class table3 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=1;i<=10; i++){
            System.out.println(a + "*" + i + "=" + (a*i));

        }
    }
}
