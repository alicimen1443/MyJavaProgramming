package java_Shorts;

public class StringQuiz {
    public static void main(String[] args) {

        String str=" ";
        str.trim();
        boolean A=str.isEmpty();

        System.out.println(A);

        String ta ="A";
        ta=ta.concat("B");
        String tb="C";
        ta=ta+tb;
        ta.replace('C','D');
        ta=ta+tb;

        System.out.println(ta);

        String s1 ="abc";
        String s2= "abc";
        System.out.println("s1==s2is:"+s1==s2);


    }
}
