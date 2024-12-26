public class DefaultCons {
    DefaultCons(){
//        System.out.println("I am a Default Constructor");
        int a = 6;
        int b = 89;
        int c = a+b;
        System.out.print("Addition of two numbers:"+c);

    }

    public static void main(String[] args) {
        DefaultCons dc = new DefaultCons();
    }
}
