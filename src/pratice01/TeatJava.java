package pratice01;

public class TeatJava {

    public static void main(String[] args) {
        int Currentyear = 2019;
        int Donaldyear = 1990;
        int Jonyear = 1975;
        int ageD;
        int ageJ;
        ageD = Currentyear - Donaldyear;
        ageJ = Currentyear - Jonyear;

        System.out.println("Donald age is ="+ ageD);
        System.out.println("jon age is ="+ ageJ);

        if(ageD>20 && ageD<40){
            System.out.println("Dlnald born in March");
        }else{
            System.out.println("Donald born in October");
        }
        if(ageJ>20 && ageJ<40){
            System.out.println("Jon born in March");
        }else{
            System.out.println("Jon born in October");
        }
    }

}
