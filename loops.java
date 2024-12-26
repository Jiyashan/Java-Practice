public class loops {
    public static void main(String[] args) {
//        int i = 100;
//        while (i<=200){
//            System.out.println(i);
//            i++;
//        }
//        int i = 45;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=65);
//        int n = 0;
//        do{
//            System.out.println(2*n);
//            n++;
//        }while(n<=10);


//        for loop
//        for (int i = 0;i<=5;i++){
//            System.out.println(2*i+1);
//        }
//        for (int i = 0;i<=5;i++){
//            System.out.println(2*i);
//        }
//        int n=10;
//        for (int i = 0;i<=n;i++){
//            System.out.println(2*i);
//        }
//        for (int i=n; i >0;i-- ){
//            System.out.println(i);
//        }

//        for(int i=0;i<=10;i++){
//            System.out.println(i);
//            if(i == 2){
////                System.out.println(i)  ;
//                break;
//            }
//        }
//        int n = 1;
//        while(n<10){
//            System.out.println(n);
//            n++;
//            if(n==4){
//                break;
//            }
//        }

//        int n = 1;
//        do {
//            System.out.println(n);
//            n++;
//            if(n==4){
//                break;
//            }
//        }while(n<10);
        int n = 1;
        do {

            n++;
            if(n==4){
                continue;
            }
            System.out.println(n);
        }while(n<10);




    }
}
