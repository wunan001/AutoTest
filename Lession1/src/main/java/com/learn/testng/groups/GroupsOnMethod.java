package com.learn.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;


//方法分组测试
public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("server端方法1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("server端方法2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("client端方法1");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("client端方法2");
    }

    @BeforeGroups("server")
    public void groupsBeforeServer(){
        System.out.println("=======开始执行服务端=======");
    }

    @AfterGroups("server")
    public void groupsAfterServer(){
        System.out.println("=======执行服务端结束=======");
    }

    @BeforeGroups("client")
    public void groupsBeforeClient(){
        System.out.println("=======开始执行客户端=======");
    }

    @AfterGroups("client")
    public void groupsAfterClient(){
        System.out.println("=======执行客户端结束=======");
    }
}
