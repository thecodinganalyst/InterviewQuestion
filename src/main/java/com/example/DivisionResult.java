package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DivisionResult {
    private int quotient;
    private int remainder;

    @Override
    public String toString() {
        return "Quotient: " + quotient + ", Remainder: " + remainder;
    }
}
