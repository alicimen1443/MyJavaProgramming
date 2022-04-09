package week10;

public class WrapperClassExamples {
    public static void main(String[] args) {

        int i1 = 100;

        Integer i2 = i1;  // Auto-boxing : from primitive to wrapper class object type

        //explicit example
        Long i3 = (long) i1;

        Integer n1 = 300;

        int n2 = n1; // un-boxing : from object to primitive

        String str ="123";

        System.out.println(str+1);  //1231

        int num = Integer.parseInt(str); // turns the value to primitive data type
        System.out.println(num+1); //124

        String price = "$27.16";
        price=price.substring(1);

        double priceInDouble = Double.parseDouble(price); // primitive
        Double priceInWrapDouble = Double.valueOf(price); //object
        System.out.println(priceInDouble+10);

        //Difference between Integer.parseInt(str) and Integer.valueOf(str)

        Integer num2 = Integer.valueOf(str);  // turns the value to wrapper class
        System.out.println(num2+1);

        char ch = 'a';

        boolean isDigit = Character.isDigit(ch);
        System.out.println("isDigit = "+isDigit);
        boolean isLetter = Character.isLetter(ch);
        System.out.println("isLetter = "+isLetter);

        String strTwo="a1b2c3";

        //sum of the integers inside strTwo

        int sum=0;

        for (char each : strTwo.toCharArray()) {
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(each+"");
            }
        }
        System.out.println("sum = " + sum);

        String strThree = "abcd1234!@#$efghi6789#$%^ABCD";

        String letters="";
        String upperCaseLetters="";
        String lowerCaseLetters="";
        String digits="";
        String specialChars="";

        for(char each: strThree.toCharArray()){ // char each : primitive
            if(Character.isLetter(each)){ // autoboxing is done here implicitly
                letters+=each;
                if(Character.isUpperCase(each)){
                    upperCaseLetters+=each;
                }else{
                    lowerCaseLetters+=each;
                }
            }else if(Character.isDigit(each)){
                digits+=each;
            }else{
                specialChars+=each;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("lowerCaseLetters = " + lowerCaseLetters);
        System.out.println("upperCaseLetters = " + upperCaseLetters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}
