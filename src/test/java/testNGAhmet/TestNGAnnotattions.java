package testNGAhmet;

import org.testng.annotations.*;

public class TestNGAnnotattions {

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println(" before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println(" after method");
    }
    @Test
    public void test1(){
        System.out.println(" test annottaion-1");
    }

    @Test
    public void test2(){
        System.out.println(" test annotation-2");
    }









}
