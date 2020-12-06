import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        if((x1 == x2 && x2==x3) || (y1==y2 && y2==y3))
            System.out.println("On the same lane");
        else
            System.out.println("Not on the same lane");
    }
}
