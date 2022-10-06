package com.driver;

public class Main {
  public static void main(String[] args) {
        B n = new B();
        System.out.println(n.meth());
  }
}

class A {
    String meth() {
        return "Invoking method from class A";
    }
}

class B extends A{
    String meth() {
        return "Method is overridden in Extended class B";
    }
}
