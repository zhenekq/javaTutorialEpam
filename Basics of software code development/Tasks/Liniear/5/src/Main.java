import java.sql.Time;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int TimeInSeconds = sc.nextInt();
        int hour = TimeInSeconds / 3600;
        int min = (TimeInSeconds - hour * 3600) / 60;
        int sec = (TimeInSeconds - hour * 3600) - min * 60;
        System.out.println(hour + "ч " + min + "мин " + sec +"c");
    }
}
