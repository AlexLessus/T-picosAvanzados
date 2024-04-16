package MetNum;

import java.util.Scanner;

public class biseccion {

    public static double evaluarPolinomio(double[] coeficientes, double x) {
        double resultado = 0;
        int grado = coeficientes.length - 1;
        for (int i = 0; i <= grado; i++) {
            resultado += coeficientes[i] * Math.pow(x, grado - i);
        }
        return resultado;
    }

    public static double biseccion(double[] coeficientes, double a, double b, double tolerancia, int maxIter) {
        if (evaluarPolinomio(coeficientes, a) * evaluarPolinomio(coeficientes, b) > 0) {
            System.out.println("Error: No hay cambio de signo en el intervalo proporcionado.");
            return Double.NaN;
        }

        int iteracion = 1;
        double c = a;
        while ((b - a) / 2 > tolerancia && iteracion <= maxIter) {
            c = (a + b) / 2;
            double fc = evaluarPolinomio(coeficientes, c);

            System.out.printf("%-12d%-12.6f%-12.6f%-12.6f%-12.6f%n", iteracion, a, b, c, fc);

            if (fc == 0 || (b - a) / 2 < tolerancia) {
                break;
            }

            if (evaluarPolinomio(coeficientes, c) * evaluarPolinomio(coeficientes, a) < 0) {
                b = c;
            } else {
                a = c;
            }

            iteracion++;
        }

        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el grado del polinomio (hasta 5): ");
        int grado = scanner.nextInt();

        double[] coeficientes = new double[grado + 1];
        System.out.println("Ingrese los coeficientes del polinomio de mayor a menor grado:");
        for (int i = grado; i >= 0; i--) {
            System.out.print("Coeficiente para x^" + i + ": ");
            coeficientes[i] = scanner.nextDouble();
        }

        System.out.print("Ingrese el extremo izquierdo del intervalo inicial: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el extremo derecho del intervalo inicial: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese la tolerancia (porcentaje de error): ");
        double tolerancia = scanner.nextDouble() / 100.0;
        System.out.print("Ingrese el número máximo de iteraciones: ");
        int maxIter = scanner.nextInt();

        if (evaluarPolinomio(coeficientes, a) * evaluarPolinomio(coeficientes, b) > 0) {
            System.out.println("Error: No hay cambio de signo en el intervalo proporcionado.");
        } else {
            System.out.println("\nTabla de iteraciones:");
            System.out.printf("%-12s%-12s%-12s%-12s%-12s%n", "Iteración", "a", "b", "c", "f(c)");
            System.out.println("----------------------------------------");

            double solucion = biseccion(coeficientes, a, b, tolerancia, maxIter);

            if (!Double.isNaN(solucion)) {
                System.out.println("\nSolución encontrada:");
                System.out.println("La raíz aproximada es: " + solucion);
            } else {
                System.out.println("No se pudo encontrar una solución.");
            }
        }
    }
}
