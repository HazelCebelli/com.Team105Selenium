package testNGAhmet;

import org.testng.annotations.Test;

public class TestNGintro {

    @Test (priority = 2)
    // it is called annotation and it is acting like a main method
    public void test1(){
        System.out.println("test1");
    }

    @Test (priority = 1)
    public void test2(){
        System.out.println("test2");
    }

    @Test (invocationCount = 5)
    public void test3(){
        System.out.println("test3");
    }
}
