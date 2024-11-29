package jdbc3.view;

import java.util.Scanner;

public class MenuView {
    public static int printMenu(Scanner sc1) {

        System.out.println("=============== 제품 ================");
        System.out.println("= Menu(1. 검색, 2. 수정, 3. 삭제)     ");
        System.out.println("====================================");
        System.out.println("* Menu 입력:");
//에러처리 필요
        int menu = sc1.nextInt();
        return menu;

    }
}
