import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        int integerPartOfNumber = (int)number;
        double doublePartOfNumber = (number - integerPartOfNumber) * 1000;
        System.out.println((int) doublePartOfNumber + "." + integerPartOfNumber);
    }
}
