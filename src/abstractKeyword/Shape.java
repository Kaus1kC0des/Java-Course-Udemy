package abstractKeyword;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void showColor(){
        System.out.printf("Color of shape is: %s\n", color);
    }

    public abstract void draw();
    public abstract double getArea();
}
