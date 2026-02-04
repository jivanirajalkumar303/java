
// Write a Java program to sum values of an array.
import java.util.Scanner;

public class sumarray {
    public static void sumofarry(int a[], int sum) {
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a size:");
        int sum = 0;
        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter a index : " + i);
            a[i] = sc.nextInt();
        }
        sumofarry(a, sum);

    }

}
