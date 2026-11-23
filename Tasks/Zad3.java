package Tasks;

public class Zad3 {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        System.out.println("Значения функции f(x) на отрезке [-3; 3] с шагом 0.5:");
        System.out.println("---------------------------------------------------");

        double start = -3.0;
        double end = 3.0;
        double step = 0.5;
        int stepsCount = (int) Math.round((end - start) / step);

        for (int i = 0; i <= stepsCount; i++) {
            double x = start + i * step;
            double f = evaluateFunction(x);
            System.out.printf("x = %5.1f | f(x) = %8.4f%n", x, f);
        }
    }

    private static double evaluateFunction(double x) {
        if (x >= 0) {
            return x * x + 2 * x;
        } else {
            return -Math.cos(x);
        }
    }
}