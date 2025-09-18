public class TestCircle2 {
    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        Circle2 c2 = new Circle2(2.5);
        Circle2 c3 = new Circle2(3.0, "yellow", false);

        System.out.println(c1);
        System.out.println("Area: " + c1.getArea() + ", Perimeter: " + c1.getPerimeter());

        System.out.println(c2);
        System.out.println("Area: " + c2.getArea() + ", Perimeter: " + c2.getPerimeter());

        System.out.println(c3);
        System.out.println("Area: " + c3.getArea() + ", Perimeter: " + c3.getPerimeter());
    }
}
