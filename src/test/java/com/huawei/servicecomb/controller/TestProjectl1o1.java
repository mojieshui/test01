package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProjectl1o1 {

        Projectl1o1Delegate projectl1o1Delegate = new Projectl1o1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = projectl1o1Delegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}