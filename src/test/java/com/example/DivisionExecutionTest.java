package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

class DivisionExecutionTest {
    @ParameterizedTest
    @CsvSource({
            "10, 2, 5, 0",
            "10, 3, 3, 1",
            "100, 4, 25, 0"
    })
    void givenSampleData_whenDivide_thenReturnExpectedResults(int dividend, int divisor, int quotient, int remainder) {
        DivisionResult divisionResult = DivisionExecution.divide(dividend, divisor);
        assertThat(divisionResult.getQuotient(), is(quotient));
        assertThat(divisionResult.getRemainder(), is(remainder));
    }

}