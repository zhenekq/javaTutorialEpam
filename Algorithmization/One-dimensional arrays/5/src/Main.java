import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lengthOfArray = sc.nextInt();
        int array[] = new int [lengthOfArray];

        for(int i=0;i<lengthOfArray;i++) {
            array[i] = sc.nextInt();
            if (array[i] > i)
                System.out.print(array[i] + " ");
        }
    }
}
