import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Triangle> triangles = inputTriangleList(2);
        System.out.println(triangles);
        System.out.println(avgPerimeter(triangles));
    }

    private static ArrayList<Triangle> inputTriangleList(int size) {
        System.out.println("Введите "+size+" треугольников:");

        ArrayList<Triangle> triangles = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Triangle t = inputTriangle();
            triangles.add(t);
        }
        return triangles;
    }

    public static Triangle inputTriangle() {
        System.out.println("начинайте вводить треугольник");
        Point p1 = inputPoint(1);
        Point p2 = inputPoint(2);
        Point p3 = inputPoint(3);
        return new Triangle(p1, p2, p3);
    }

    public static  Point inputPoint(int i){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите координаты "+i+" точки");
        double x1= scanner.nextDouble();
        double y1= scanner.nextDouble();
        Point p1 = new Point(x1, y1);
        return p1;
    }

    public static double avgPerimeter(ArrayList<Triangle> triangles)
    {
        double p = 0;
        for (Triangle r:triangles ) {
            p += r.perimeter();
        }
        p /= triangles.size();
        return p;
    }
}