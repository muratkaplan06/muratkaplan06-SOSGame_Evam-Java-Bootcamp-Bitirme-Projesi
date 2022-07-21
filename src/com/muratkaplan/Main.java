package com.muratkaplan;

import java.util.ArrayList;


public class Main {
    public static  ArrayList<Integer> arrPlayer=new ArrayList<>();
    public static  ArrayList<Integer> arrComputer=new ArrayList<>();
    public static void main(String[] args) {

	Start.startGame();
    }
    public static int scoreTablePlayer(){
        arrPlayer.add(0,0);
        arrPlayer.add(arrPlayer.lastIndexOf(arrPlayer.get(arrPlayer.size()-1))+1,arrPlayer.get(arrPlayer.size()-1)+1);
        //System.out.println("Player Score:"+arrPlayer.get(arrPlayer.size()-1));
        return arrPlayer.get(arrPlayer.size()-1)-1;
    }
    public static int scoreTableComputer(){
        arrComputer.add(0,0);
        arrComputer.add(arrComputer.lastIndexOf(arrComputer.get(arrComputer.size()-1))+1,arrComputer.get(arrComputer.size()-1)+1);
        //System.out.println("Computer Score:"+arrComputer.get(arrComputer.size()-1));
        return arrComputer.get(arrComputer.size()-1)-1;
    }
    public static int scoreBoardPlayer(){
        arrPlayer.add(0,0);
        int n=arrPlayer.get(arrPlayer.size()-1);
        return n;
    }
    public static int scoreBoardComputer(){
        arrComputer.add(0,0);
        int n=arrComputer.get(arrComputer.size()-1);
        return n;
    }

}
