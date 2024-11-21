package chp12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainException12_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        double result = 0;
        try {
            System.out.println("나누는 수를 입력하세요: ");
            num1 = sc.nextInt();
            result = 30 / num1;
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력해주세요");
        } catch (ArithmeticException e) {
            System.out.println("정수는 정수 0으로 나눌 수 없습니다.");
        }
        System.out.printf("%d를 %d로 나눈 수의 결과는 %.2f", 30, num1, result);

        System.out.println("프로그램을 종료합니다.");

        sc.close();

    }
}
