import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int squareLengthOfArray = sc.nextInt();
        int array[][] = new int[squareLengthOfArray][squareLengthOfArray];
        for(int i=0;i<squareLengthOfArray;i++){
            int helpValue = squareLengthOfArray;
            for(int j=0;j<squareLengthOfArray;j++){
                if(i%2==0)
                    array[i][j]=j+1;
                else
                    array[i][j] = helpValue--;
            }
        }
        for(int i=0;i<squareLengthOfArray;i++) {
            for (int j = 0; j < squareLengthOfArray; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
