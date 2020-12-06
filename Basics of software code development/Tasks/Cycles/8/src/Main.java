import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int lengthOfFirstNumber = String.valueOf(firstNumber).length();
        int lengthOfSecondNumber = String.valueOf(secondNumber).length();
//        int minSizeNumber = Math.min(lengthOfFirstNumber, lengthOfSecondNumber);
//        int maxSizeNumber = Math.max(lengthOfFirstNumber, lengthOfSecondNumber);
        for(int i=1;i<=lengthOfFirstNumber;i++){
            int digitOfFirstNumber = (int) (firstNumber%Math.pow(10,i)/Math.pow(10,i-1));
            for(int j=1;j<=lengthOfSecondNumber;j++){
                int digitOfSecondNumber = (int) (secondNumber%Math.pow(10,j)/Math.pow(10,j-1));
                if( digitOfFirstNumber == digitOfSecondNumber){
                    System.out.println(digitOfFirstNumber);
                    break;
                }
            }
        }
        System.out.println(lengthOfFirstNumber+" "+lengthOfSecondNumber);
    }
}
