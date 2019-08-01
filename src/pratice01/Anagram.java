package pratice01;

import java.util.Arrays;

public class Anagram {
  //  private static Object String;

    public static void main(String[] args) {


       // Anagram anagram  = new Anagram();
        String firstword = "army";
        String secondword = "mary";


        char [] tochararray1 =firstword.toCharArray();
        char [] tochararray2 = secondword.toCharArray();


        Arrays.sort(tochararray1);
        Arrays.sort(tochararray2);


        if(Arrays.equals(tochararray1,tochararray2)){
            System.out.println("the word is anagram");
        }else {
            System.out.println("the word is not anagram");}

         }









}
