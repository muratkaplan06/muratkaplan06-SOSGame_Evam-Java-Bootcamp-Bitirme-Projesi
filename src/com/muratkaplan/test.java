package com.muratkaplan;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(0,1);
        arr.add(1,2);
        arr.add(arr.lastIndexOf(arr.get(arr.size()-1))+1,2);
        System.out.println(arr.get(arr.size()-1));
    }



}
