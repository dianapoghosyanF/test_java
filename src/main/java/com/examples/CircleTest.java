package com.examples;

public class CircleTest {

    public static void main(String[] arg) {

        getAreaTest_SUCCESS_1();
        getAreaTest_SUCCESS_2();
        getAreaTest_SUCCESS_3();

        //getLengthTest_();
    }


    public static void getAreaTest_SUCCESS_1() {
        Circle c = new Circle();

        Double radius = 1d;
        double expectedArea = Math.PI * radius * radius;

        double actualArea = c.getArea(radius);

        assertEquals(expectedArea, actualArea);
    }

    public static void getAreaTest_SUCCESS_2() {
        Circle c = new Circle();

        Double radius = 0d;
        double expectedArea = 0;

        double actualArea = c.getArea(radius);

        assertEquals(expectedArea, actualArea);
    }

    public static void getAreaTest_SUCCESS_3() {
        Circle c = new Circle();

        Double radius = null;
        Double expectedArea = 77d;

        Double actualArea = c.getArea(radius);

        assertEquals(expectedArea, actualArea);
    }


    // helper method
    private static void assertEquals(Object expected, Object actual) {
        if ((expected == null && actual != null) || (expected != null && !expected.equals(actual))) {
            String errorMessage = "The expected value is: "+expected+", but actual value is: "+ actual;
            //throw new RuntimeException(errorMessage);
            System.out.println("TEST FAILED:  "+errorMessage);
        } else  {
            System.out.println("TEST PASSED");
        }
    }

    public static void getLengthTest_() {
        // add test
    }
}
