import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        int answer = 0;
        for(int i=0;i<=userNumber;i++){
            answer+=i;
        }
        System.out.println(answer);
    }
}
