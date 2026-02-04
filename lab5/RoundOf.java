// There is an integer array nums sorted in ascending order (with distinct values). 
// Prior to being passed to your function, nums is possibly rotated at an unknown pivot 
// index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., 
// nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] 
// might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]. 
// Given the array nums after the possible rotation and an integer target, return the 
// index of target if it is in nums, or -1 if it is not in nums.[C] 
// Example 1: 
// Input: nums = [4,5,6,7,0,1,2], target = 0 
// Output: 4 
// Example 2: 
// Input: nums = [4,5,6,7,0,1,2], target = 3 
// Output: -1 run sum in ad aarray,suffle in ad 

import java.util.Scanner;

public class RoundOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a k");
        int k = sc.nextInt();
        System.out.println("enter a serch element");
        int s = sc.nextInt();
        System.out.println("enter a size:");

        int size = sc.nextInt();
        int a[] = new int[size];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter a index : " + i);
            a[i] = sc.nextInt();
        }

        int[] rotatedarray = rotated(a, k, s);
        serch(rotatedarray, s);

    }

    public static int[] rotated(int a[], int k, int s) {
        int temp[] = new int[a.length];
        int j = 0;
        for (int i = k; i < a.length; i++) {

            temp[j++] = a[i];

        }
        for (int i = 0; i < k; i++) {
            temp[j++] = a[i];
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(temp[i] + " ");

        }
        return temp;

    }

    public static void serch(int[] temp, int s) {
        System.out.println("");
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == s) {
                System.out.println("serch element index");
                System.out.println(i);

            }
        }

    }
}