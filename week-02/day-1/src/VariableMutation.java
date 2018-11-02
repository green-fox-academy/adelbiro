package com.company;

public class VariableMutation {

    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a = (a + 10);
        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b = (b - 7);
        System.out.println(b);

        int c = 44;
        // please double c's value
        c = (c + c);
        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d = (d /5);
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e =  (int) Math.pow (e, 3);
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        // tell if f1 is bigger than f2 (print as a boolean)
        System.out.println(f1 > f2);

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        System.out.println((g2 * 2) > g1);

        int h = 135798745;
        // tell if it has 11 as a divisor (print as a boolean)
        int residual = h % 11;
        System.out.println(residual == 0);

        int i1 = 10;
        int i2 = 3;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        int i2cube = (i2 * i2 * i2);
        int i2sqr =  i2*i2;
        boolean result1 = ((i2cube) > (i1)) && (i1 > (i2sqr));
        System.out.println(result1);

        int j = 1521;
        int answer1 = j % 5;
        int answer2 = j % 3;
        boolean result2 =  (answer1 == 0 || answer2 == 0);
        // tell if j is dividable by 3 or 5 (print as a boolean)
        System.out.println(result2);

        String k = "Apple";
        //fill the k variable with its content 4 times
        k = k + k + k + k;
        System.out.println(k);
    }
}
