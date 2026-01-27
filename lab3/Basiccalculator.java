
// Write a program to create basic calculator by getting 2 numbers and an operation(+,
// ,/,*,%) from the user and apply the operation given in a string on the given numbers.
import java.util.Scanner;

public class Basiccalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a a&b value:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter a operetor(+,-,/,*,%)");
        char d = sc.next().charAt(0);
        switch (d) {
            case '+':
                System.out.println("a+b=" + (a + b));

                break;
            case '-':
                System.out.println("a-b=" + (a - b));

                break;
            case '*':
                System.out.println("a*b=" + (a * b));

                break;
            case '/':
                System.out.println("a/b=" + (a / b));

                break;
            case '%':
                System.out.println("a%b=" + (a % b));

                break;

            default:
                System.out.println("invelid operetor");
                break;
        }
        sc.close();

    }
}
