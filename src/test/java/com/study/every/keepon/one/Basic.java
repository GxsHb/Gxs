package com.study.every.keepon.one;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Basic {
    @BeforeSuite
    public void test01(){
           System.out.println("BrforeSuite执行了");
    }
    @Test
    public void test02() {
           System.out.println("Test执行了");
    }
}