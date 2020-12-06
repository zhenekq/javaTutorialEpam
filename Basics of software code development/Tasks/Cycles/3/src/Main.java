import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int answer = 0;
        for(int i=1;i<=100;i++){
            answer+=i*i;
            System.out.println(i+" iteration: "+answer);
        }
        System.out.println(answer);
    }
}
