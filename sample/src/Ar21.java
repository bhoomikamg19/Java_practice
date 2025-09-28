import java.util.Scanner;

public class Ar21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] a = new int[5];
        for (int i=0; i<5; i++){
            System.out.println(" Enter the age of " + (i+1) + " student is:" );
            a[i] = scan.nextInt();

        }
        System.out.println("age of students are:");
        for(int i=0; i<5; i++){
            System.out.print( a[i] + " ");
        }
    }
}
