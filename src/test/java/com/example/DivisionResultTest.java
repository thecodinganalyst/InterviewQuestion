package com.example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class DivisionResultTest {

    @Test
    void testToString() {
        DivisionResult result = new DivisionResult(10, 2);
        assertThat(result.toString(), is("Quotient: 10, Remainder: 2"));
    }
}