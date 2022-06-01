package day51_Map;

import java.sql.SQLOutput;

public class TestEnum {

    public static void main(String[] args) {
     //   Enum , you should only create it when you have a small set of values

        //  String browser = "Wooden Spoon";
        Browser browser = Browser.CHROME;
        //That is the benefit of using ENUM.You have more control over
        //what can be assigned to the variable

        switch (browser){

            case FIREFOX:
                System.out.println("Firefox is selected");
            break;

            case SAFARI:
                System.out.println("Safari is selected");
                break;
            case OPERA:
                System.out.println("Opera is selected");
                break;
            case EDGE:
                System.out.println("Edge is selected");
                break;

            default:
                System.out.println("Chrome is selected");

        }

        System.out.println("------------------------------");

        Season season = Season.SUMMER;

        Level level = Level.ADVANCED;

    }
}