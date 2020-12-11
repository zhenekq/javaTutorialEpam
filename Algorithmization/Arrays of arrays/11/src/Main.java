import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int row = 10;
        int col = 20;
        int array[][] = new int[row][col];

        int leftBorderOfRandom = 0;
        int rightBorderOfRandom = 15;


        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                array[i][j] = leftBorderOfRandom + (int)(Math.random() * rightBorderOfRandom);
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        boolean isOneExists = false;
        for(int i=0;i<row;i++){
            int counterOfFiveInRow = 0;
            for(int j=0;j<col;j++){
                if(array[i][j] == 5){
                    counterOfFiveInRow++;
                }
                if(counterOfFiveInRow>=3){
                    isOneExists = true;
                    System.out.println("Row where number 5 is equals or more than 3 times: "+i);
                    break;
                }
            }
        }
        if(!isOneExists)
            System.out.println("No one row where number 5 is equals or more than 3 times");
    }
}