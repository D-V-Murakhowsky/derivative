package com.company;

import java.util.Date;


public class solver {
    public static void solve(double[] Aij, double n1, double n2, double x1, double x2, double precision){
        Date date=new Date();
        long start = date.getTime();
        double res = method_chord(x1, x2, precision, Aij, n1, n2);
        long finish = date.getTime();
        System.out.println("Exec time: " + (finish - start) + " ms");
        System.out.println("Result: " + res);
    }

    public static double method_chord (double x_prev, double x_curr, double e, double[] Aij, double n1, double n2) {
        double x_next = 0;
        double tmp;
        do{
            tmp = x_next;
            x_next = x_curr - f(x_curr, Aij, n1, n2) * (x_prev - x_curr) / (f(x_prev, Aij, n1, n2) - f(x_curr, Aij, n1, n2));
            x_prev = x_curr;
            x_curr = tmp;
        } while (Math.abs(x_next - x_curr) > e);
        return x_next;
    }

    private static double f(double x, double[] Aij, double n1, double n2){
        double A11 = Aij[0];
        double A12 = Aij[1];
        double A21 = Aij[2];
        double A22 = Aij[3];
        return 1/((n1 - 1)*Math.pow((Math.pow(A11,n1)*A12)/(Math.pow(A12,n1)*(A11 + x)),(1/(n1 - 1)))) -
                1/((n2 - 1  )*Math.pow((Math.pow(A21,n2)*A22)/(Math.pow(A22,n2)*(A21 - x)),(1/(n2 - 1))))+
                1/Math.pow((Math.pow(A11,n1)*A12)/(Math.pow(A12,n1)*(A11 + x)),(1/(n1 - 1)))
                - 1/Math.pow((Math.pow(A21,n2)*A22)/(Math.pow(A22,n2)*(A21 - x)),(1/(n2 - 1)));
    }

}
