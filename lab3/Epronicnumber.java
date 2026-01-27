import java.util.Scanner;

public class Epronicnumber {

    // public static void main(String[] args) {
    // for(int i=1;i<=200;i++){ //betwen 1to 200
    // for(int j=1;j<=200;j++){
    // if (j*(j+1)==i) {
    // System.out.print(i +" ");
    // }
    // }
    // }
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int n = sc.nextInt();
        int c = 1;
        for (int i = 1; i <= n; i++) {
            if (i * (i + 1) == n) {

                c = 1;
                break;
            } else {
                c = 0;
            }
        }
        if (c == 1) {
            System.out.println("number is pronic");
        } else {
            System.out.println("number is not pronic");
        }
        sc.close();
    }
}