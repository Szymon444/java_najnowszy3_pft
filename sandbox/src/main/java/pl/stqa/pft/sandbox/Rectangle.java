package pl.stqa.pft.sandbox;

public class Rectangle { //prostokąt opisuję się dwoma atrybutami

    public double a;
    public double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return this.a * this.b;
    }
}
