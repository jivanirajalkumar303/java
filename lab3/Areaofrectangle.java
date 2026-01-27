
//Write a program to calculate the area of Rectangle.[A] 
import java.util.Scanner;

public class Areaofrectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a rectangle shortlenth:");
        double a = sc.nextDouble();
        System.out.println("enter a rectangale shortlenth:");
        double b = sc.nextDouble();
        System.out.println("area of rectangle : " + (a * b));
        sc.close();
    }

}
