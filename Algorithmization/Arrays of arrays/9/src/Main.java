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
        int maxOfSumColumn = Integer.MIN_VALUE;
        for(int i=0;i<row;i++){
            int sumOfColumn = 0;
            for(int j=0;j<col;j++){
                sumOfColumn+=array[j][i];
            }
            System.out.println("Column "+(i+1)+" sum = " + sumOfColumn + " ");
            if(sumOfColumn>maxOfSumColumn){
                maxOfSumColumn = sumOfColumn;
            }
        }
        System.out.println("\nMax sum of columns is: "+maxOfSumColumn);
    }
}
