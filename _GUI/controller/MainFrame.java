package _GUI.controller;

import _GUI.view.OrderInfoView;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public static final int FRANE_WIDTH = 700;
    public static final int FRANE_HIGHT = 500;

//    public static final int FRANE_X = 300;
//    public static final int FRANE_Y = 300;


    public MainFrame() {
        super("검색프로그램");
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();

        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
//        System.out.printf("screenWidth:"+screenWidth/2);
//        System.out.printf("screenHeight:"+screenHeight/2);
//        setLocation((screenWidth/2)-(FRANE_WIDTH/2), (screenHeight/2)-(FRANE_HIGHT/2));



        OrderInfoView orderInfoView = new OrderInfoView();
        add(orderInfoView, "Center");
        setLocation((screenWidth-FRANE_WIDTH)/2, (screenHeight-FRANE_HIGHT)/2);
        setSize(FRANE_WIDTH, FRANE_HIGHT);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new MainFrame();

    }
}
