package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTest {


    @BeforeClass //run before each test or @BeforeMethod or @BeforeTest
    public void setup() {
        System.out.println("Before Test");
    }


    @Test(description = "name of scenario")
    public void helloWorld() { //all runnable be public void
        System.out.println("TestNG Hello World! 0");
    }

    @Test
    public void helloWorld1() { //all runnable be public void
        System.out.println("TestNG Hello World! 1");
    }

    @Test
    public void helloWorld2() { //all runnable be public void
        System.out.println("TestNG Hello World! 2");
    }

    @Test
    public void helloWorld3() { //all runnable be public void
        System.out.println("TestNG Hello World! 3");
    }

    @AfterClass
    public void teardown() {
        System.out.println("After test");
    }
}
