package com.chmnu_ki_123.k3;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;

public class MathCalcInput {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {
            double x, a, b, c;

            System.out.print("Enter the value of x: ");
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for x (use a dot as the decimal separator)!");
                return;
            }

            System.out.print("Enter the value of a: ");
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for a (use a dot as the decimal separator)!");
                return;
            }

            System.out.print("Enter the value of b: ");
            if (scanner.hasNextDouble()) {
                b = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for b (use a dot as the decimal separator)!");
                return;
            }

            System.out.print("Enter the value of c: ");
            if (scanner.hasNextDouble()) {
                c = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for c (use a dot as the decimal separator)!");
                return;
            }

            double expAx = exp(a * x);
            double tanBxC = tan(b * x + c);
            double log2AxC = log((a * x) - c) / log(2);
            double expBx2_1 = exp(b * pow(x, 2) - 1);

            double result = expAx * tanBxC + log2AxC / expBx2_1;

            System.out.printf("Result: %.3f\n", result);
        }
    }
}
