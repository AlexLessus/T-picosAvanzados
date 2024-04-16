package MetNum;

import java.util.Scanner;

public class ReglaFalsa {

    public static double funcion(double x) {
        return (0.9 - 1.4 * Math.sin(x)) / x;
    }

    public static double reglaFalsa(double x1, double x2, double es) {
        double xr = 0, ea = Double.MAX_VALUE;
        int iter = 1;

        System.out.printf("%-5s%-15s%-15s%-15s%-15s%n", "Iter", "Xl", "Xu", "Xr", "Error");

        while (ea > es) {
            double f1 = funcion(x1);
            double f2 = funcion(x2);

            xr = x2 - (f2 * (x1 - x2)) / (f1 - f2);
            double fr = funcion(xr);

            ea = Math.abs((xr - x2) / xr) * 100;

            System.out.printf("%-5d%-15.6f%-15.6f%-15.6f%-15.6f%n", iter, x1, x2, xr, ea);

            if (fr == 0) {
                break;
            } else if (f1 * fr < 0) {
                x2 = xr;
            } else {
                x1 = xr;
            }

            iter++;
        }

        return xr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x1 = 0.5;
        double x2 = 2;
        double es = 0.1;

        System.out.println("Método de la Regla Falsa");
        System.out.println("Función: f(x) = (0.9 - 1.4 * sen(x)) / x");
        System.out.println("Valores iniciales: x1 = " + x1 + ", x2 = " + x2);
        System.out.println("Error meta: " + es + "%");

        double raiz = reglaFalsa(x1, x2, es);
        System.out.println("\nLa raíz aproximada es: " + raiz);
    }
}
