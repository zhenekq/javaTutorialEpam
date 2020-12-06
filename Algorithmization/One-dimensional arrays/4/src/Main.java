import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int array[] = new int [lengthOfArray];

        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        int maxValueIndex = 0, minValueIndex=0;

        for(int i=0;i<lengthOfArray;i++){
            array[i]=sc.nextInt();
            if(array[i]>=maxValue) {
                maxValue = array[i];
                maxValueIndex = i;
            }
            if(array[i]<=minValue) {
                minValue = array[i];
                minValueIndex = i;
            }
        }

        int emptyBottleOfMilk = array[maxValueIndex];
        array[maxValueIndex] = array[minValueIndex];
        array[minValueIndex] = emptyBottleOfMilk;

        System.out.print("Edited array: ");
        for(int i=0;i<lengthOfArray;i++){
            System.out.print(array[i]+" ");
        }
    }
}
