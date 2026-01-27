import java.util.Scanner;

public class Ehappy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number ");
        int n = sc.nextInt();
        while (n != 1 && n != 4) {
            int sum = 0;
            while (n > 0) {
                sum = sum + ((n % 10) * (n % 10));
                n = n / 10;
            }
            n = sum;
        }
        if (n == 1) {
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
        sc.close();

    }
}