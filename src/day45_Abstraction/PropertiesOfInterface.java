package day45_Abstraction;

public interface PropertiesOfInterface {

    int a=100;  //static and final by default
    static int b=200;  // final by default

  /*  public PropertiesOfInterface(int a){ // cannot have constructor
        this.a=a;
    }

   */
    /*static {
        b=100;
    }

     */

   /* public void method1(){   // cannot have instance methods
        System.out.println("Instance method");
    }

    */

    //This static method was Introduced after java 8
    public static void method2(){ // static modifier introduced after java 8
        System.out.println("Static method");
    }
    //We can call this static method by the interface name

    public abstract void method3();

    //The other method type that introduced after java 8 is default method
    //The reason is we may need a method that has the same implementations
    // for all the classes that implements the same interface. It acts as instance method.

    public default void method4(){ // if the implementation is common for all the subclasses
        System.out.println("Default method");
    }
}

    class Test implements PropertiesOfInterface{

        @Override
        public void method3() {

        }

        public static void main(String[] args) {
            new Test().method4();
        }

    }





