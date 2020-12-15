import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Scanner sc = new Scanner(System.in);

        final int N = 5;
        final int M = 5;

        int array[][] = new int[N][M];
        Random random = new Random();

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                array[i][j] = random.nextInt(15);
            }
        }
        System.out.println("Current array: ");
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("");
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                for(int z=0;z<N-1;z++){
                    if(array[z][i] < array[z+1][i]){
                        int helpVar = array[z][i];
                        array[z][i] = array[z+1][i];
                        array[z+1][i] = helpVar;
                    }
                }
            }
        }
        System.out.println();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }


    }
}
