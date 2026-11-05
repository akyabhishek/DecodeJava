package bitwiseOperators;

public class Bitwise {
    public static void main(String[] args) {
        int a = 5; // binary: 0101
        int b = 3; // binary: 0011

        System.out.println("Bitwise AND - ");
        System.out.println("a & b = " + (a & b)); // bitwise AND
        System.out.println("Bitwise OR - ");
        System.out.println("a | b = " + (a | b)); // bitwise OR
        System.out.println("Bitwise XOR - ");
        System.out.println("a ^ b = " + (a ^ b)); // bitwise XOR
        System.out.println("Bitwise NOT - ");
        System.out.println("~a = " + (~a));       // bitwise NOT
        System.out.println("LEFT SHIFT - ");
        System.out.println("a << 1 = " + (a << 1)); // left shift
        System.out.println("RIGHT SHIFT - ");
        System.out.println("a >> 1 = " + (a >> 1)); // right shift
    }
}
