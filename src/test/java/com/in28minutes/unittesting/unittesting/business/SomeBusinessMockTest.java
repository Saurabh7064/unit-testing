package com.in28minutes.unittesting.unittesting.business;

import com.in28minutes.unittesting.unittesting.data.SomeDataService;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

// when(someDataService.retrieveAllData()).thenReturn(new int[]{2,3});
// when() and thereturn() wch is alternative of stub
public class SomeBusinessMockTest {

    SomeBusinessImpl business = new SomeBusinessImpl();
    SomeDataService someDataService = mock(SomeDataService.class);

    @BeforeEach
     public void before() {
        business.setSomeDataService(someDataService);
    }

    @Test
    public void calculateSumUsingDataService_basic() {
        when(someDataService.retrieveAllData()).thenReturn(new int[]{2,3});
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_empty() {
        when(someDataService.retrieveAllData()).thenReturn(new int[]{});
        int actualResult = business.calculateSumUsingDataService();//new int[] {}
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_oneValue() {
        when(someDataService.retrieveAllData()).thenReturn(new int[]{5});
        int actualResult = business.calculateSumUsingDataService();//new int[] { 5 }
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }
}
