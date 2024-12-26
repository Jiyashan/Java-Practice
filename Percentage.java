import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        float total = sub1+sub2+sub3+sub4+sub5;
        System.out.println(total);
        float percent = (total/500)*100;
        System.out.println("Percentage of student:"+percent+"%");


    }
}
