package org.example.MavenNew.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HolidayNextYearTest {

    @Test
    public void assertSame() {
        int expected = 3;

        HolidayNextYear service = new HolidayNextYear();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void assertNotSame() {
        int expected = 2;

        HolidayNextYear service = new HolidayNextYear();
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

