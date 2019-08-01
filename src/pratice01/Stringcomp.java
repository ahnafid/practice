package pratice01;

public class Stringcomp {
    public static void main(String[] args) {
      /**  String c = "We are comparing the content with a StringBuffer content";
        StringBuffer sb =
                new StringBuffer("We are comparing the content with a StringBuffer content");
        /**
         * We can use contentEquals() method to compare content with a StringBuffer.
         * It returns boolean value.
         */
      /**  if(c.contentEquals(sb)){
            System.out.println("The content is equal");
        } else {
            System.out.println("The content is not equal");
        }
        StringBuffer asb =
                new StringBuffer("You cannot compare the content with a String content");
        if(c.contentEquals(asb)){
            System.out.println("The content is equal");
        } else {
            System.out.println("The content is not equal");
        }*/
       String d = "we are comparing the content with StringBuffer ";
       StringBuffer sb = new StringBuffer("we are comparing");
       if(d.contentEquals(sb)){
           System.out.println("the content is equal");
       }else {
           System.out.println("the content is not equal");
       }
       StringBuffer asb = new StringBuffer("cannot compare");
        if(d.contentEquals(asb)){
            System.out.println("the content is equal");
        }else{
            System.out.println("the content is not equal");
        }

    }
}
