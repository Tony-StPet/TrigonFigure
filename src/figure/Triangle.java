package figure;

public class Triangle extends {
    Point a;     Point b;     Point c;



    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcPer(){

    double ab = a.distanceTo(b);
    double bc = b.distanceTo(c);
    double ca = c.distanceTo(a);
            return ab + bc +ca;
        }
        public double calcArea(){
            double ab = a.distanceTo(b);
            double bc = b.distanceTo(c);
            double ca = c.distanceTo(a);
            double p = (ab+bc+ca)/2;
            return Math.sqrt((p*(p-ab)*(p-bc)*(p-ca)));
        }
    @Override
    public String toString() {
        return "Figure.Triangle{" +
                "a=" + a +  ", b=" + b + ", c=" + c + '}';
    }

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

