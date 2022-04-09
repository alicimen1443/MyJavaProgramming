package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";
        //domain:
        int beginningIndex = email.indexOf("@")+1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex,endingIndex);
        System.out.println("domain = " + domain);

        System.out.println("------------------------------------------------------");

        String str1 = "Java is fun, Java is cool";


        String s1= str1.substring(0,10+1);
        System.out.println("s1 = " + s1);

        int beg = str1.lastIndexOf("J");  //Java is cool

        String s2 = str1.substring(beg);
        System.out.println(s2);


        String str2 = "Java is fun, Java is cool, I love Java";
        int begn = str2.indexOf(" J")+1;
        int endn = str2.lastIndexOf(",");

        String s3 = str2.substring(begn,endn); //Java is cool

        System.out.println("s3 = " + s3);

        String s4 = str2.substring(str2.lastIndexOf("I"));
        System.out.println(s4);




    }
}

/*
1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo
 */
