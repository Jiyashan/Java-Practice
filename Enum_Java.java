public class Enum_Java {
    public enum Season {Summer,Winter,Rainy}
    public static void main(String[] args) {
        for (Season s: Season.values()){
            System.out.println(s);
        }

    }
}
