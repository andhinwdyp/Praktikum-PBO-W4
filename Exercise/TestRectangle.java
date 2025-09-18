public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2.0, 5.0);
        Rectangle r3 = new Rectangle(3.0, 6.0, "red", true);

        System.out.println(r1);
        System.out.println("Area: " + r1.getArea() + ", Perimeter: " + r1.getPerimeter());

        System.out.println(r2);
        System.out.println("Area: " + r2.getArea() + ", Perimeter: " + r2.getPerimeter());

        System.out.println(r3);
        System.out.println("Area: " + r3.getArea() + ", Perimeter: " + r3.getPerimeter());
    }
}
