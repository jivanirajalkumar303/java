
// Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f
// 32*5/9 ) 
import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a:");
        int a = sc.nextInt();
        System.out.println("enter value of b:");
        int b = sc.nextInt();
        System.out.println("enter value of c:");
        int c = sc.nextInt();
        if (a>b && a>c) {
            System.out.println(" a is a lagest number");
        }
        else if (b>a && b>c) {
             System.out.println(" b is a lagest number");
        }
        else {
            System.out.println("c is largest number");
        }
        sc.close();
    }
}
