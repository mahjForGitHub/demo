package main.java;


public class demo {
    @SuppressWarnings("Deprecated")
    public static void main(String[] args) {
        TestAnnotation ta = new TestAnnotation();
        System.out.println(ta.getStr());
    }
}
