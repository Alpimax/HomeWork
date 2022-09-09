package SquareProject;

public class TestSquare {
    public static void main(String[] args) {
        Square obj = new Square(10);
        System.out.println(obj);
        System.out.println(obj.calculateArea());
        System.out.println(obj.calculatePerimeter());
    }
}
