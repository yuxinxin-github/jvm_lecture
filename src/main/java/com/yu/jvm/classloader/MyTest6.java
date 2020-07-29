package com.yu.jvm.classloader;

/**
 * @Description:
 * @Author: yuxinxin
 * @Create: 2020/4/22 20:06
 **/
public class MyTest6 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("counter1:" + Singleton.counter1);
        System.out.println("counter2:" + Singleton.counter2);
    }
}

class Singleton {
    public static int counter1 = 1;
    //    public static int counter2 = 0;
    private static Singleton singleton = new Singleton();

    private Singleton() {
        counter1++; //准备阶段的重要意义
        counter2++;
        System.out.println(counter1);
        System.out.println(counter2);
    }

    public static int counter2 = 0;

    public static Singleton getInstance() {
        return singleton;
    }
}
