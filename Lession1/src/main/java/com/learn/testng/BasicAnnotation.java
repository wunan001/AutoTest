package com.learn.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的testng的注解,用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("TEST这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("TEST这是测试用例2");
    }

    @BeforeMethod
    public void beforeMedthod(){
        System.out.println("BeforeMethod这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是在类运行之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是在类运行之后运行的");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite");
    }
}
