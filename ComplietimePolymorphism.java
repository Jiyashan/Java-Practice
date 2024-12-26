class Claculation{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
}
public class ComplietimePolymorphism {
    public static void main(String[] args) {
        Claculation cal = new Claculation();
//        System.out.println(cal.add(4,7));
        System.out.println(cal.add(4.5,7.8));

    }
}
