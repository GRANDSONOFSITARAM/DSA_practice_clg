/**
 * Problem: Function Analysis & Tracing Examples (Google Doc End Section)
 * 
 * Contains all 6 function analysis snippets from the document:
 * 1. Iterative Sum of 1 to n
 * 2. Count digits in a number
 * 3. Sum of digits in a number
 * 4. Function composition: square(add(a, b))
 * 5. Function chaining: fun2 calls fun1
 * 6. Recursive Factorial
 */
public class FunctionAnalysisDemo {

    // 1. Sum of 1 to n
    static int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
        }
        return s;
    }

    // 2. Count digits
    static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // 3. Sum of digits
    static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // 4. Function composition
    static int add(int a, int b) {
        return a + b;
    }

    static int square(int x) {
        return x * x;
    }

    // 5. Function chaining
    static int fun1(int x) {
        return x + 2;
    }

    static int fun2(int x) {
        return fun1(x) * 2;
    }

    // 6. Recursive factorial
    static int recursiveFactorial(int x) {
        if (x <= 1)
            return 1;
        return x * recursiveFactorial(x - 1);
    }

    public static void main(String[] args) {
        System.out.println("=== 1. Sum ===");
        System.out.println("sum(5) = " + sum(5)); // 15
        System.out.println("sum(3) = " + sum(3)); // 6

        System.out.println("\n=== 2. Count Digits ===");
        System.out.println("countDigits(12345) = " + countDigits(12345)); // 5

        System.out.println("\n=== 3. Sum of Digits ===");
        System.out.println("sumOfDigits(1234) = " + sumOfDigits(1234)); // 10

        System.out.println("\n=== 4. Functional Composition ===");
        System.out.println("square(add(2, 3)) = " + square(add(2, 3))); // 25

        System.out.println("\n=== 5. Function Chaining ===");
        System.out.println("fun2(5) = " + fun2(5)); // 14

        System.out.println("\n=== 6. Recursive Factorial ===");
        System.out.println("recursiveFactorial(4) = " + recursiveFactorial(4)); // 24
    }
}
