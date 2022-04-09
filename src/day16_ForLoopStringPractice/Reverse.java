package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {

        String str = "I love Java, Java is fun programming language";
        //index:      0123456...
        String result = "";  // contains the reversed version of str

     /*   result+=str.charAt(str.length()-1); //n
        result+=str.charAt(str.length()-2); //o
        result+=str.charAt(str.length()-3); //o
        result+=str.charAt(str.length()-4); //p
        result+=str.charAt(str.length()-5); //S
        result+=str.charAt(str.length()-6); // ' '
        result+=str.charAt(str.length()-7); //n
        result+=str.charAt(str.length()-8); //e
        result+=str.charAt(str.length()-9); //d
        result+=str.charAt(str.length()-10); //o
        result+=str.charAt(str.length()-11); //o
        result+=str.charAt(str.length()-12);// W

      */ // this is just for the understanding the approach

        for (int i =str.length()-1 ; i >=0 ; i--) { //i : index numbers of str(starting last index to index 0)
            result+=str.charAt(i);// adding each character to result

        }

        System.out.println(result);



    }
}

/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */
