package com.muratkaplan;

import java.util.Scanner;

public class Start {

    public static void startGame(){
        int mxLength=3;
        do{
            System.out.println("matrix of length:");
            Scanner scanner=new Scanner(System.in);
            mxLength=scanner.nextInt();
            if(mxLength<3||mxLength>7){
                System.out.println("try again length must be (3<=l<=7)");
            }
        }while (mxLength<3||mxLength>7);
        System.out.println(drawLogo());
        System.out.println("Welcome to SOS Game");
        Draw.draw(mxLength);
    }
    public static String drawLogo()
    {
        return " /-----\\ \n" +
                " | ^ ^ |  \n" +
                " |  |  |  \n" +
                " |  V  |  \n" +
                " \\-----/  \n";
    }
}
