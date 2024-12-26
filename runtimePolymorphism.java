//class Bike{
//    void run(){
//        System.out.println("This is a Bike class");
//    }
//}
//class Splender extends Bike{
//    void run(){
//        System.out.println("This is Splender class");
//    }
//}


//class Bank{
//    float getRateofInterest(){
//        return 0;
//    }
//}
//class SBI extends Bank{
//    float getRateofInterest(){
//        return 8.4f;
//    }
//
//class Axis extends Bank{
//    float getRateofInterest(){
//        return 6.4f;
//    }
//}
//class ICICI extends Bank{
//    float getRateofInterest(){
//        return 7.4f;
//    }
//}

//class Animal{
//    void eat(){
//        System.out.println("Eating...");
//    }
//}
//class Dog extends Animal{
//    void eat(){
//        System.out.println("Bone...");
//    }
//}
//class Cat extends Animal{
//    void eat(){
//        System.out.println("rat...");
//    }
//}
//class Lion extends Animal{
//    void eat(){
//        System.out.println("Meat");
//    }
//}

//Multilevel inheritance polymorphism
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void eat(){
        System.out.println("Bone...");
    }
}
class BabyDog extends Dog{
    void eat(){
        System.out.println("Drinking milk");
    }
}

public class runtimePolymorphism {
    public static void main(String[] args) {
//        Bike b = new Splender();  //Upcasting
//        b.run();

//        Bank b;
//        b = new SBI();
//        System.out.println("SBI interest rate:"+ b.getRateofInterest());
//        b = new Axis();
//        System.out.println("Axis interest rate:"+ b.getRateofInterest());
//        b = new ICICI();
//        System.out.println("ICICI interest rate:"+ b.getRateofInterest());

//        Animal a;
//        a = new Dog();
//        a.eat();
//        a = new Cat();
//        a.eat();
//        a = new Lion();
//        a.eat();

        Animal a1,a2,a3;
        a1=new Animal();
        a2=new Dog();
        a3=new BabyDog();
        a1.eat();
        a2.eat();
        a3.eat();

    }
}

//class Bank{
//    float getRateOfInterest(){return 0;}
//}
//class SBI extends Bank{
//    float getRateOfInterest(){return 8.4f;}
//}
//class ICICI extends Bank{
//    float getRateOfInterest(){return 7.3f;}
//}
//class AXIS extends Bank{
//    float getRateOfInterest(){return 9.7f;}
//}
//class runtimePolymorphism{
//    public static void main(String args[]){
//        Bank b;
//        b=new SBI();
//        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
//        b=new ICICI();
//        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
//        b=new AXIS();
//        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
//    }
//}
