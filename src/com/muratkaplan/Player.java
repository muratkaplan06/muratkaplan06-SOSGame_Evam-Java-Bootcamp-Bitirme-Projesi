package com.muratkaplan;

import java.util.Random;
import java.util.Scanner;

public class Player {
    public static void playerPlay(char ch,int ml,char[][] M){
        boolean checkFinish=Finish.isFinish(M, ml);
        if(checkFinish){

            boolean flag=true;
            while (flag){
                Scanner scanner=new Scanner(System.in);
                System.out.print("enter row:");
                int rowNumber=scanner.nextInt();
                System.out.print("enter column:");
                int columnNumber=scanner.nextInt();
                if(rowNumber<0||rowNumber>ml||columnNumber<0||columnNumber>ml)
                {
                    System.out.println("invalid value, try again(0-"+ml+")");

                }
                else {
                    flag=false;
                    drawGame(ch,rowNumber,columnNumber,ml,M);
                }
            }
        }else{
            Finish.result();
        }

    }
    public static void drawGame(char ch, int r, int c, int mlen,char[][] Matrix){
        //onceden atanmışsa tekrar eçim yaptır
        if(Matrix[r-1][c-1]=='#'){
            //dizilerde 0 dan basladıgı icin -1 yaptım
            Matrix[r-1][c-1]=ch;
        }
        else {
            System.out.println("this coordinate is used");
            playerPlay(ch,mlen,Matrix);
        }

        for(int k=0;k<=mlen;k++){
            if(k==0) {
                System.out.print(" ");
                continue;
            }else
                System.out.print(k);
            System.out.print(" ");
        }
        System.out.println();
        for(int i=0;i<mlen;i++){
            System.out.print(i+1);
            System.out.print(" ");
            for(int j=0;j<mlen;j++){
                System.out.print(Matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        scorePlayer(Matrix,ch,r,c,mlen);
    }
    public static void scorePlayer(char[][] Matrix,char ch,int row,int column,int mLength){

        row=row-1;
        column=column-1;

            if(ch=='S'){
                if(mLength==3) {
                    if (row == 0) {
                        if (column == 0) {
                            if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column + 1] == 'O' && Matrix[row + 2][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        } else if (column == 1) {
                            if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        } else if (column == 2) {
                            if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column - 1] == 'O' && Matrix[row + 2][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        }

                    } else if (row == 1) {
                        if (column == 0) {
                            if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        } else if (column == 2) {
                            if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                                if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                                    System.out.println("Congratulations");
                                    Main.scoreTablePlayer();
                                    Player.playerPlay(changeCh(), mLength, Matrix);
                                }
                            }
                        }

                    } else if (row == 2) {
                        if (column == 0) {
                            if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row - 1][column + 1] == 'O' && Matrix[row - 2][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        } else if (column == 1) {
                            if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        } else if (column == 2) {
                            if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row - 1][column - 1] == 'O' && Matrix[row - 2][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        }
                    }

                }else if(mLength==4) {
                    if (row - 2 < 0 && column - 2 < 0) {
                        if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row + 1][column + 1] == 'O' && Matrix[row + 2][column + 2] == 'S') {
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(), mLength, Matrix);
                        }
                    } else if (row - 2 < 0 && column + 2 > mLength - 1) {
                        if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row + 1][column - 1] == 'O' && Matrix[row + 2][column - 2] == 'S') {
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(), mLength, Matrix);
                        }
                    } else if (row + 2 > mLength - 1 && column - 2 < 0) {
                        if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row - 1][column + 1] == 'O' && Matrix[row - 2][column + 2] == 'S') {
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(), mLength, Matrix);
                        }

                    } else if (row + 2 > mLength - 1 && column + 2 > mLength - 1) {
                        if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row - 1][column - 1] == 'O' && Matrix[row - 2][column - 2] == 'S') {
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(), mLength, Matrix);
                        }

                    }
                }else if(mLength>4){

                        if ((row + 2 <= mLength - 1) && (row - 2 >= 0) && (column + 2 <= mLength - 1) && (column - 2 >= 0)) {
                            if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }else if(Matrix[row+1][column]=='O'&&Matrix[row+2][column]=='S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }else if(Matrix[row-1][column]=='O'&&Matrix[row-2][column]=='S'){
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row - 1][column - 1] == 'O' && Matrix[row - 2][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row - 1][column + 1] == 'O' && Matrix[row - 2][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column - 1] == 'O' && Matrix[row + 2][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column + 1] == 'O' && Matrix[row + 2][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        } else if (row - 2 >= 0 && row + 2 <= mLength - 1 && column - 2 < 0) {
                            if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row - 1][column + 1] == 'O' && Matrix[row - 2][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column + 1] == 'O' && Matrix[row + 2][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        } else if (row - 2 >= 0 && row + 2 <= mLength - 1 && column + 2 > mLength - 1) {
                            if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row - 1][column - 1] == 'O' && Matrix[row - 2][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column - 1] == 'O' && Matrix[row + 2][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        } else if (row - 2 <0 && column - 2 <0) {
                            if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column + 1] == 'O' && Matrix[row + 2][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        } else if (row - 2 <0 && column + 2 >mLength - 1) {
                            if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column - 1] == 'O' && Matrix[row + 2][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column] == 'O' && Matrix[row +2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        } else if (row - 2 < 0  && column + 2 <= mLength - 1) {
                            if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column - 1] == 'O' && Matrix[row + 2][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column] =='O' && Matrix[row + 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row + 1][column + 1] == 'O' && Matrix[row + 2][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        } else if (row + 2 > mLength - 1 && column - 2 < 0) {
                            if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row - 1][column + 1] == 'O' && Matrix[row - 2][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        } else if (row + 2 > mLength - 1 && column + 2 >mLength - 1) {
                            if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row - 1][column - 1] == 'O' && Matrix[row - 2][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        } else if (row + 2 >mLength-1 && column - 2 >= 0 && column + 2 <= mLength - 1) {
                            if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row - 1][column - 1] == 'O' && Matrix[row - 2][column - 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row - 1][column + 1] == 'O' && Matrix[row - 2][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            } else if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                                System.out.println("Congratulations");
                                Main.scoreTablePlayer();
                                Player.playerPlay(changeCh(), mLength, Matrix);
                            }
                        }

                }
            }else if(ch=='O'){
                    if(row==0&&column!=0&&column!=mLength-1){
                        if(Matrix[row][column-1]=='S'&&Matrix[row][column+1]=='S'){
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(),mLength,Matrix);
                        }
                    }else if(column==0&&row!=0&&row!=mLength-1){
                        if(Matrix[row-1][column]=='S'&&Matrix[row+1][column]=='S'){
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(),mLength,Matrix);
                        }
                    }else if(row==mLength-1&&column!=0&&column!=mLength-1){
                        if(Matrix[row][column-1]=='S'&&Matrix[row][column+1]=='S'){
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(),mLength,Matrix);
                        }
                    }else if(column==mLength-1&&row!=0&&row!=mLength-1){
                        if(Matrix[row-1][column]=='S'&&Matrix[row+1][column]=='S'){
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(),mLength,Matrix);
                        }

                    }else if(row!=0&&column!=0&&row!=mLength-1&column!=mLength-1){
                        if(Matrix[row+1][column+1]=='S'&&Matrix[row-1][column-1]=='S'){
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(),mLength,Matrix);
                        }
                        else if(Matrix[row-1][column+1]=='S'&&Matrix[row+1][column-1]=='S'){
                            System.out.println("Congratulations");
                            System.out.println(Main.scoreTablePlayer());
                            Player.playerPlay(changeCh(),mLength,Matrix);
                        }else if(Matrix[row-1][column]=='S'&& Matrix[row+1][column]=='S'){
                            System.out.println("Congratulations");
                            Main.scoreTablePlayer();
                            Player.playerPlay(changeCh(),mLength,Matrix);
                        }else if(Matrix[row][column-1]=='S'&&Matrix[row][column+1]=='S'){
                            System.out.println("Congratulations");
                            System.out.println(Main.scoreTablePlayer());
                            Player.playerPlay(changeCh(),mLength,Matrix);
                        }
                    }
            }
        System.out.println("Player Score:"+Main.scoreBoardPlayer());
        System.out.println("Computer Score:"+Main.scoreBoardComputer());
        System.out.println("________________________");
        Computer.computerPlay(ch,mLength,Matrix);
    }

    public static char changeCh(){
        char ch;
        Random randChar = new Random();
        int randomC=randChar.nextInt(2);
        if(randomC==0){
            System.out.println("Character:"+"S");
            ch='S';
        }
        else{
            System.out.println("Character:"+"O");
            ch='O';
        }
        return ch;
    }
}
