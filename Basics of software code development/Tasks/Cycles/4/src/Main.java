import java.math.BigInteger;

public class Main {
    public static void main(String[] args){
        BigInteger answer = BigInteger.valueOf(1);
        for(int i=1;i<=200;i++) {
            BigInteger helpValue = BigInteger.valueOf(i*i);
            answer = answer.multiply(helpValue);
            System.out.println(i+" iteration: "+answer);
        }
        System.out.println(answer);
    }
}
