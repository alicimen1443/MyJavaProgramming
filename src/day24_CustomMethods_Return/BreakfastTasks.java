package day24_CustomMethods_Return;

import java.util.Arrays;

public class BreakfastTasks {
    public static void main(String[] args) {

        //only disadvantages of void method is we cannot use the variables outside the method.Void method just executes
        //the function thats all.It cannot return a value.

        initials("cydeo", "school");

        System.out.println("---------------------------");

        domain("alicimen1443@gmail.com");

        System.out.println("--------------------------- ");

        String[] emails ={"josh@gmail.com","Jim@yahoo.com","Elminur@cydeo.com","Gulsen@gmail.com"};

        for (String eachEmail : emails) {
            domain(eachEmail);
        }
        System.out.println("---------------------------------------------------------------");

        nameOfMonth(5);

        System.out.println("-------------------------------");

        nameOfDay(3);

        System.out.println("--------------------------------");

        daysInMonth(6);

        System.out.println("--------------------------------------");



    }

    //1. Create a method that can display the initials of the person.   initials(String firstName, String lastName)

    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);

    }

    //2. Create a method that can display the domain of the email.    domain(String email)

    public static void domain(String email) { //Cydeo@gmail.com

       /* String[] domain=email.split("@");
        System.out.println(domain[1]);
        */
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println(domain);

    }

    //3. Create a method that can display the name of the month based on the given number to the method

    public static void nameOfMonth(int number){

        String name = "";

        if(number>=1&&number<=12){
            name=(number==1)?"Jan":(number==2)?"Feb":(number==3)?"Mar":(number==4)?"Apr":(number==5)?"May":
                    (number==6)?"Jun":(number==7)?"July":(number==8)?"Aug":(number==9)?"Sep":(number==10)?"Oc":
                            (number==11)?"Nov":(number==12)?"Dec":"Invalid";
        }else{
            name="Invalid";
        }
        System.out.println(name);
    }

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameOfDay(int number){
        String name = "";

        if(number>=1&&number<=7){
            name=(number==1)?"Mon":(number==2)?"Tu":(number==3)?"Wed":(number==4)?"Thu":(number==5)?"Fri":
                    (number==6)?"Sat":(number==7)?"Sun":"Invalid";
        }else{
            name="Invalid";
        }
        System.out.println(name);


    }

    //5. Create a method that can print how many days a month has

    public static void daysInMonth(int number){

        if(number>0 && number<12){
            switch (number){
                case 2:
                    System.out.println("Has 28 days");break;
                case 4: case 6: case 9: case 11:
                    System.out.println("Has 30 days");break;
                default:
                    System.out.println("Has 31 days");
            }
        }else{
            System.out.println("Invalid number");
        }


    }




}

/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

	6. ageGroups
	            age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)

 */

