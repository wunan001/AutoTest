package com.learn.testng;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void ignoreTest1(){
        System.out.println("ignore 1");
    }

    @Test(enabled = false)
    public void ignoreTest2(){
        System.out.println("ignore 2");
    }

    @Test(enabled = true)
    public void ignoreTest3(){
        System.out.println("ignore 3");
    }
}
