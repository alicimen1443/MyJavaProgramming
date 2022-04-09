package day23_CustomMethods_Void;

import java.util.Arrays;

public class PracticeTask16_Anagram {
    public static void main(String[] args) {

        anagram("listen","silent");

    }

    public static void anagram (String s1,String s2){

        char [] ch1 = s1.toCharArray();   // [l,i,s,t,e,n] for ex.
        Arrays.sort(ch1);

        char [] ch2 = s2.toCharArray();
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("anagram");
        }else{
            System.out.println("not anagram");
        }


            }


        }



/*
 17. create a method that can check if two strings are anagram
    		ex:
    			anagram("silent", "listen")


			output:
				silent and listen are anagram
 */
