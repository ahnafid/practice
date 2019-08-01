package pratice01;

public class Factorial {

    public static void main(String[] args) {

        int number = 6; //using for loop
        int factorial =1;

        for (int i =1;i<=number;i++){
            factorial = factorial * i;
        }
        System.out.println("factorial number is "+factorial);

      int num = 5;
      int fact = 1;

      for (int i = 5;i>0;i--){
          fact = fact * i;
      }
        System.out.println("factorial num is "+fact);

      int num1 = 4; // using while loop
      int fact1 = 1;

      int i = 4;
      while (i>0){
          fact1 = fact1 * i;
          i--;
      }

        System.out.println("factorial number is "+fact1);
      int num2 = 8;
      int fact2 = 1;
      int j = 1;
      while (j<=num2){
          fact2 = fact2 * j;
          j++;
      }
        System.out.println("factorial number is "+fact2);

    }


}
