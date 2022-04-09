package day20_Arrays;

public class PracticeTask02_ClassMatesReverse {
    public static void main(String[] args) {

        String[] classMates = {"Yasin Karadağ","Erol Aksel","Ekrem Muş","Ali Türkoğlu","Metin Beyhan",
                "Turan Yüce","Mevlüt Çetin","Özkan Arıkan","Salih Engin","Süleyman Dağtekin"};


        for (int i =0; i < classMates.length; i++) {

            for (int j = classMates[i].length()-1; j >=0 ; j--) {

                System.out.print(classMates[i].charAt(j));

            }
            System.out.println();
        }






    }
}


/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */