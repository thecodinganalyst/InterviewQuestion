package com.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DivisionExecution {

    private DivisionExecution(){}

    public static DivisionResult divide(int dividend, int divisor){
        int remainder = dividend;
        int quotient = 0;

        while(remainder >= divisor){
            remainder -= divisor;
            quotient ++;
        }

        return new DivisionResult(quotient, remainder);
    }
}
