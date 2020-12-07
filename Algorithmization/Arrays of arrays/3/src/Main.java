import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int array[][] = new int [row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j] = sc.nextInt();
            }
        }
        //PRINT THE ROW
        System.out.println("Enter the number of row: ");
        int k = sc.nextInt();
        System.out.print("Current row: ");
        for(int i=0;i<row;i++){
            System.out.print(array[k][i]+" ");
        }
        //PRINT THE COLUMN
        System.out.println("\nEnter the number of column: ");
        int p = sc.nextInt();
        System.out.print("Current row: ");
        for(int i=0;i<col;i++){
            System.out.print(array[i][p]+" ");
        }
    }
}
