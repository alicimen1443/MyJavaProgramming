package day27_WrapperClasses;

public class PracticeTask04_TotalNumber {

    public static void main(String[] args) {
        String str = "JAVA java";

        boolean r = totalNumberOfChars(str);
        System.out.println(r);

    }

    public static boolean totalNumberOfChars(String str){

        int countUpperCaseChars=0;
        int countLowerCaseChars=0;
        boolean result=false;

        for (char each : str.toCharArray()) {
            if(Character.isUpperCase(each)){
                countUpperCaseChars++;
            }else if(Character.isLowerCase(each)){
                countLowerCaseChars++;
            }
        }
        if(countLowerCaseChars==countUpperCaseChars){
            result=true;
        }
        return result;

    }
}
/*
4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */