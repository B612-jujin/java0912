package jdbc3.controller;

import jdbc3.entity.Product;
import jdbc3.repository.ProductRepository;
import jdbc3.service.ProductService;
import jdbc3.service.ProductServiceImpl;
import jdbc3.view.MenuView;
import jdbc3.view.ProductView;

import java.util.ArrayList;
import java.util.Scanner;


public class MainController {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        ProductService productService = new ProductServiceImpl();
        int menu = MenuView.printMenu(sc1); //메뉴번호를 반환받음
        switch (menu) {
            case 1:
                productService.search(sc1,sc2);
                break;

            case 2:


                break;

            case 3:


                break;
        }




        sc1.close();
        sc2.close();

    }


}
