package com.us.demo.map;

public class Sample {
    static int i = 5;
    static {//第一个静态代码块
           System.out.println("First Static code i="+i++);
    }
    static {//第二个静态代码块
           System.out.println("Second Static code i="+i++);
    }
    public static void main(String[] args) {
           Sample s1 = new Sample();
           Sample s2 = new Sample();
           System.out.println("At last, i= "+i);
    }
}
// 5 6 7 
//First Static code i=5
//Second Static code i=6
//At last, i= 7