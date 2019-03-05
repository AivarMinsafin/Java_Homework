package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String input= sc.next();
        char[] line= input.toCharArray();
        change(line);
        String output= new String(line);
        System.out.println(output);
    }
    static void change(char[] arr){
        for (int i = 1; i <arr.length; i++) {
            if(arr[i]==arr[i-1]){
                arr[i]='*';
                arr[i-1]='*';
            }
        }
    }
}
