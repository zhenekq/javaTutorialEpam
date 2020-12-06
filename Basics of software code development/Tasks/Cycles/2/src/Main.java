import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int step = sc.nextInt();
        int answer=0;
        if(step>0) {
            for (int i = Math.min(a, b); i <= Math.max(a, b); i += step) {
                if (i > 2)
                    answer = i;
                else
                    answer = i * (-1);
            }
        }else {
            for (int i = Math.max(a, b); i >= Math.min(a, b); i += step) {
                if (i > 2)
                    answer = i;
                else
                    answer = i * (-1);
            }
        }
        System.out.println(answer);
    }
}
