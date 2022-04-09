package java_Shorts;

public class Unit2_Quiz {
    public static void main(String[] args) {
        String result=3425>(9*1000)? "garden":"patio";
        result.substring(2);
        System.out.println(result);

        String s="the game was tied at 2-2";
        s=s.substring(5);

        int index =s.indexOf("game");
        System.out.println(index);

        int number =5;
        while(number<100){
            number+=number;
        }
        System.out.println(number);

        int a=0;
        do{
            a=a++ + --a -(a%3);
        }while (++a<4);
        System.out.println(a);

        String str ="The whole time it was raining.";
        do {
            System.out.print(str.charAt(0));
            str=str.substring(3);
        }while(!str.isEmpty());
        System.out.println();

        String input ="today it will be 100 degrees !";
        int n =0;

        while(n++<input.length()){
            if(n==8){
                continue;
            }else if(n==9){
                break;
            }
            System.out.print(input.charAt(++n));
        }







    }


}
