package com.padmaja.flowcontrol;

import org.junit.Test;
import java.lang.String;

import static org.junit.Assert.*;


public class ForLoopExampleTest {
    ForLoopExample forLoopExample = new ForLoopExample();
    @Test
    public void ForLoopExample1() {

        String result = forLoopExample.tablesExample("a");
        System.out.println(result);
        String expectedresult = "a";
        assertEquals(expectedresult,result);
    }


    @Test
    public void ForLoopExample2() {
        ForLoopExample forLoopExample = new ForLoopExample();
        String result = forLoopExample.tablesExample("ab");
        System.out.println(result);
        String expectedresult = "ab";
        assertEquals(expectedresult,result);
    }


    @Test
    public void ForLoopExample3() {
        ForLoopExample forLoopExample = new ForLoopExample();
        String result = forLoopExample.tablesExample("");
        System.out.println(result);
        String expectedresult = "";
        assertEquals(expectedresult,result);
    }

    @Test
    public void ForLoopExample4() {
        ForLoopExample forLoopExample = new ForLoopExample();
        String result = forLoopExample.tablesExample("abcdefghijklmnopqrstuvwxyz");
        System.out.println(result);
        String expectedresult = "abcdefghijklmnopqrstuvwxyz";
        assertEquals(expectedresult,result);
    }

    @Test
    public void ForLoopExample5() {
        String result = forLoopExample.tablesExample("welcome to java programming");
        System.out.println(result);
        String expectedresult = "welcome to java programming";
        assertEquals(expectedresult,result);
    }


}