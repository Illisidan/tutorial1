package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter amount of integers in your array: ");
        a = input.nextInt();
        int c[] = new int[a];
        System.out.println("Input numbers to be sorted: ");
        for (int i = 0; i < a; i++) {
            c[i] = input.nextInt();
        }
        for (int i = 0; i < a; i++) {
            for (int j = i + 1; j < a; j++) {
                if (c[i] < c[j]) {
                    b = c[i];
                    c[i] = c[j];
                    a = b;
                }
            }
        }
        for (int i = 0; i < a - 1; i++ )
        {
            System.out.println(c[a-1]);
        }
    }



    }
