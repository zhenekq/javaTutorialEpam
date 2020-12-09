import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int array[][] = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the columns to swap: ");
        int swapColFirst = sc.nextInt();
        int swapColSecond = sc.nextInt();

        for(int i=0;i<row;i++){
            int tmp = array[i][swapColFirst];
            array[i][swapColFirst] = array[i][swapColSecond];
            array[i][swapColSecond] = tmp;
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
