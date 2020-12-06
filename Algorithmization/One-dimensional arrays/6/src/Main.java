import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int array[] = new int [lengthOfArray];


        int sumOfPrimeNumbers = 0;
        for(int i=0;i<lengthOfArray;i++){
            array[i] = sc.nextInt();
            if(isPrime(i))
                sumOfPrimeNumbers+=array[i];
        }
        System.out.println(sumOfPrimeNumbers);
    }

    public static Boolean isPrime(int number){
        if(number<2)
            return false;
        for(int i=2;i*i<=number;i++){
            if(number%i==0)
                return false;
        }
        return true;
    }
}
