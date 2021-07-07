package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Khai bao va gan gia tri cho 2 mang
        Scanner input = new Scanner(System.in);
        int Arr1[] = new int[4];
        int Arr2[] = new int[3];
        System.out.println("Nhap phan tu mang 1");
        for (int i = 0; i < Arr1.length; i++) {
            Arr1[i] = input.nextInt();
        }
        System.out.println("Nhap phan tu mang 2");
        for (int j = 0; j < Arr2.length; j++) {
            Arr2[j] = input.nextInt();
        }
        int Arr3[] = new int[7];
        for (int i = 0; i < Arr1.length; i++) {
            Arr3[i] = Arr1[i];
        }
        for (int i = Arr1.length; i < Arr3.length; i++) {
          Arr3[i]=Arr2[i-Arr1.length];
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < Arr3.length; j++) {
            System.out.print(Arr3[j] + "\t");
        }
    }
}
