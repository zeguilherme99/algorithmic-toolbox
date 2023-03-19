package org.coursera;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer a = sc.nextInt();
        Integer b = sc.nextInt();
        Integer sum = a + b;
        System.out.println(sum);
    }
}