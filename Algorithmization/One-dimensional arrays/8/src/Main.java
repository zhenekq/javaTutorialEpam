import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int helpSch = 0;
        Integer minIndex = null;
        Integer array[] = new Integer[n];
        ArrayList <Integer> newArray = new ArrayList();
        for(int i = 0;i < n;i++) {
            array[i] = sc.nextInt();
            newArray.add(array[i]);
            if(array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        for(int i=0;i<n;i++) {
            if(array[i]==min) {
                helpSch++;
            }
        }

        System.out.println(helpSch);
        int newArraySize = n - helpSch;
        Integer arrayWithoutMin[] = new Integer[newArraySize];
        int field=0;

        for(int i=0;i<n;i++) {
            if(array[i]!=min) {
                arrayWithoutMin[field]=array[i];
                field++;
            }
        }
        for(int i=0;i<newArraySize;i++) {
            System.out.print(arrayWithoutMin[i]+" ");
        }

    }
}
