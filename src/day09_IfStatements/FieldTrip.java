package day09_IfStatements;

public class FieldTrip {
    public static void main(String[] args) {
        int tripNumber =6;
        String details;

        if(tripNumber==1){
            details="location - Apple orchard\nnumber of groups-3\nteacher in charge-Ms. Smith";
        }
        else if(tripNumber==2){
            details="location - Zoo\nnumber of groups-7\nteacher in charge-Mr. Lee";
        }
        else if(tripNumber==3){
            details="location - Aquarium\nnumber of groups-5\nteacher in charge-Ms. Wilson";
        }
        else if(tripNumber==4){
            details="location - Movie Theater\nnumber of groups-2\nteacher in charge-Ms. Reyes";
        }
        else if(tripNumber==5){
            details="location - Museum\nnumber of groups-5\nteacher in charge-Ms. Lela";
        }
        else{
            details="location - Six Flags\nnumber of groups-8\nteacher in charge-Mr. Watt";
        }
        System.out.println("details = " + details);

    }
}

/*
8.Create a class called FieldTrip. Your school goes on a Field trip each year.
 The place you go will be based on your grade. Given a variable gradeNumber (1-6)
 figure out the details of your field trip. Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt


 */
