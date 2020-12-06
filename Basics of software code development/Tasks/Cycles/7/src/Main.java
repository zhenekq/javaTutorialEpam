import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        for(int i=Math.min(m,n);i<=Math.max(m,n);i++){
            boolean isDividersExists = false;
            System.out.print("Dividers of "+i+": ");
            for(int j=2;j<=Math.max(m,n);j++){
                if(i%j==0 && i!=j) {
                    System.out.print(j + " ");
                    isDividersExists = true;
                }
            }
            if(!isDividersExists){
                System.out.print("Dividers do not exists");
            }
            System.out.println();
        }
    }
}
