package pl.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {

        hello("world");
        hello("user");
        hello("Szymon");

        Square s = new Square(5); // dzieki konstruktorowi nie tworzyć atrybutów tylko można je przenieść
        System.out.println("Powieszchnia kwadratu o boku: " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Powieszchnia prostokąta o bokach: " + r.a + " i " + r.b + " = " + r.area());


    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

}
