package javabasic;

import java.util.Scanner;

public class ArraySizeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array : ");

        int size = sc.nextInt();

        int[] arr = new int[size];  

        for(int i = 0; i < size; i++) {
        	System.out.println("enter the value: ");

            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}
