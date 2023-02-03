package IlkTest;

import org.junit.*;

public class IlkTestClass {

    @BeforeClass
    public static void beforeClassSinifi () {
        System.out.println("BeforeClass");
    }
    @AfterClass
    public static void afterClassSinifi () {
        System.out.println("AfterClass");
    }
    @After
    public void junitAfter () {
        System.out.println("After");
    }
    @Test //@Ignore
    public void JunitIlkTestBir () {
        System.out.println("Test 1");
    }

    @Test @Ignore
    public void JunitIlkTestIki () {
        System.out.println("Test 2");
    }
    @Before
    public void JunitBefore() {
        System.out.println("Before");
    }



}
