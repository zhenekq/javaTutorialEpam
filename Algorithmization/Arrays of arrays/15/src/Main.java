import java.util.Random;

public class Main {
    public static void main(String[] args){
        final int N = 5;
        final int M = 5;
        Random random = new Random();
        int array[][] = new int[N][M];

        int maxValueOfArray = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                array[i][j] = random.nextInt(15);
                if(array[i][j]>maxValueOfArray)
                    maxValueOfArray = array[i][j];
            }
        }
        System.out.println("Starter array: ");
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nMax value of this array: "+maxValueOfArray+"\n");
        System.out.println("Edited array: ");
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(array[i][j]%2!=0)
                    array[i][j]=maxValueOfArray;
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
