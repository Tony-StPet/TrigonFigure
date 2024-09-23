package figure;

// наследование от фигуры, беру периметр и площадь как abstract
public class Triangle extends Figure{
    Point a;     Point b;     Point c;

// конструктор
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // функция для поиска периметра треугольника по его точкам
    public double perimeter(){
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ca = c.distanceTo(a);
        return ab + bc +ca;
    }

    // функция для поиска площади треугольника по его точкам
    public double area(){
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ca = c.distanceTo(a);
        double p = (ab+bc+ca)/2;
        return Math.sqrt((p*(p-ab)*(p-bc)*(p-ca)));
    }


    // функция вывода toString
    @Override
    public String toString() {
        return "Figure.Triangle{" +
                "a=" + a +  ", b=" + b + ", c=" + c + '}';
    }

    // функция для проверки треугольника на то что он равнобедренный
    // т.е. две его стороны раны, и добавляю погрешность tolerance
    public boolean ifTrianIsosceles()
    {
        double tolerance = 0.01;
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ca = c.distanceTo(a);
        if (Math.abs(ab-bc)<= tolerance)
            return true;

        if (Math.abs(bc-ca)<= tolerance)
            return true;
        if (Math.abs(ab-ca)<= tolerance)
            return true;
            else return false;
    }

    // функция для проверки треугольника на то что он прямоугольный
    // использую теорему пифагора и добавляю погрешность tolerance
    public boolean ifTrianRectangular(){
        double tolerance = 0.01;
        double ab = a.distanceTo(b);
        double bc = b.distanceTo(c);
        double ca = c.distanceTo(a);
        if (ab*ab+bc*bc-ca*ca <= tolerance) return true;
        if (ab*ab+ca*ca-bc*bc <= tolerance) return true;
        if (bc*bc+ca*ca-ab*ab<= tolerance) return true;
            else return false;
    }



}

