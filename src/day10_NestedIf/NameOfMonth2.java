package day10_NestedIf;

public class NameOfMonth2 {
    public static void main(String[] args) {

        int n = 5;
        String str="";

        String month=n==1?"Jan":n==2?"Feb":n==3?"Mar":n==4?"Ap":n==5?"May":n==6?"June" // paranthesis are optional but make it mandatory by yourself
                :n==7?"July":n==8?"August":n==9?"Sep":n==10?"Oc":n==11?"Nov":"Dec";

        System.out.println(month);
        // the number of question marks have to be equal with the number of colons


        System.out.println("-------------------------------------------------------------");

        if(n>=1&&n<=12){
            switch (n){

                case 1 :
                    str="Jan";break;
                case 2 :
                    str="Feb";break;
                case 3 :
                    str="march"; break;
                case 4 :
                    str="April"; break;
                case 5 :
                    str="May"; break;
                case 6 :
                    str="June"; break;
                case 7 :
                    str="July"; break;
                case 8 :
                    str="August"; break;
                case 9 :
                    str="September"; break;
                case 10 :
                    str="October"; break;
                case 11 :
                    str="November"; break;
                case 12 :
                    str="December"; break;
                default:
                    str="Invalid";
            }
            System.out.println(str);

        }

    }
}
