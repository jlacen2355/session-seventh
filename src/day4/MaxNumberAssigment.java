package day4;

public class MaxNumberAssigment {

   static int a = 25;
   static int b = 50;
   static int c = 100;

    public static void main(String[] args) {

        int result = a;

//Option #1
        String message = (result >= b && result >= c) ? ("Maximum Number is --> " + result) : ((b >= result && b >= c) ? ("Maximum Number is --> " + b) : ("Maximum Number is --> " + c));
        System.out.println(message);

//Option #2
//        if (a >= b && a >= c)
//            System.out.println("Maximum Number is --> " + a);
//        else if (b >= a && b >= c)
//            System.out.println("Maximum Number is --> " + b);
//        else
//            System.out.println("Maximum Number is --> " + c);

//Option #3
//        if(result < b){
//            result = b;
//            if(result < c){
//                result = c;
//            }
//        }
//        else if(result < c){
//            result = c;
//        }
//        System.out.println("Maximum Number is --> " + result);

//Option #4
//        result = Math.max(result,b);
//        result = Math.max(result,c);
//        System.out.println("Maximum Number is --> " + result);

    }
}
