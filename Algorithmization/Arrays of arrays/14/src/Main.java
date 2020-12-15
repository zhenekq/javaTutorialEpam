import java.util.Random;

public class Main {
    public static void main(String[] args){
        final int M = 5;
        final int N = 5;
        int array[][] = new int[N][M];
        Random random = new Random();
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                array[i][j] = 0;
            }
        }

        for(int i=0;i<N;i++){
            int counter = 0;
            for(int j=0;j<=M*M;j++){
                if(array[random.nextInt(N-1)][i] == 0){
                    array[random.nextInt(N)][i] = 1;
                    counter++;
                }
                if(counter == i+1)
                    break;
            }
        }
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
