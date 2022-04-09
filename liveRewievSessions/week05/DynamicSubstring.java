package week05;

public class DynamicSubstring {
    public static void main(String[] args) {

        String searchResult = "result count:12345";
                       //0123456789......

        // substring() method : it takes index location of the char, returns you a new string

        System.out.println(searchResult.substring(13));// takes the beginning index then rest of the string // 12345
        System.out.println(searchResult.substring(13,18));

        System.out.println(searchResult.indexOf(":")); // 12
        int colonIndex = searchResult.indexOf(":");// 12

        System.out.println(searchResult.substring(colonIndex+1)); // 12345
        System.out.println(searchResult.substring(searchResult.indexOf(":")+1));//12345
        String newsearchResult = searchResult.substring(searchResult.indexOf(":")+1);
        System.out.println("newsearchResult = " + newsearchResult);

        // in indexof("") if there are one more than same character?


        String searchResultTwo = " username:oscar search result count:12345 more colon : more ";
        int firstColon = searchResultTwo.indexOf(":");
        System.out.println("firstColon = " + firstColon);
        int secondColon =searchResultTwo.indexOf(":",firstColon+1);
        System.out.println("secondColon = " + secondColon);

        System.out.println(searchResultTwo.substring(secondColon+1,secondColon+6)); // 12345
        // secondColon+1 : begining index
        // secondColon+6 : ending index



        String today = " i coded a lot of [java] today";

        today= today.substring(today.indexOf("[")+1,today.indexOf("]")); // java
        System.out.println(today);












    }
}