// Write a program to print given array in reverse order.[A]

import java.util.Scanner;

public class Rev {
    public static void revofaary(int a[]){

       for (int i = a.length-1; i >=0; i--){
          System.out.print(" "+ a[i]);
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
        revofaary(a);
        
    }
}
