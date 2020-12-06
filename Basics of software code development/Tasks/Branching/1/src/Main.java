import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int firstGrade = sc.nextInt();
        int secondGrade = sc.nextInt();
        int thirdGrade = 180 - secondGrade - firstGrade;
        int sumOfGrades = firstGrade + secondGrade + thirdGrade;
        if(sumOfGrades == 180 && thirdGrade > 0 && thirdGrade < 180) {
            System.out.println("Triangle exists");
            if(firstGrade==90 || secondGrade == 90 || thirdGrade == 90) {
                System.out.println("This is also rectangular triangle");
            }else {
                System.out.println("This isn`t rectangular triangle");
            }
        }else {
            System.out.println("Triangle do not exists");
        }
    }
}
