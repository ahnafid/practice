package pratice01;

public class Palindrome {

    public static void main(String[] args) {
        String name = "Abba";
        String rev = "";

       char [] arrays =name.toUpperCase().toCharArray();

       for(int i = arrays.length-1;i>=0;i--){
           rev =rev + arrays[i];

       }
       // System.out.println(name +" palindrome word is " + rev);
        if(rev.equalsIgnoreCase(name)){
            System.out.println("The word is palindrome ");
        }else {
            System.out.println("The word is not palindrome");
        }

        int r,sum=0,temp;
        int n = 353;
         temp = n;
         while (n>0){
             r = n%10;
             sum =(sum*10)+r;
             n = n/10;
         }
         if(temp==sum)
             System.out.println("palindrome number");
         else
             System.out.println("not palindrome");




    }

}
