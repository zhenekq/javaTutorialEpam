import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        boolean isInField = true;

        if((x >= -2 && x <=2 && y>=0 && y<=4 ) || (x>=-4 && x<=4 && y<=0 && y>=-3 && y!=-1 && x!=0))
            isInField = true;
        else
            isInField = false;
        System.out.println(isInField);
    }
}
