import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int maxOfNumbers = Math.max(Math.min(a,b),Math.min(c,d));
        System.out.println(maxOfNumbers);
    }
}
