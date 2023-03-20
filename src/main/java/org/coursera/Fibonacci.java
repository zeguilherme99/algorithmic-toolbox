package org.coursera;

import java.util.Scanner;

public class Fibonacci {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
  private static long calc_fib(int n) {
    long[] number = new long[n + 1];
    number[0] = 0;

    if (n >= 1) {
      number[1] = 1;
    }

    for (int i = 2; i <= n; i++) {
      number[i] = number[i -1] + number[i - 2];
    }

    return number[n];
  }


}
