import java.util.Scanner;
public class ConditionalLoop_LogicalOperators {
    public static void main(String[] args) {
//        int age = 23;
//        if (age>18){
//            System.out.println("I can Drive");
//        }
//        else{
//            System.out.println("I can't Drive");
//        }

        boolean a = true;
        boolean b = false;
        boolean c = true;
//        if (a || b && c){
//            System.out.println("Y");
//        }
//        else{
//            System.out.println("N");
//        }

        System.out.print("Not(a):");
        System.out.println(!a);
        System.out.print("Not(b):");
        System.out.println(!b);

//        if-else ladder
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
//        if (age>50){
//            System.out.println("You are experienced person");
//        }
//        else if(age>34){
//            System.out.println("You are semi-experienced");
//        }
//        else{
//            System.out.println("Enjoy your life");
//        }

//        Switch Case
        switch (age){
            case(18):
                System.out.println("yor are 18");
                break;

            case 16:
                System.out.println("you are 16");
                break;

            case 78:
                System.out.println("You are experienced");
                break;
            default:
                System.out.println("Enjoy your life");
        }




    }
}
