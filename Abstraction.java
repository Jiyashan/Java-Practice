//abstract class Bike{
//    abstract void run();
//}
//class Honda extends Bike{
//    void run(){
//        System.out.println("This is a Bike");
//    }
//}
abstract class Shape{
    abstract void draw();
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("Drawing Rectangle");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}


public class Abstraction {
    public static void main(String[] args) {
//        Bike obj = new Honda();
//        obj.run();

        Shape s = new Circle();
        Shape s1 = new Rectangle();
        s1.draw();
        s.draw();

    }
}
