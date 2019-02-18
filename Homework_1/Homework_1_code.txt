package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max2 = 0, max = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a > max) {
                max2 = max;
                max = a;
            } else if (a > max2) {
                max2 = a;
            }
        }
        System.out.println(max + " " + max2);
    }
}
