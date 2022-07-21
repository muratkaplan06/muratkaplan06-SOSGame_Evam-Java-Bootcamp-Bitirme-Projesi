package com.muratkaplan;

public class Finish {
    public static boolean isFinish(char[][] Matrix,int Mlen){
        int flag=0;
        for(int i=0;i<Mlen;i++){
            for(int j=0;j<Mlen;j++){
                if(Matrix[i][j]=='#'){
                    flag++;
                }
            }
        }
        if(flag==0){
            return false;
        }else{
            return true;
        }
    }
    public static void result() {
        System.out.println("the end");
        int PlayerScore=Main.scoreBoardPlayer();
        int ComputerScore=Main.scoreBoardComputer();
        if(PlayerScore>ComputerScore){
            System.out.println( "  O   O  OOOO  O  O    O         O   OOOO  O   O   U \n" +
                                "   O O   O  O  O  O    O    O    O   O  O  OO  O   U \n" +
                                "    O    O  O  O  O     O   O   O    O  O  O O O   U \n" +
                                "    O    O  O  O  O      O O O O     O  O  O  OO     \n" +
                                "    O    OOOO  OOOO       O   O      OOOO  O   O   * \n" );
        }else {
            System.out.println( "  O   O  OOOO  O  O    O    OOOO  OOO  OOO   U \n" +
                                "   O O   O  O  O  O    O    O  O  O     O    U \n" +
                                "    O    O  O  O  O    O    O  O  OOO   O    U \n" +
                                "    O    O  O  O  O    O    O  O    O   O      \n" +
                                "    O    OOOO  OOOO    OOO  OOOO  OOO   O    * \n" );
        }
        System.out.println("Player Score:"+PlayerScore);
        System.out.println("Computer Score: "+ComputerScore);
        System.exit(0);

    }
}
