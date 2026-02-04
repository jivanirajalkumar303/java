// Write a program that creates and initializes a four integer element array. Calculate and 
// display the average of its values.[A] 

import java.util.Scanner;

public class AvgOfArray {
    public static void avgofaa(int a[], int sum) {
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];

        }
        double avg = sum / (double) a.length;
        System.out.println(avg);
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
        avgofaa(a, sum);

    }
}
