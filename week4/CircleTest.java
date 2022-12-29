public class CircleTest {
    public static void main(String[] args) {
        Circle a = new Circle(72,"green");
        System.out.println(a.toString());
        System.out.printf("The circle has Area of %.2f \n",a.getArea());

        Circle b = new Circle(2.0,"blue");
        System.out.println(b.toString());
        System.out.printf("The circle has Area of %.2f",b.getArea());
    }
}
