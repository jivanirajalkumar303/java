import java.util.Scanner;

public class divisionStudent {
    public static void division(double per){
        if (per>=60) {
            System.out.println("first division ");
            
        }
        else if (per<=59 && per>=50) {
            System.out.println(" second division ");
            
        }
        else if (per<=49 &&  per>=40) {
            System.out.println("Third division ");
            
        }
        else{
            System.out.println("fail");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a fist subject");
        int s1 = sc.nextInt();
        System.out.println("enter a second subject");
        int s2 = sc.nextInt();
        System.out.println("enter a third subject");
        int s3 = sc.nextInt();
        System.out.println("enter a fourth subject");
        int s4 = sc.nextInt();
        System.out.println("enter a fivth subject");
        int s5 = sc.nextInt();
        double per=(s1+s2+s3+s4+s5)/5.0;
        division(per);
        sc.close();

    }

}
