public class Point {

    double x;
    double y;

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double distanceToZero(){

        return Math.sqrt(x*x+y*y);
    }

    public double distanceTo(Point anothher){
        double dKvadrat = (x-anothher.x)*(x-anothher.x) + (y-anothher.y)*(y-anothher.y);
        return Math.sqrt(dKvadrat);
    }
}
