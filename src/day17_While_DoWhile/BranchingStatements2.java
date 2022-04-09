package day17_While_DoWhile;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <='E' ; i++) {

            if(i=='C'){
                continue;
            }
            System.out.println(i); //A B
        }

        System.out.println("-------------------------------------------------");

        for (int i = 1; i <=10 ; i++) {
            if(i%2==1){
                continue;   // skip
            }
            System.out.println(i); // skip the odd numbers
        }

        for (int i = 1; i <10 ; i++) {
            if(i%2==0){
                continue;   // skip
            }
            System.out.println(i); // skip the even numbers
        }








    }
}
