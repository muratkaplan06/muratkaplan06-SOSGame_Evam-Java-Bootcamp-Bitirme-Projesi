package com.muratkaplan;

import java.util.Random;

public class Computer {
    public static void computerPlay(char ch, int ml, char[][] M) {
        boolean checkFinish=Finish.isFinish(M, ml);
        //boşluk bitene kadar oyun devam eder
        if (checkFinish) {

            Random rand1 = new Random();
            int n = rand1.nextInt(ml);

            Random rand2 = new Random();
            int c = rand2.nextInt(ml);
            drawGame(ch, n, c, ml, M);
        }else{
            Finish.result();
        }

    }

    static void drawGame(char ch, int r, int c, int mlen, char[][] Matrix) {

        if (Matrix[r][c] == '#') {
            Matrix[r][c] = ch;
        } else {
            computerPlay(ch, mlen, Matrix);
        }
        for (int k = 0; k <= mlen; k++) {
            if (k == 0) {
                System.out.print(" ");
                continue;
            } else
                System.out.print(k);
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < mlen; i++) {
            System.out.print(i + 1);
            System.out.print(" ");
            for (int j = 0; j < mlen; j++) {
                System.out.print(Matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        scoreComputer(Matrix, ch, r, c, mlen);


    }

    public static void scoreComputer(char[][] Matrix, char ch, int row, int column, int mLength) {
        if(ch=='S'){
            if(mLength==3) {
                if (row == 0) {
                    if (column == 0) {
                        if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row + 1][column + 1] == 'O' && Matrix[row + 2][column + 2] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        }
                    } else if (column == 1) {
                        if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        }
                    } else if (column == 2) {
                        if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row + 1][column - 1] == 'O' && Matrix[row + 2][column - 2] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        }
                    }

                } else if (row == 1) {
                    if (column == 0) {
                        if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        }
                    } else if (column == 2) {
                        if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                            if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                                Main.scoreTableComputer();
                                Computer.computerPlay(changeCh(), mLength, Matrix);
                            }
                        }
                    }

                } else if (row == 2) {
                    if (column == 0) {
                        if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row - 1][column + 1] == 'O' && Matrix[row - 2][column + 2] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        }
                    } else if (column == 1) {
                        if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        }
                    } else if (column == 2) {
                        if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        } else if (Matrix[row - 1][column - 1] == 'O' && Matrix[row - 2][column - 2] == 'S') {
                            Main.scoreTableComputer();
                            Computer.computerPlay(changeCh(), mLength, Matrix);
                        }
                    }
                }
            }else if(mLength==4) {
                if (row - 2 < 0 && column - 2 < 0) {
                    if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column + 1] == 'O' && Matrix[row + 2][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }
                } else if (row - 2 < 0 && column + 2 > mLength - 1) {
                    if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column - 1] == 'O' && Matrix[row + 2][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }
                } else if (row + 2 > mLength - 1 && column - 2 < 0) {
                    if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row - 1][column + 1] == 'O' && Matrix[row - 2][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }

                } else if ((row + 2 > mLength - 1) && (column + 2 > mLength - 1)) {
                    if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row - 1][column - 1] == 'O' && Matrix[row - 2][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }

                }
            }else if(mLength>4){

                if ((row + 2 <= mLength - 1) && (row - 2 >= 0) && (column + 2 <= mLength - 1) && (column - 2 >= 0)) {
                    if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }else if(Matrix[row+1][column]=='O'&&Matrix[row+2][column]=='S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }else if(Matrix[row-1][column]=='O'&&Matrix[row-2][column]=='S'){
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row - 1][column - 1] == 'O' && Matrix[row - 2][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row - 1][column + 1] == 'O' && Matrix[row - 2][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column - 1] == 'O' && Matrix[row + 2][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column + 1] == 'O' && Matrix[row + 2][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }
                } else if (row - 2 >= 0 && row + 2 <= mLength - 1 && column - 2 < 0) {
                    if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row - 1][column + 1] == 'O' && Matrix[row - 2][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column + 1] == 'O' && Matrix[row + 2][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }
                } else if (row - 2 >= 0 && row + 2 <= mLength - 1 && column + 2 > mLength - 1) {
                    if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row - 1][column - 1] == 'O' && Matrix[row - 2][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column - 1] == 'O' && Matrix[row + 2][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }
                } else if (row - 2 <0 && column - 2 <0) {
                    if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column + 1] == 'O' && Matrix[row + 2][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column] == 'O' && Matrix[row + 2][column] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }
                } else if (row - 2 <0 && column + 2 >mLength - 1) {
                    if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column - 1] == 'O' && Matrix[row + 2][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column] == 'O' && Matrix[row +2][column] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }
                } else if (row - 2 < 0  && column + 2 <= mLength - 1) {
                    if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column - 1] == 'O' && Matrix[row + 2][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column] =='O' && Matrix[row + 2][column] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row + 1][column + 1] == 'O' && Matrix[row + 2][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }
                } else if (row + 2 > mLength - 1 && column - 2 < 0) {
                    if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row - 1][column + 1] == 'O' && Matrix[row - 2][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }
                } else if (row + 2 > mLength - 1 && column + 2 >mLength - 1) {
                    if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row - 1][column - 1] == 'O' && Matrix[row - 2][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }
                } else if (row + 2 >mLength-1 && column - 2 >= 0 && column + 2 <= mLength - 1) {
                    if (Matrix[row][column - 1] == 'O' && Matrix[row][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row - 1][column - 1] == 'O' && Matrix[row - 2][column - 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row - 1][column] == 'O' && Matrix[row - 2][column] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row - 1][column + 1] == 'O' && Matrix[row - 2][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    } else if (Matrix[row][column + 1] == 'O' && Matrix[row][column + 2] == 'S') {
                        Main.scoreTableComputer();
                        Computer.computerPlay(changeCh(), mLength, Matrix);
                    }
                }

            }
        }else if(ch=='O'){
            if(row==0&&column!=0&&column!=mLength-1){
                if(Matrix[row][column-1]=='S'&&Matrix[row][column+1]=='S'){
                    Main.scoreTableComputer();
                    Computer.computerPlay(changeCh(), mLength, Matrix);
                }
            }else if(column==0&&row!=0&&row!=mLength-1){
                if(Matrix[row-1][column]=='S'&&Matrix[row+1][column]=='S'){
                    Main.scoreTableComputer();
                    Computer.computerPlay(changeCh(), mLength, Matrix);
                }
            }else if(row==mLength-1&&column!=0&&column!=mLength-1){
                if(Matrix[row][column-1]=='S'&&Matrix[row][column+1]=='S'){
                    Main.scoreTableComputer();
                    Computer.computerPlay(changeCh(), mLength, Matrix);
                }
            }else if(column==mLength-1&&row!=0&&row!=mLength-1){
                if(Matrix[row-1][column]=='S'&&Matrix[row+1][column]=='S'){
                    Main.scoreTableComputer();
                    Computer.computerPlay(changeCh(), mLength, Matrix);
                }

            }else if(row!=0&&column!=0&&row!=mLength-1&column!=mLength-1){
                if(Matrix[row+1][column+1]=='S'&&Matrix[row-1][column-1]=='S'){
                    Main.scoreTableComputer();
                    Computer.computerPlay(changeCh(), mLength, Matrix);
                }
                else if(Matrix[row-1][column+1]=='S'&&Matrix[row+1][column-1]=='S'){
                    Main.scoreTableComputer();
                    Computer.computerPlay(changeCh(), mLength, Matrix);
                }else if(Matrix[row-1][column]=='S'&& Matrix[row+1][column]=='S'){
                    Main.scoreTableComputer();
                    Computer.computerPlay(changeCh(), mLength, Matrix);
                }else if(Matrix[row][column-1]=='S'&&Matrix[row][column+1]=='S'){
                    Main.scoreTableComputer();
                    Computer.computerPlay(changeCh(), mLength, Matrix);
                }
            }
        }

        System.out.println("Player Score:"+Main.scoreBoardPlayer());
        System.out.println("Computer Score:"+Main.scoreBoardComputer());
        System.out.println("________________________");
        ch=changeCh();
        Player.playerPlay(ch, mLength, Matrix);

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
