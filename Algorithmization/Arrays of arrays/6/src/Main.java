import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int squareLength = sc.nextInt();
        int array[][] = new int[squareLength][squareLength];

        for(int i=0;i<squareLength;i++){
            for(int j=0;j<squareLength;j++){
                array[i][j] = 0;
            }
        }
        int left = 0;
        int right = squareLength;
        //one way up to down
        for(int i=0;i<squareLength;i++,left++,right--){
            for(int j=left;j<right;j++){
                array[i][j] = 1;
            }
        }
        //second way down to up
        left = 0;
        right = squareLength;
        for(int i=squareLength-1;i>0;i--,left++,right--){
            for(int j=left;j<right;j++){
                array[i][j] = 1;
            }
        }


        for(int i=0;i<squareLength;i++){
            for(int j=0;j<squareLength;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
