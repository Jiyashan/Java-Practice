import java.util.Scanner;
public class PracticeSet4 {
    public static void main(String[] args) {
//        Q1
//        int a = 10;
//        if(a==11){
//            System.out.println("I am not 11 ");
//        }
//        else{
//            System.out.println("I am 11");
//        }
//        Q2
        Scanner sc = new Scanner(System.in );
//        System.out.println("Enter marks of Physics:");
//        byte m1 = sc.nextByte();
//        System.out.println("Enter marks of Chemistry:");
//        byte m2 = sc.nextByte();
//        System.out.println("Enter marks of Maths:");
//        byte m3 = sc.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your overall percentage:"+avg);
//        if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations! you are promoted");
//        }
//        else{
//            System.out.println("Sorry you are not promoted");
//        }
//        Q3
//        System.out.println("Enter your Income:");
//        float income = sc.nextFloat();
//        float tax = 0;
//        if (income < 2.5f){
//            tax = tax = 0;
//        }
//        else if(income>2.5f && income <=5f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income<=10f){
//            tax = tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.2f *(income - 5.0f);
//        }
//        else if(tax>10.0f){
//            tax = tax + 0.05f * (5.0f-2.5f);
//            tax = tax + 0.2f * (10.0f - 5f);
//            tax = tax + 0.3f *(income = 10f);
//        }
//        System.out.println("Taxes youy have to pay:"+ tax);
//        Q4
//        int day = sc.nextInt();
//        switch (day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

//        Q5
        int yr = sc.nextInt();
        if ((yr%4==0 && yr%100!=0)|| yr%400==0){
            System.out.println("this is leap year");
        }
        else{
            System.out.println("This is not leap year");
        }

//        Q6
//        String website = sc.next();
//        if (website.endsWith(".org")){
//            System.out.println("It is a organization website");
//        }
//        else if (website.endsWith(".com")){
//            System.out.println("It is a commercial website");
//        }
//        else if(website.endsWith(".in")){
//            System.out.println("It is an Indian Website");
//        }






    }
}
