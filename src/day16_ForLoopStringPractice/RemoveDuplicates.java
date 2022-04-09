package day16_ForLoopStringPractice;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbaacc";

        String result="";    //abc
                    //i<=7==> i<8

        for(int i = 0; i<str.length(); i++){ //i :represent the index numbers of str(start from zero)
        String ch ="" + str.charAt(i);// represents each Character of str

            if(!result.contains(ch)){
                result+=ch;
            }
        }
        System.out.println(result); // make sure that in the loop you dont have print statement. We are using this loop only for adding the characters to the result variable.For nothing else












    }
}
