package com.muratkaplan;

import java.util.Random;

public class Turn {
    public static void turn(int ml,char[][] M){
        char charChosen;
        Random rand = new Random();
        int n = rand.nextInt(2);
        Random randChar = new Random();
        int c=randChar.nextInt(2);
        if(c==0){
            System.out.println("Character:"+"S");
            charChosen='S';
        }
        else{
            System.out.println("Character:"+"O");
            charChosen='O';
        }

        if(n==0){
            System.out.println("player start game");
            Player.playerPlay(charChosen,ml,M);
        }
        else{
            System.out.println("Computer start game");
            Computer.computerPlay(charChosen,ml,M);
        }

    }
}
