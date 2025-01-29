package test.java;

public class AppTest{
    @testpublic void testApp() {
        Application myApp = new Application();
        String result = myApp.getStatus();
        assertEquals("OK", result);
    }
}