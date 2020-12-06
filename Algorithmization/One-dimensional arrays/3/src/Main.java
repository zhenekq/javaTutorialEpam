import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int array[] = new int[lengthOfArray];
        int amountOfPositiveNumbers = 0;
        int amountOfNegativeNumbers = 0;
        int amountOfZeroNumbers = 0;
        for(int i=0;i<lengthOfArray;i++){
            array[i] = sc.nextInt();
            if(array[i]>0)
                amountOfPositiveNumbers++;
            else if(array[i]<0)
                amountOfNegativeNumbers++;
            else
                amountOfZeroNumbers++;
        }
        System.out.println("Amount of positive numbers: "+amountOfPositiveNumbers);
        System.out.println("Amount of negative numbers: "+amountOfNegativeNumbers);
        System.out.println("Amount of zero numbers: "+amountOfZeroNumbers);
    }
}
