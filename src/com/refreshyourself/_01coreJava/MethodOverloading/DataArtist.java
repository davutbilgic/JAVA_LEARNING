package com.refreshyourself._01coreJava.MethodOverloading;

public class DataArtist {

    public static void draw(String s){

    }

    public static String draw(int i){

        return "";
    }

    public static Float draw(double f){
        return 0.0f;
    }

    public static int draw(int i, double f){

        return 0;
    }

}
