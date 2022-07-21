package com.muratkaplan;

public class Draw {

    public static void draw(int mxLength){
        char Mx[][]=new char[mxLength][mxLength];

        for(int i=0;i<mxLength;i++){
            for(int j=0;j<mxLength;j++){
                Mx[i][j]='#';
            }
        }
        System.out.println("________________________");
        for(int k=0;k<=Mx.length;k++){
            if(k==0) {
                System.out.print(" ");
                continue;
            }else
                System.out.print(k);
            System.out.print(" ");
        }

        System.out.println();
        for(int i=0;i<mxLength;i++){
            System.out.print(i+1);
            System.out.print(" ");
            for(int j=0;j<mxLength;j++){
                System.out.print(Mx[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("________________________");
       Turn.turn(mxLength,Mx);
    }


}
