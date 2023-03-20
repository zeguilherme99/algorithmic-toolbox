package org.coursera;

import java.util.*;

public class LCM {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long a = scanner.nextLong();
    long b = scanner.nextLong();

    System.out.println(lcm(a, b));
  }

  private static long lcm(long a, long b) {
    long mdc = gcd_naive(a, b);
    return (a / mdc) * b;
  }

  private static long gcd_naive(long a, long b) {
    if (b == 0) {
      return a;
    }
    long aLine = a % b;
    return gcd_naive(b, aLine);
  }
}
