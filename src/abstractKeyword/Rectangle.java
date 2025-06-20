package abstractKeyword;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color,double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.printf("Rectangle color: %s\tLength: %.4f\tWidth:%.4f", super.getColor(), this.length, this.width);
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
}
