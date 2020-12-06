import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int array[] = new int[lengthOfArray];
        for(int i=0;i<lengthOfArray;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the tmp value: ");
        int tmpValue = sc.nextInt();
        int numberOfReplacements = 0;
        for(int i=0;i<lengthOfArray;i++){
            if(array[i]>tmpValue){
                array[i] = tmpValue;
                numberOfReplacements++;
            }
        }
        System.out.print("Edited array: ");
        for(int i=0;i<lengthOfArray;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("\n"+"Number of replacements: "+numberOfReplacements);
    }
}
