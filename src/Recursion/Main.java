package Recursion;

public class Main {
    static int sum(int n) {
        if (n == 1) {   // base case
            return 1;
        }
        return n + sum(n - 1); // recursive call
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of first " + n + " numbers = " + sum(n));
    }
}
