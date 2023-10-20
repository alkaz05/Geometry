public class Triangle {
    Point vertex1, vertex2, vertex3;

    public Triangle(Point vertex1, Point vertex2, Point vertex3) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.vertex3 = vertex3;
    }

    //метод вычисления периметра будет возвращать число double
    public double perimeter() {
        double side1 = vertex1.distanceTo(vertex2);
        double side2 = vertex2.distanceTo(vertex3);
        double side3 = vertex3.distanceTo(vertex1);
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "" + vertex1 +
                ", " + vertex2 +
                ", " + vertex3 +
                '}';
    }
}
