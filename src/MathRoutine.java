
import figure.Point;
import figure.Triangle;

import java.util.Scanner;

public class MathRoutine {

    public static void calcTria() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 точки для треугольника");

        // Ввод координат точек
        Point a = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point b = new Point(scanner.nextDouble(), scanner.nextDouble());
        Point c = new Point(scanner.nextDouble(), scanner.nextDouble());

        // Вычисление длин сторон
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ca = c.distanceTo(a);

        // Проверка на существование треугольника
        if (ab + bc > ca && bc + ca > ab && ab + ca > bc) {
            Triangle fig1 = new Triangle(a, b, c);
            System.out.println("Создан треугольник: " + fig1);

            // Проверка на равнобедренность и прямоугольность
            if (fig1.ifTrianIsosceles()) {
                System.out.println("Треугольник равнобедренный");
            }
            if (fig1.ifTrianRectangular()) {
                System.out.println("Треугольник прямоугольный");
            }

            // Вывод периметра
            System.out.println("Периметр треугольника: " + fig1.perimeter());
            System.out.println("Площадь треугольника: " + fig1.area());
        } else {
            System.out.println("Данные точки не образуют треугольника");
        }
    }
}
