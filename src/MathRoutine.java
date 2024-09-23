
import java.util.Scanner;
import java.lang.Math;
public class MathRoutine {

    public static void calcTria(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите 3 точки для треугольника");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        Point a = new Point(x1,y1);
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        Point b = new Point(x2,y2);
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        Point c = new Point(x3,y3);
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ca = c.distanceTo(a);

        if (ab+bc>ca || bc+ca >ab || ab+ ca> bc) {
            Triangle fig1 = new Triangle(a, b, c);
            System.out.println("Создан треугольник: " + fig1);
            System.out.println();
            if (fig1.ifTrianIsosceles()==true) {
                System.out.println("треугольник равнобедренный");}
            if (fig1.ifTrianIsosceles()==true) {
                System.out.println("треугольник прямоугольник");}

            System.out.println("Периметр треугольника: " + (fig1.calcPer()));

        }
        else
            System.out.println("данные точки не образуют треугольника");

    }

}
