package com.yu.jvm.classloader;

import java.util.Random;

/**
 * @Description:
 * @Author: yuxinxin
 * @Create: 2020/4/22 19:46
 **/
/*
当一个接口初始化时并不要求其父接口都完成了初始化
只有在真正使用到父接口的时候（如引用接口中所定义的常量时），才会初始化
 */
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyChrild5.c);
    }
}

//接口中的成员都是公共、静态、常量
interface MyParent5 {
    public static final int a = 5;
}

interface MyChrild5 extends MyParent5 {
    public static final int b = 6;
    public static final int c = new Random().nextInt(2);
}
