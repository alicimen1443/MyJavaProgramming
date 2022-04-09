package day20_Arrays;

public class PracticeTask01_ClassMates {
    public static void main(String[] args) {

        String[] classMates = {"Yasin Karadağ","Erol Aksel","Ekrem Muş","Ali Türkoğlu","Metin Beyhan",
                "Turan Yüce","Mevlüt Çetin","Özkan Arıkan","Salih Engin","Süleyman Dağtekin"};


        for (int i = 0; i < classMates.length; i++) {

            System.out.println(classMates[i].charAt(0)+"."+classMates[i].charAt(classMates[i].indexOf(" ")+1)+".");
        }




/*
          for (String each : classMates) {

               String initials= each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);

              System.out.println(initials);

        }

 */



    }
}

/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */
