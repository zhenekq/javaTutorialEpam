import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int squareLength = sc.nextInt();
        int array[][] = new int[squareLength][squareLength];

        for(int i=0;i<squareLength;i++){
            for(int j=0;j<squareLength;j++){
                array[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<squareLength;i++){
            for(int j=0;j<squareLength;j++){
                if(i==j)
                    System.out.print(array[i][j] +" "); 
            }
        }

    }
}
