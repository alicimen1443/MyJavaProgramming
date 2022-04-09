package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    // gets executed as soon as the class is loaded
    //runs first before everything, only runs one time
    // if the static variables needs several steps to be initalized then static block is the best for you to use.
    //But if your static variables can be set within one step its not necessary for you to have static block

    public static void main(String[] args) {
        System.out.println("Main method");
    }


    static { // runs first before anything, and only runs one time
        System.out.println("Static Block ");
    }

    static {
        System.out.println("Static Block 2");
    }

    static {
        System.out.println("Static Block 3");
    }



}
