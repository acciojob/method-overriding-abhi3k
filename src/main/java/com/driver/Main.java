package com.driver;

public class Main {
  public static void main(String[] args) {
        A obj1 = new A();
        B obj = new B();
        obj1.meth();
        obj.meth();

  }

    public static class A {
        public static void meth() {
            System.out.println("Invoking method from class A");
        }
    }

    public static class B extends A{


        public static void meth() {
            System.out.println("Method is overridden in Extended class B");
        }
    }

}




