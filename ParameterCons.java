public class ParameterCons {
    int id ;
    String name;
    int age ;
    ParameterCons(int i,String n){
        id = i;
        name=n;
//        System.out.println(id+" "+name);
    }
//    ParameterCons(int i,String n,int a){
//        id = i;
//        name = n;
//        age = a;
//    }
    ParameterCons(ParameterCons pc){     // Copy of the object using contructor
        id = pc.id;
        name = pc.name;

    }
//    void dispaly(){
//        System.out.println(id+" "+name+" "+age);
//    }
    void dispaly(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        ParameterCons pc1 = new ParameterCons(111,"Rahul");
        ParameterCons pc3 = new ParameterCons(145,"Rahil");
//        ParameterCons pc2 = new ParameterCons(112,"Riya",23);
        pc1.dispaly();
//        pc2.dispaly();
        pc3.dispaly();

    }
}
