package day10_NestedIf;

public class NameOfMonth {

    public static void main(String[] args) {
        int number = 11;
        String month=""; // temporary

        if(number>=1&&number<=12){  // This nested if statement that we are about the create is only used for assigning the right data to the string variable result

            if(number==1){
                month="January";
            }
            else if(number==2){
                month="February";
            }
            else if(number==3){
                month="March";
            }
            else if(number==4){
                month="April";
            }
            else if(number==5){
                month="May";
            }
            else if(number==6){
                month="June";
            }
            else if(number==7){
                month="July";
            }
            else if(number==8){
                month="August";
            }
            else if(number==9){
                month="September";
            }
            else if(number==10){
                month="October";
            }
            else if(number==11){
                month="November";
            }else{
                month="December";
            }

        }else{
            System.out.println("Invalid number");
        }
        System.out.println(month);
    }
}
