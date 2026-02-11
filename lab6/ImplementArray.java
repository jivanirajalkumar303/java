// Implement an array with 5 elements in class A. Create four methods for array 
// operation(sortArray(), searchArray(), SumArray(), and avgArray()) and call all the four 
// methods using object.[B] 

import java.util.*;

class A {

    int array[] = { 2, 3, 4, 1, 5 };

    // short mathod
    void sortArray() {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }

            }

        }
        System.out.println(" sort arry :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    // serch element mate method
    void searchArray(Scanner sc) {
        System.out.println(" enter a search number");
        int x = sc.nextInt();
        int co = 0;
        for (int index = 0; index < array.length; index++) {
            if (array[index] == x) {
                co++;
                break;
            }

        }
        if (co == 0) {
            System.out.println("number is not found");

        } else {
            System.out.println(x + "  number is found");
        }

    }

    // array of sum mate method
    void SumArray() {
        int sum = 0;
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }

        System.out.println("sum of array : " + sum);
    }
    // avg mate method

    void avgArray() {
        double sum = 0.0;
        for (int index = 0; index < array.length; index++) {
            sum += array[index];
        }
        double avg = sum / array.length;

        System.out.println("avg of array : " + avg);

    }

}

public class ImplementArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        A obj = new A();
        obj.sortArray();
        System.out.println();

        obj.searchArray(sc);

        obj.SumArray();
        obj.avgArray();

    }
}