package day20_Arrays;

public class AppearedTwice {
    public static void main(String[] args) {

        char [] chars = {'A','A','A','B','B','C','D','D','D'};

        for (int i = 0; i < chars.length; i++) {

            int frequency=0;
            char ch = chars[i];
            for (int j = 0; j < chars.length; j++) {

                if(chars[j]==ch){
                    frequency++;
                }
            }
            if(frequency==2){
                System.out.println(ch);break;
            }
        }

    }
}
