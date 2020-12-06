import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double e = sc.nextDouble();
        double sumOfHighNumbers = 0;
        for(int i=0;i<=n;i++){
            double memberOfArray = (1/Math.pow(2,i)) + (1/Math.pow(3,i));
            if(memberOfArray>=e)
                sumOfHighNumbers+=memberOfArray;
            System.out.println("Current member: "+memberOfArray+", Current sum is: "+sumOfHighNumbers);
        }
    }
}
