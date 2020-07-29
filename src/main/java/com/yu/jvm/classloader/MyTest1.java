package com.yu.jvm.classloader;

/**
 * @Description:
 * @Author: yuxinxin
 * @Create: 2020/4/21 9:04
 **/
/*
对于静态字段来说，只有直接定义了该字段的类才会被初始化
当一个类在初始化时，要求其父类全部都已经初始化
-XX:+TraceClassLoading:用于追踪类的加载信息并加载打印出来

jvm参数都是以 -XX: 开始的
-XX:+<option> 表示开启option参数
-XX:-<option> 表示关闭option参数
-XX:<option>=<value> 表示将option选项的值为value

 */
public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(MyChild1.str);
    }
}

class MyParent1 {
    public static String str = "hello word";
    static {
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends MyParent1 {
    public static String str2 = "welcome";

    static {
        System.out.println("MyChild1 static block");
    }
}