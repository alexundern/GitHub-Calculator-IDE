package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("My app for Users!");
        System.out.println("Version 2.0");
        int a = 8;
        int b = 2;
        int c = add(a, b);
        System.out.println(c);
        int d = multiply(a, b);
        System.out.println(d);
        int e = minus(a, b);
        System.out.println(e);
        int f = divide(a, b);
        System.out.println(f);
    }

    private static int add(int a, int b) {
        return a + b;
    }

    private static int multiply(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
