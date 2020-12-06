import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lengthOfTheArray = sc.nextInt();
        int array[] = new int[lengthOfTheArray];

        for(int i=0;i<lengthOfTheArray;i++){
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the number K: ");
        int k = sc.nextInt();
        int sumAnswer = 0;
        for(int i=0;i<lengthOfTheArray;i++){
            if(array[i] % k == 0){
                sumAnswer+=array[i];
            }
        }
        System.out.println(sumAnswer);
    }
}
