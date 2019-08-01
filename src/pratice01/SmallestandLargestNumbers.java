package pratice01;

import java.util.Arrays;

public class SmallestandLargestNumbers {
     static int numbers[] = {15,26,-25,4598,-20,8976};

    public static void main(String[] args) {
       // SmallestandLargestNumbers smal=new SmallestandLargestNumbers();

        int largest =numbers[0];
        int smallest =numbers[0];




        for(int i=1;i<numbers.length;i++){

            if(numbers[i]>largest){
                largest = numbers[i];
            }
            else if(numbers[i]<smallest){
                smallest = numbers[i];


            }
        }

        System.out.println("largest number is::"+largest);
        System.out.println("smallest number is::"+smallest);
    }

}
