package com.company;

public class Main {

    public static void main(String[] args) {
        double A11 = 1232435;
        double A12 = 4.3204e9;
        double A21 = 1202435;
        double A22 = 4.8024e9;
        double n1 = 0.5;
        double n2 = 0.6;
	    solver.solve(new double[]{A11, A12, A21, A22}, n1, n2, -1, 1, 0.001);

        A11 = 1235; A12 = 4.3204e9; A21 = 1035; A22 = 4.8024e9;
        n1 = 0.5; n2 = 0.6;
        solver.solve(new double[]{A11, A12, A21, A22}, n1, n2, -1, 1, 0.001);

        A11 = 1232435; A12 = 4.3204e9; A21 = 1202435; A22 = 4.8024e9;
        n1 = 0.5; n2 = 0.7;
        solver.solve(new double[]{A11, A12, A21, A22}, n1, n2, -1, 1, 0.001);

        A11 = 1235; A12 = 4.3204e9; A21 = 1035; A22 = 4.8024e9;
        n1 = 0.5; n2 = 0.7;
        solver.solve(new double[]{A11, A12, A21, A22}, n1, n2, -1, 1, 0.00001);
    }
}
