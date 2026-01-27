import java.util.Scanner;

public class betweenprime {
    public static void pb(int a1, int a2) {

        for (int i = a1; i <= a2; i++) {
            int co = 0;
            if (i==1) {
                
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    co++;
                    break;

                }

            }
            if (co == 0) {
                System.out.print(" " + i);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a START number");
        int a1 = sc.nextInt();
        System.out.println("enter a END number");
        int a2 = sc.nextInt();
        pb(a1, a2);

    }

}