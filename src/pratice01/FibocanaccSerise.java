package pratice01;

public class FibocanaccSerise {

    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
       int c;
       for (int i=1;i<=10;i++){
           c=a+b;
           a=b;
           b=c;
           System.out.print(" "+c);

       }
        System.out.print("******");

        int max=15;
       int n = 0;
       int m=1;
       for (int i=1;i<=max;i++){
           System.out.print(n+" " );
           int sum = n+m;
           n=m;
           m= sum;

       }


    }
}
