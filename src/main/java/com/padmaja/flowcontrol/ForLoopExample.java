package com.padmaja.flowcontrol;
import java.lang.String;

public class ForLoopExample {
    public static String  tablesExample(String line) {
        for(int i=0; i < line.length() ; ++i,printmethod()){
            System.out.println(line.charAt(i));
        }
        return line;
    }

    private static void printmethod(){
        System.out.println("Hello Padmaja");
    }
}