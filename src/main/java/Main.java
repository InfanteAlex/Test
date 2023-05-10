
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rectangle rec0 = new Rectangle();

        System.out.println("Please input lenth and width for the rectangles");

        double length1 = scan.nextDouble();
        double width1 = scan.nextDouble();
        double len0 = scan.nextDouble();
        double wid0 = scan.nextDouble();

        Rectangle rec = new Rectangle(length1, width1);
        rec0.setLength(len0);
        rec0.setWidth(wid0);

        Circle circle0 = new Circle();
        System.out.println("Please input the radii for the circles");
       
        double rad0 = scan.nextDouble();
        double rad1 = scan.nextDouble();

        Circle circle1 = new Circle(rad1);
        circle0.setRadius(rad0);

        System.out.println("Rectangle with sides " + rec.getLength() + " and " + rec.getWidth()
                + " has area " + rec.computeArea());
        System.out.println("Rectangle with sides " + rec0.getLength() + " and " + rec0.getWidth()
                + " has area " + rec0.computeArea());
        System.out.println("Circle with radius " + circle0.getRadius() + " has area " + circle0.computeArea());
        System.out.println("Circle with radius " + circle1.getRadius() + " has area " + circle1.computeArea());

    }
}
