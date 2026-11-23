package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        run(scanner);
        scanner.close();
    }

    public static void run(Scanner scanner) {
        System.out.print("Введите координату X: ");
        double x = Main.readDouble(scanner);
        System.out.print("Введите координату Y: ");
        double y = Main.readDouble(scanner);

        double[][] fig1 = buildFigure1();
        double[][] fig2 = buildFigure2();

        boolean inFig1 = isPointInPolygon(fig1[0], fig1[1], x, y);
        boolean inFig2 = isPointInPolygon(fig2[0], fig2[1], x, y);

        if (inFig1) {
            System.out.println("Точка (" + x + "; " + y + ") попала в Фигуру № 1 (левую).");
        } else if (inFig2) {
            System.out.println("Точка (" + x + "; " + y + ") попала в Фигуру № 2 (правую).");
        } else {
            System.out.println("Точка (" + x + "; " + y + ") не попала ни в одну из фигур.");
        }
    }

    // Левая фигура с учётом левой полуокружности: центр (-1, 1), R = 2, углы от 90° до 270°
    private static double[][] buildFigure1() {
        List<Double> xs = new ArrayList<>();
        List<Double> ys = new ArrayList<>();

        double[][] polyStart = {
            {-1, 5}, {0, 5}, {2, 5}, {0, 2}, {2, 0}, {-2, 1}, {0, -1}, {1, -4}, {-1, -1}
        };
        for (double[] p : polyStart) {
            xs.add(p[0]);
            ys.add(p[1]);
        }

        // От (-1, -1) (угол 270°) через (-3, 1) (180°) до (-1, 3) (90°)
        for (int deg = 270; deg >= 90; deg -= 5) {
            double rad = Math.toRadians(deg);
            xs.add(-1.0 + 2.0 * Math.cos(rad));
            ys.add(1.0 + 2.0 * Math.sin(rad));
        }

        return toArrays(xs, ys);
    }

    // Правая фигура с учётом двух дуг вокруг центра (4, -1), R = 2
    private static double[][] buildFigure2() {
        List<Double> xs = new ArrayList<>();
        List<Double> ys = new ArrayList<>();

        xs.add(2.0); ys.add(1.0);
        xs.add(3.0); ys.add(4.0);
        xs.add(4.0); ys.add(1.0);

        // Верхняя правая дуга от (4, 1) (угол 90°) до (6, -1) (угол 0°) вокруг (4, -1)
        for (int deg = 90; deg >= 0; deg -= 5) {
            double rad = Math.toRadians(deg);
            xs.add(4.0 + 2.0 * Math.cos(rad));
            ys.add(-1.0 + 2.0 * Math.sin(rad));
        }

        double[][] rightAndBottom = {
            {7, -3}, {6, -4}, {5, -5}, {3, -4}, {4, -3}
        };
        for (double[] p : rightAndBottom) {
            xs.add(p[0]);
            ys.add(p[1]);
        }

        // Нижняя левая дуга от (4, -3) (угол 270°) до (2, -1) (угол 180°) вокруг (4, -1)
        for (int deg = 270; deg >= 180; deg -= 5) {
            double rad = Math.toRadians(deg);
            xs.add(4.0 + 2.0 * Math.cos(rad));
            ys.add(-1.0 + 2.0 * Math.sin(rad));
        }

        double[][] innerZigzag = {
            {2, 1}, {4, 0}, {3, -2}, {2, -1}
        };
        for (double[] p : innerZigzag) {
            xs.add(p[0]);
            ys.add(p[1]);
        }

        return toArrays(xs, ys);
    }

    private static double[][] toArrays(List<Double> xs, List<Double> ys) {
        double[] xArr = new double[xs.size()];
        double[] yArr = new double[ys.size()];
        for (int i = 0; i < xs.size(); i++) {
            xArr[i] = xs.get(i);
            yArr[i] = ys.get(i);
        }
        return new double[][]{xArr, yArr};
    }
           //проверка на попадание
    private static boolean isPointOnSegment(double x1, double y1, double x2, double y2,
                                            double x, double y, double eps) {
        // Проверка попадания проекции точки на отрезок
        double cross = (x2 - x1) * (y - y1) - (y2 - y1) * (x - x1);
        if (Math.abs(cross) > eps) {
            return false; // не лежит на прямой, проходящей через отрезок
        }
        double dot = (x - x1) * (x2 - x1) + (y - y1) * (y2 - y1);
        double lenSq = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        if (lenSq == 0) { // вырожденный отрезок — точка
            return Math.abs(x - x1) <= eps && Math.abs(y - y1) <= eps;
        }
        double t = dot / lenSq;
        return t >= -eps && t <= 1 + eps; // проекция внутри отрезка
    }

     public static boolean isPointInPolygon(double[] xPoints, double[] yPoints, double x, double y) {
        int n = xPoints.length;
        double eps = 1e-9;

        // Сначала проверяем, лежит ли точка на границе
        for (int i = 0, j = n - 1; i < n; j = i++) {
            if (isPointOnSegment(xPoints[j], yPoints[j], xPoints[i], yPoints[i], x, y, eps)) {
                return true;
            }
        }

        // Стандартная проверка «внутри/снаружи» (луч параллелен оси X)
        boolean inside = false;
        for (int i = 0, j = n - 1; i < n; j = i++) {
            boolean intersect = ((yPoints[i] > y) != (yPoints[j] > y)) &&
                    (x < (xPoints[j] - xPoints[i]) * (y - yPoints[i]) / (yPoints[j] - yPoints[i]) + xPoints[i]);
            if (intersect) {
                inside = !inside;
            }
        }
        return inside;
    }
}