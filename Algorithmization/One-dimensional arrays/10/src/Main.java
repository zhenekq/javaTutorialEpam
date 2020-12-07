import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int array[] = new int[lengthOfArray];

        ArrayList<Integer> arrayList = new ArrayList<>(lengthOfArray/2);
        System.out.print("Own array: ");
        for(int i=0;i<lengthOfArray;i++){
            array[i] = sc.nextInt();
            if(i%2==0)
                arrayList.add(array[i]);
            System.out.print(array[i]+" ");
        }
        System.out.println("\n"+arrayList.toString());
    }
}
