import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int lengthOfHole = Math.max(A,B);
        int widthOfHole = Math.min(A,B);

        int lengthOfBrick = Math.max(x,y);
        int widthOfBrick = Math.min(x,y);

        if(lengthOfBrick <= lengthOfHole && widthOfBrick <= widthOfHole && z<=widthOfHole && z<=lengthOfHole)
            System.out.println("Crawl through");
        else
            System.out.println("Will not crawl through");
    }
}
