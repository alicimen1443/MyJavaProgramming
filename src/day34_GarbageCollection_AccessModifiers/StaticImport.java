package day34_GarbageCollection_AccessModifiers;
import static day34_GarbageCollection_AccessModifiers.Circle.pi;
public class StaticImport {

    public static void main(String[] args) {

        /*
        regular import: imports everything from the class
			import packageName.className;
			import packageName.*;


		static import:

			import static packageName.className.staticMember;  // imports one static member of a class
			import static packageName.className.*;			 // imports all static members of a class
         */

        System.out.println(Circle.pi);
        System.out.println(pi);






    }
}
