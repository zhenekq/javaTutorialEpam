import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double answer;
        if(x <= 3)
            answer = x*x-3*x+9;
        else
            answer = 1/(x*x*x+6);
        System.out.println(answer);
    }
}
