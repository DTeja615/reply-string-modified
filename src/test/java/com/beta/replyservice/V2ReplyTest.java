package com.beta.replyservice;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;

public class V2ReplyTest {

    @Test
    public void testV2Reply11() throws NoSuchMethodException {
        try {
            new V2Reply("11-abc");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testV2Reply12() throws NoSuchMethodException {
        try {
            new V2Reply("12-abc");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testV2Reply2() throws NoSuchMethodException {
        try {
            new V2Reply("2-kbzw9ru");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    //12-kbzw9ru
    @Test
    public void testV2Replyeg1() throws NoSuchMethodException {
        try {
            new V2Reply("11-kbzw9ru");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    //12-kbzw9ru
    @Test
    public void testV2Replyeg2() throws NoSuchMethodException {
        try {
            new V2Reply("12-kbzw9ru");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    //22-kbzw9ru
    @Test
    public void testV2Replyeg3() throws NoSuchMethodException {
        try {
            new V2Reply("22-kbzw9ru");
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
