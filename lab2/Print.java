import java.util.Scanner;

public class Print {
    public static void main(String[] args) {
        Scanner ac=new Scanner(System.in);
        System.out.println("ENTER A NUMBER INT");
        int a=ac.nextInt();
        System.out.println("ENTER A NUMBER DOUBALE");
        double b=ac.nextDouble();
        System.out.println("ENTERA NUMBER FLOAT");
        float c=ac.nextFloat();
        System.out.println("ENTER A STRING");
        char d=ac.next().charAt(0);
        System.out.println("print all");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        ac.close();
                   


    }
}
