package day25_CustomMethod_Overloading;

public class MainMethodOverloading {

    //Any method in java can be overloaded but since main method is building method,
    // compiler recognizes(JVM executes) the first one as actual main method
    // There is no benefit of overloading main method
    public static void main(String[] args) {
        System.out.println("String");
    }

    public static void main(int[] args) {
        System.out.println("int");
    }

    public static void main(double[] args) {
        System.out.println("double");
    }

    public static void main(char[] args) {
        System.out.println("char");
    }
}
