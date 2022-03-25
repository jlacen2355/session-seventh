package day3;

public class MathOperations {
    public static void main(String[] args) {
        // ASSIGNMENT --> program the following math operation ((A+B)*c)

        int a = 2;
        int b = 8;
        int c = 10;

        //Option #1
        int x=0;
        x = ((a+b)*c);
        System.out.println(x);

        //Option #2 (Step by Step)
        int y = 0;
        y = a + b;
        y *= c;
        System.out.println(y);


    }
}
