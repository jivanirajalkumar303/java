import java.util.Scanner;

public class maximum {
    public static int m(int a1,int a2,int a3){
    //     if (a1>a2 && a1>a3) {
    //         return a1;
            
    //     }
    //     else if (a2>a1 && a2>a3) {
    //         return a2;
            
    //     }
    //     else{
    //         return a3;
    //     }

    // }
   int max=(a1>a2 && a1>a3)?(a1):((a2>a1 && a2>a3)?a2:a3);
   return max;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a fist number");
        int a1 = sc.nextInt();
        System.out.println("enter a second number");
        int a2 = sc.nextInt();
        System.out.println("enter a third number");
        int a3 = sc.nextInt();
        m(a1, a2, a3);
        System.out.println( "maximum " + m(a1, a2, a3));
        sc.close();
    }
}