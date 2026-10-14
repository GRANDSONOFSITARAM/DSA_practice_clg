/**
 * Problem: Pre-increment and Post-increment Operators demonstration (previously d13.cpp)
 */
public class IncrementDecrementDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        int c = ++a;
        int d = a++;
        d++;
        System.out.println("d = " + d);
        ++c;
        System.out.println("c = " + c);
        d--;
        System.out.println("d = " + d);
        d--;
        System.out.println("d = " + d);
    }
}
