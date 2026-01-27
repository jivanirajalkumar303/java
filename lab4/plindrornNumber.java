import java.util.Scanner;

public class plindrornNumber {
    public static void p(int n) {
        int rev = 0;
        int temp = 0;
        temp = n;
        for (int i = 0; n != 0; i++) {
            int rem = n % 10;

            rev = rev * 10 + rem;
            n = n / 10;

        }
        System.out.println("rev" + rev);
        System.out.println("n" + temp);
        if (rev == temp) {
            System.out.println(" number is palindrome ");

        } else {
            System.out.println(" number is not palindrome");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        p(n);
        sc.close();
    }
}