import java.util.Scanner;

public class year {
    public static void y(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            System.out.println("lep year");

        } else {
            System.out.println("not lep year  ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a year");
        int n = sc.nextInt();
        y(n);
        sc.close();
    }
}
