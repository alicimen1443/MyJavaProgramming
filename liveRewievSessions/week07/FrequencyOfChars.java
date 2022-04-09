package week07;

public class FrequencyOfChars {
    public static void main(String[] args) {

    /*
What is pseudocode?  In computer science, pseudocode is a plain language description of the steps in an algorithm or another system.
 Pseudocode often uses structural conventions of a normal programming language, but is intended for human reading rather than machine reading.
- Iterate over given string with an outer loop so that you can get each char
- I need an inner loop to iterate again to compare that particular char with the rest of the string
-- Empty Bucket : this will hold each char and its frequency   String result = ""
 */
            String str = "aabcccd";
            String result = ""; //a2b1c3d1


        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=0;

            for (int j = 0; j < str.length(); j++) {
                if(ch==str.charAt(j)){
                    count++;
                }
            }
            if(result.contains(ch+"")){
                continue;
            }
            result+=""+ch+count;
        }
        System.out.println(result);




// if I already have that particular char in the bucket, don't execute following codes


        }

    }


