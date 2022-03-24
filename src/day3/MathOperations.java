package day3;

public class MathOperations {
    public static void main(String[] args) {
        // ASSIGNMENT --> program the following math operation ((A+B)*c)

        int A = 2;
        int B = 8;
        int C = 10;

        //Option #1
        int x = 0;
        x = ((A+B)*C);
        System.out.println(x);

        //Option #2 (Step by Step)
        int y = 0;
        y = A + B;
        y *= C;
        System.out.println(y);


    }
}
