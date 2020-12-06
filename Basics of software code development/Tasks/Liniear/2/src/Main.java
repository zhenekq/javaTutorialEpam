import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double answer = ((b + Math.sqrt(b*b+4*a*c))/(2*a)-Math.pow(a,3)*c + (1/b*b));
        System.out.println(answer);
    }
}
