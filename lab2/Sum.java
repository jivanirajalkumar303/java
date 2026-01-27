
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        System.out.println("enter a fist number");
        double a = ac.nextDouble();
        System.out.println("enter a second number");
        double b = ac.nextDouble();
        double sum = a + b;
        System.out.println("sum: " + sum);
        ac.close();

    }
}
