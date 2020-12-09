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
        int col = squareLength;

        for(int i=0;i<squareLength;i++, col--){
            int value = 1;
            for(int j=0;j<col;j++, value++){
                array[j][i] = value;
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
