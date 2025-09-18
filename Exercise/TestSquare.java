public class TestSquare {
    public static void main(String[] args) {
        Square sq1 = new Square();
        Square sq2 = new Square(4.0);
        Square sq3 = new Square(5.0, "orange", true);

        System.out.println(sq1);
        System.out.println("Area: " + sq1.getArea() + ", Perimeter: " + sq1.getPerimeter());

        System.out.println(sq2);
        System.out.println("Area: " + sq2.getArea() + ", Perimeter: " + sq2.getPerimeter());

        System.out.println(sq3);
        System.out.println("Area: " + sq3.getArea() + ", Perimeter: " + sq3.getPerimeter());
    }
}
