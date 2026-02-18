// Create a class which ask the user to enter a sentence, and it should display count of 
// each vowel type in the sentence. The program should continue till user enters a word 
// “quit”. Display the total count of each vowel for all sentences. [B] 

import java.util.*;

class sentence {
    int a1;
    int a2;
    int a3;
    int a4;
    int a5;

    void vowel() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("enter a string");
            String s = sc.nextLine();

            if (s.equals("quit")) {
                break;

            }
            a1 = 0;
            a2 = 0;
            a3 = 0;
            a4 = 0;
            a5 = 0;

            for (int index = 0; index < s.length(); index++) {
                char c = s.charAt(index);
                if (c == 'a' || c == 'A') {
                    a1++;

                }
                if (c == 'e' || c == 'E') {
                    a2++;

                }
                if (c == 'i' || c == 'I') {
                    a3++;

                }
                if (c == 'o' || c == 'O') {
                    a4++;

                }
                if (c == 'u' || c == 'U') {
                    a5++;

                }

            }
            System.out.println("a:e:i:o:u------>" + a1 + ":" + a2 + ":" + a3 + ":" + a4 + ":" + a5);

        }

    }

}

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sentence a = new sentence();
        a.vowel();

    }
}