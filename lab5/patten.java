import java.util.Scanner;

public class patten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a size of pettan");
        int n=sc.nextInt();
        pettanquar(n);

    }
    public static void pettanquar(int n){

        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==1 || j==1 || i==n || j==n ){
                    System.out.print("*"+" ");
                    
                }
                else{
                    System.out.print(" "+" ");
                }
                
            }
            System.out.println();
            
        }
        
    }
}
