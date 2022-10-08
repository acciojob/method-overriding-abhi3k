package com.driver;

public class Main {
  public static void main(String[] args) {
        B obj = new B();
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




