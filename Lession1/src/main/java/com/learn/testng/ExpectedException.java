package com.learn.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    @Test(expectedExceptions = RuntimeException.class)
    public void expectedException() {
        System.out.println("方法不抛异常");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void expectedExceptionTrue() {
        System.out.println("方法抛异常");
        throw new RuntimeException();
    }
}
