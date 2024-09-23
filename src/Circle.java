public class Circle {

        Point center;
        double r;

        public Circle(Point center, double r) {
            this.center = center;
            this.r = r;
        }

        public Circle(double x, double y, double r){
            this.center= new Point(x,y);
            this.r = r;
        }

        @Override
        public String toString() {
            return "Circle{" +
                    "c=" + center +
                    ", r=" + r +
                    '}';
        }

        public double area(){
            return r*r*Math.PI;
        }

        public boolean intersectsWith(Circle other){
            double dist = center.distanceTo(other.center);
            if(dist > this.r+ other.r || dist+this.r < other.r || dist+other.r < this.r)
                return false;
            else
                return true;
        }
}
