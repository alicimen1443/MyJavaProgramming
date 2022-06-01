package day52_Map_FunctionalInterface;

@FunctionalInterface
public interface MyFirstFunctionalInterface {

    //Normal interface we create it for the purpose of inheritance, but functional interface
    //we create it for the purpose of creating a function.function means method
    //that is the first difference between regular and functional interface
    //It can only have one abstract method.In regular interface as many as you want.
    //because one functional interface acts as a function

    void apply(int n);




}
