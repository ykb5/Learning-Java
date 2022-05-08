/*
 * As given there are two sample methods: First one returns the sum of two numbers a and b
 * and second one returns the subtraction of a and b.
 * if a-b is negative then return value would be 0. Use ternary operator to call these two methods.
 * If a>b then ternary should call sum(a,b) but if a<b then ternary operator should call sub(a,b).
 * Eventually print the result of the ternary operation on variable a and b.
 * Note: Ternary operator can call a method even for true and false values
 */

package Assignment_01;

import java.util.Scanner;

public class Q06 {

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int result = a > b ? sum(a, b) : sub(a, b);
        System.out.println("Result: " + result);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b < 0 ? 0 : a - b;
    }
}