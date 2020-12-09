import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int squareLength = sc.nextInt();
        int counterOfPositiveValues = 0;
        double array [][] = new double[squareLength][squareLength];
        for(int i=0;i<squareLength;i++){
            for(int j=0;j<squareLength;j++){
                array[i][j] = Math.sin((i*i - j*j)/(squareLength));
                if(array[i][j]>0)
                    counterOfPositiveValues++;
            }
        }
        for(int i=0;i<squareLength;i++){
            for(int j=0;j<squareLength;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n"+counterOfPositiveValues);
    }
}
