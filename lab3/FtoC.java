
//Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f
//32*5/9 ) 
import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a fahrenheit:");
        double f = sc.nextDouble();
        System.out.println("celsisus:" + (f - (32 * 5 / 9)));
        sc.close();
    }

}
