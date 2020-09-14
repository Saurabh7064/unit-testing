package com.in28minutes.unittesting.unittesting.business;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBusinessTest {

    @Test
    public void calculateSum_basic(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        int actualResult = someBusiness.calculateSum(new int[]{1,2});
        int expectedResult = 3;
        assertEquals(expectedResult, actualResult);
     }

    @Test
    public void calculateSum_empty(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        int actualResult = someBusiness.calculateSum(new int[]{});
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSum_oneValue(){
        SomeBusinessImpl someBusiness = new SomeBusinessImpl();
        int actualResult = someBusiness.calculateSum(new int[]{5});
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }


}
