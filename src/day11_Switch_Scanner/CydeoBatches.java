package day11_Switch_Scanner;

public class CydeoBatches {

    public static void main(String[] args) {

        String batches ="US evening";
        boolean isValid = (batches=="US morning")||(batches=="US evening")||(batches=="EU");
        String str=" ";

        if (isValid) {
            switch (batches){
                case "US morning":
                    str ="Class times are 10-5 EST. M, T, Th, F.";
                    break;
                case "US evening":
                    str="Class times are 7-10 EST. M, T, W, Th, S, S";
                    break;
                default:
                    str="Class times are  10-5 EST. M, T, W, Th, F.";
            }

        }else{
            str = "Invalid Batch";
        }
        System.out.println(str);

        System.out.println("---------------------------------------------");

        switch(batches){    //only switch
            case "US morning":
                str ="Class times are 10-5 EST. M, T, Th, F.";
                break;
            case "US evening":
                str="Class times are 7-10 EST. M, T, W, Th, S, S";
                break;
            case "EU" :
                str="Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                str = "Invalid Batch";

        }
        System.out.println(str);

    }
}

/*
4. Create a class named Cydeo batches. In Cydeo we have three batch types: US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.

        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Btach"

        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */
