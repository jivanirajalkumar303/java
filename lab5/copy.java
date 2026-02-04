//Write a Java program to copy all the elements of an array to another array and print 
//both the array elements. [B] 

import java.util.Scanner;

public class copy {
    public static void copyofarray(int a[]) {
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + b[i]);
        }
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
        copyofarray(a);
    }
}
