/**
 * Problem: Function Call Stack Tracing Exercises (06/10/2026 - Q1 to Q9)
 * 
 * Demonstrates the output and execution flow of each static function tracing problem.
 */
public class FunctionTracingExamples {

    // --- Exercise 1 ---
    static class Ex1 {
        static void A() { System.out.print("A "); }
        static void B() { System.out.print("B "); A(); }
        static void C() { A(); B(); System.out.print("C "); }
        static void run() { C(); System.out.println(); }
    }

    // --- Exercise 2 ---
    static class Ex2 {
        static void A() { System.out.print("A "); }
        static void B() { A(); System.out.print("B "); }
        static void C() { B(); A(); }
        static void run() { C(); System.out.println(); }
    }

    // --- Exercise 3 ---
    static class Ex3 {
        static void A() { System.out.print("A "); }
        static void B() { System.out.print("B "); }
        static void C() { A(); B(); }
        static void D() { C(); B(); }
        static void run() { D(); System.out.println(); }
    }

    // --- Exercise 4 ---
    static class Ex4 {
        static void A() { System.out.print("A "); }
        static void B() { System.out.print("B "); }
        static void C() { B(); A(); B(); }
        static void run() { C(); A(); System.out.println(); }
    }

    // --- Exercise 5 ---
    static class Ex5 {
        static void A() { System.out.print("A "); }
        static void B() { A(); }
        static void C() { B(); B(); }
        static void run() { C(); System.out.print("C \n"); }
    }

    // --- Exercise 6 ---
    static class Ex6 {
        static void A() { System.out.print("A "); }
        static void B() { System.out.print("B "); A(); }
        static void C() { B(); A(); }
        static void run() { C(); B(); System.out.println(); }
    }

    // --- Exercise 7 ---
    static class Ex7 {
        static void A() { System.out.print("A "); }
        static void B() { A(); System.out.print("B "); }
        static void C() { System.out.print("C "); }
        static void run() { B(); C(); A(); System.out.println(); }
    }

    // --- Exercise 8 ---
    static class Ex8 {
        static void A() { System.out.print("A "); }
        static void B() { System.out.print("B "); }
        static void C() { A(); }
        static void D() { C(); B(); C(); }
        static void run() { D(); System.out.println(); }
    }

    // --- Exercise 9 ---
    static class Ex9 {
        static void A() { System.out.print("A "); }
        static void B() { A(); System.out.print("B "); }
        static void C() { B(); System.out.print("C "); }
        static void run() { C(); B(); System.out.println(); }
    }

    public static void main(String[] args) {
        System.out.println("=== Function Call Stack Tracing Exercises ===");

        System.out.print("Ex 1 Output: ");
        Ex1.run(); // Expected: A B A C

        System.out.print("Ex 2 Output: ");
        Ex2.run(); // Expected: A B A

        System.out.print("Ex 3 Output: ");
        Ex3.run(); // Expected: A B B

        System.out.print("Ex 4 Output: ");
        Ex4.run(); // Expected: B A B A

        System.out.print("Ex 5 Output: ");
        Ex5.run(); // Expected: A A C

        System.out.print("Ex 6 Output: ");
        Ex6.run(); // Expected: B A A B A

        System.out.print("Ex 7 Output: ");
        Ex7.run(); // Expected: A B C A

        System.out.print("Ex 8 Output: ");
        Ex8.run(); // Expected: A B A

        System.out.print("Ex 9 Output: ");
        Ex9.run(); // Expected: A B C A B
    }
}
