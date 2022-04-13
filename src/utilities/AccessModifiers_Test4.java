package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4 extends ProtectedAccessModifier {

    public static void main(String[] args) {

        //  System.out.println(AccessModifiers_Test4.name1); Default is not visible outside the package
        System.out.println(AccessModifiers_Test4.name2);// protected is visible outside the package in subclass ONLY
        // outside the package,if there is a subclass protected is always visible to the subclass outside the package

       // AccessModifiers_Test4.method1();
        AccessModifiers_Test4.method2();


    }


}
