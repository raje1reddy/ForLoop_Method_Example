package com.padmaja.flowcontrol;

import org.junit.Test;
import java.lang.String;

import static org.junit.Assert.*;


public class ForLoopExampleTest {

    @Test
    public void ForLoopExample1() {
        ForLoopExample forLoopExample = new ForLoopExample();
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
        ForLoopExample forLoopExample = new ForLoopExample();
        String result = forLoopExample.tablesExample("welcome to java programming");
        System.out.println(result);
        String expectedresult = "welcome to java programming";
        assertEquals(expectedresult,result);
    }


    /*@Test
    public void testGetRankBaseOfScore250() {
        ForLoopExample forLoopExample = new ForLoopExample();
        int result = forLoopExample.getRankBaseOfScore(250);
        System.out.println(result);
        int expectedresult = 2;
        assertEquals(expectedresult,result);
    }
    @Test
    public void testGetRankBaseOfScore350() {
        ForLoopExample forLoopExample = new ForLoopExample();
        int result = forLoopExample.getRankBaseOfScore(350);
        System.out.println(result);
        int expectedresult = 1;
        assertEquals(expectedresult,result);
    }

    @Test
    public void testGetRankBaseOfScore450() {
        ForLoopExample forLoopExample = new ForLoopExample();
        int result = forLoopExample.getRankBaseOfScore(450);
        System.out.println(result);
        int expectedresult = 3;
        assertEquals(expectedresult,result);
    }

    @Test
    public void testGetDiscount1() {
        ForLoopExample forLoopExample = new ForLoopExample();
        int result = forLoopExample.getDiscount(5000,60);
        System.out.println(result);
        int expectedresult = 10;
        assertEquals(expectedresult,result);
    }
    @Test
    public void testGetDiscount2() {
        ForLoopExample forLoopExample = new ForLoopExample();
        int result = forLoopExample.getDiscount(5000,3);
        System.out.println(result);
        int expectedresult = 9;
        assertEquals(expectedresult,result);
    }
    @Test
    public void testGetDiscount3() {
        ForLoopExample forLoopExample = new ForLoopExample();
        int result = forLoopExample.getDiscount(10,15);
        System.out.println(result);
        int expectedresult = 5;
        assertEquals(expectedresult,result);
    }
*/
   /* @Test
    public void tablesExample() {
        ForLoopExample forLoopExample = new ForLoopExample();
        int result = forLoopExample.tablesExample(25);
        System.out.println(result);
        int expectedresult = 25;
        assertEquals(expectedresult,result);
    }


    @Test
    public void tablesExamples() {
        ForLoopExample forLoopExample = new ForLoopExample();
        int result = forLoopExample.tablesExample(5);
        System.out.println(result);
        int expectedresult = 5;
        assertEquals(expectedresult,result);
    }

    @Test
    public void tablesExamples1() {
        ForLoopExample forLoopExample = new ForLoopExample();
        int result = forLoopExample.tablesExample(50000);
        System.out.println(result);
        int expectedresult = 50000;
        assertEquals(expectedresult,result);
    }



    @Test
    public void forLoopExample2() {
        ForLoopExample forLoopExample = new ForLoopExample();
        int result = forLoopExample.forLoopExample2(27);
        System.out.println(result);
        int expectedresult = 24;
        assertEquals(expectedresult,result);
    }
    @Test
    public void forLoopExample3() {
        ForLoopExample forLoopExample = new ForLoopExample();
        int result = forLoopExample.forLoopExample2(127);
        System.out.println(result);
        int expectedresult = 124;
        assertEquals(expectedresult,result);
    }


    @Test
    public void forLoopExample4() {
        ForLoopExample forLoopExample = new ForLoopExample();
        int result = forLoopExample.forLoopExample2(9);
        System.out.println(result);
        int expectedresult = 6;
        assertEquals(expectedresult,result);
    }


    @Test
    public void forLoopExample5() {
        ForLoopExample forLoopExample = new ForLoopExample();
        int result = forLoopExample.forLoopExample2(90);
        System.out.println(result);
        int expectedresult = 87;
        assertEquals(expectedresult,result);
    }






*/
}