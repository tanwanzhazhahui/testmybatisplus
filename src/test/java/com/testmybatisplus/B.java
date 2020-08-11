package com.testmybatisplus;

public class B {
    static A a1;
    B(){
        System.out.println("B()");
        a2.f(1);
    }
    static {
        a1=new A(1);
    }
    void f(int i){
        System.out.println("B.f("+i+")");
    }
    static A a2=new A(2);

    public static void main(String[] args) {
        new B().f(1);
    }
}
