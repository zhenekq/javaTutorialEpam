import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int lengthOfArray = sc.nextInt();
        int array[] = new int[lengthOfArray];

        for(int i=0;i<lengthOfArray;i++){
            array[i] = sc.nextInt();
        }
        int index = 0;
        int arrayOfHighFrequency[] = new int[lengthOfArray];
        for(int i=0;i<lengthOfArray;i++){
            for(int j=0;j<lengthOfArray;j++){
                if(array[i] == array[j])
                    arrayOfHighFrequency[i] = ++index;
            }
            index = 0;
        }
        int maxValue = Integer.MIN_VALUE;
        for(int i=0;i<lengthOfArray;i++){
            if(arrayOfHighFrequency[i]>=maxValue){
                maxValue = arrayOfHighFrequency[i];
            }
        }
        System.out.println("\n Max value index: "+maxValue);
        int minValueOfArray = Integer.MAX_VALUE;
        for(int i=0;i<lengthOfArray;i++){
            System.out.print(arrayOfHighFrequency[i] + " ");
            if(arrayOfHighFrequency[i]==maxValue && array[i]<=minValueOfArray){
                    minValueOfArray = array[i];
            }
        }
        System.out.println("\t"+minValueOfArray);
    }
}
