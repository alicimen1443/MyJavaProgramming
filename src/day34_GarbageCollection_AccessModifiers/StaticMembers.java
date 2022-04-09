package day34_GarbageCollection_AccessModifiers;

public class StaticMembers {

   static class class1{ // classes, they do not have any memory


    }

    public static int num=100;

    public static void method(){

    }
    static {

    }


}

class A{ // outer class
    static class B{ // inner class only the inner class can be static
        public static void method1(){

        }

    }

}
class C{
    public static void main(String[] args) {
        A.B.method1();
    }
}

class X{

}

class Y{

}

class Z{
    static class Q{// this is the only one that can be static

    }
}