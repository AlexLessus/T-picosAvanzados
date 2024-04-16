package MetNum;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de x:");
        double x = scanner.nextDouble();

        System.out.print("Ingrese la precisión deseada (por ejemplo, 0.0001):");
        double precision = scanner.nextDouble();

        System.out.println("\nExp(x): " + calcularExponencial(x, precision));
        System.out.println("Sen(x): " + calcularSeno(x, precision));
        System.out.println("Cos(x): " + calcularCoseno(x, precision));
        System.out.println("Raíz2(x): " + calcularRaizCuadrada(x, precision));
        System.out.println("Ln(x): " + calcularLogaritmoNatural(x, precision));
    }

    private static double calcularExponencial(double x, double precision) {
        double resultado = 1;
        double termino = 1;
        int n = 1;

        while (Math.abs(termino) > precision) {
            termino *= x / n;
            resultado += termino;
            n++;
        }

        return resultado;
    }

    private static double calcularSeno(double x, double precision) {
        double resultado = x;
        double termino = x;
        int n = 1;

        while (Math.abs(termino) > precision) {
            termino *= -x * x / ((2 * n) * (2 * n + 1));
            resultado += termino;
            n++;
        }

        return resultado;
    }

    private static double calcularCoseno(double x, double precision) {
        double resultado = 1;
        double termino = 1;
        int n = 1;

        while (Math.abs(termino) > precision) {
            termino *= -x * x / ((2 * n - 1) * (2 * n));
            resultado += termino;
            n++;
        }

        return resultado;
    }

    private static double calcularRaizCuadrada(double x, double precision) {
        if (x < 0) {
            return Double.NaN; // No se puede calcular la raíz cuadrada de un número negativo
        }

        double resultado = x / 2; // Aproximación inicial
        double termino = 1;
        int n = 1;

        while (Math.abs(termino) > precision) {
            termino = (x - resultado * resultado) / (2 * resultado);
            resultado += termino;
            n++;
        }

        return resultado;
    }

    private static double calcularLogaritmoNatural(double x, double precision) {
        if (x <= 0) {
            return Double.NaN;
        }
        double resultado = 0.0;
        double termino = (x - 1.0) / x;
        int n = 1;
        while (Math.abs(termino) > precision) {
            resultado += termino;
            termino = Math.pow((x - 1.0) / x, n) / n;
            n++;
        }
        return resultado;
    }
}
