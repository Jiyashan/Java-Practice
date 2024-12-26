public class stringBuilderEx {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Hello ");
//    append method
//        sb.append("Java");
//        System.out.println(sb);
//    insert method
//        sb.insert(6,"Java");
//        System.out.println(sb);
//        replace method
//        sb.replace(1,3,"Java");
//        System.out.println(sb);
//        delete
//        sb.delete(1,3);
//        System.out.println(sb);
//        reverse
//        sb.reverse();
//        System.out.println(sb);
//        capacity
        StringBuilder sb1 = new StringBuilder();
//        System.out.println(sb1.capacity());
//        sb1.append("Hello");
//        System.out.println(sb1.capacity());
//        sb1.append("Java is a fav Lang");
//        System.out.println(sb1.length());
//        System.out.println(sb1.capacity());
//        ensureCapacity

        System.out.println(sb1.capacity());
        sb1.append("Hello");
        System.out.println(sb1.capacity());
        sb1.append("Java is a fav Lang");
        sb1.ensureCapacity(10);
        System.out.println(sb1.capacity());
        sb1.ensureCapacity(50);
        System.out.println(sb1.capacity());


    }


}

