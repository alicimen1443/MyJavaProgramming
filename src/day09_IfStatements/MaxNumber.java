package day09_IfStatements;

public class MaxNumber {
    public static void main(String[] args) {
        int n1 = 200, n2=300;

        if(n1<n2){
            System.out.println(n2+" is the max number");
        }
        if(n2<n1){
            System.out.println(n1+ " is the max number");
        }
        if(n1==n2){
            System.out.println("Equal");
        }
    }
}
