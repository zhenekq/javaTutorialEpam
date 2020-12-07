import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int doubleArray[][] = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                doubleArray[i][j] = sc.nextInt();
            }
        }
        int arrayOfBoundsIndexes[] = new int[col];
        int index = 0;
        for(int j=0;j<col;j++){
            if( j%2!=0 && doubleArray[row-1][j] < doubleArray[0][j]){
                arrayOfBoundsIndexes[index] = j;
                index++;
            }
        }

        for(int i=0;i<index;i++){
            System.out.print(arrayOfBoundsIndexes[i]+" ");
        }
        System.out.println();
        for(int i=0;i<index;i++){
            for(int j=0;j<row;j++){
                System.out.print(doubleArray[j][arrayOfBoundsIndexes[i]] + " ");
            }
            System.out.println();
        }
    }
}
