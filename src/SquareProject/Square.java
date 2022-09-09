package SquareProject;

public class Square {
    private int side;

    public Square(int side) {
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        if (side >= 0) {
            this.side = side;
        }
    }

    public int calculateArea() {
        side *= side;
        return side;
    }

    public int calculatePerimeter() {
        side *= 4  ;
        return side;
    }


    public String toString() {
        return "Square{" +
                "side=" + side  +
                '}';
    }
}
