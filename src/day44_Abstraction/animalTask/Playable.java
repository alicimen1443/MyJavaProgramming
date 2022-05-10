package day44_Abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true; // static and final by default

 /*   static {   // interface Can NOT have static block or any block
        isFriendly=true;
    }

  */

   /* public static void method1(){ //Verifies that the variable is static
        System.out.println(isFriendly);
    }

    */

    // public is the only access modifier in the interface

    void play(); // abstract by default and public
}
