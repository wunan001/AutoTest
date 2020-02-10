package com.learn.testng.suite;


import org.testng.annotations.*;

//用来进行所有测试套件的配置
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforetest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("aftertest");
    }
}
