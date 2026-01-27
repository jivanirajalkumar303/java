import java.util.Scanner;

public class Edesimaltobainarye {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a decimal number");
        int a = sc.nextInt();
        int[] b=new int[100];
        for(int i=1;i<=20;i++){
            b[i]=a%2;
            a=a/2;
        }
           for(int i=19;i>=0;i--){
           System.out.print(b[i]);
           }
           sc.close();
    }
}
