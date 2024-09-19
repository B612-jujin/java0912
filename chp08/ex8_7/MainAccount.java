package chp08.ex8_7;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.printf("* 계좌번호를 입력하세요(5자리):");
        String accountNumber = sc1.nextLine();
        System.out.printf("* 이름을 입력하세요:");
        String name = sc1.nextLine();
        System.out.printf("비밀번호를 입력하세요(4자리):");
        String pwd = sc1.nextLine();

        System.out.printf("입금액을 입력하세요:");
        int balanace = sc2.nextInt();

        Account account = new Account(accountNumber,name,pwd,balanace);
        System.out.printf(account.toString());


        //입금

        int deposit = sc2.nextInt();
        account.deposit(deposit);
        System.out.printf("계좌:%d\n",account.getBalance());
        //출금
        int withdraw = sc2.nextInt();
        account.withdraw(withdraw);
        System.out.printf("계좌:%d\n",account.getBalance());


        System.out.printf("%s님의 통장 잔액은 %d원입니다.\n",account.getName(),account.getBalance());

        sc1.close();
        sc2.close();
    }
}
