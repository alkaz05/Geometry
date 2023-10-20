import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
       // ArrayList<Triangle> triangles = inputTriangleList(2);
       // System.out.println(triangles);
       // System.out.println(avgPerimeter(triangles));
        ArrayList<Triangle> tr2 = readTriangleList("triangles.txt");
        System.out.println(tr2);
        System.out.println(avgPerimeter(tr2));
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

    private static ArrayList<Triangle> readTriangleList(String fileName) throws FileNotFoundException {

        ArrayList<Triangle> triangles = new ArrayList<>();
        Scanner fscan = new Scanner(new File(fileName));
        while (fscan.hasNextLine()){        //цикл по всем строчкам файла
            double x1 = fscan.nextDouble();
            double y1 = fscan.nextDouble();
            double x2 = fscan.nextDouble();
            double y2 = fscan.nextDouble();
            double x3 = fscan.nextDouble();
            double y3 = fscan.nextDouble();

            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Point p3 = new Point(x3, y3);
            Triangle t = new Triangle(p1, p2, p3);
            triangles.add(t);
        }
        return triangles;
    }
}