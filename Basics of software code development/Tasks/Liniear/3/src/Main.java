import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double answer = ((Math.sin(x) + Math.cos(y))/(Math.cos(x) - Math.sin(y))) * Math.tan(x*y);
        System.out.println(answer);
    }
}
