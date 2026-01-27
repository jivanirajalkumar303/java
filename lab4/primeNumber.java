import java.util.Scanner;

public class primeNumber {
    public static void pn(int n) {
        int co = 0;
        for (int i = 2; i < n; i++) {

            if (n % i == 0) {
                co++;

            }
        }
        if (co == 0) {
            System.out.println("number is prime");

        } else {
            System.out.println("number is not prime");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        pn(n);
        sc.close();
    }
}
