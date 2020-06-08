package pl.stqa.pft.sandbox;

public class Square {

    public double l;

    public Square (double l){
        this.l = l;// poprzez this powolywac się można na atrybut obiektu
    }

    public  double area() {
        return this.l * this.l;
    }

}
