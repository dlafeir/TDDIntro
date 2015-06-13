package com.thoughtworks.factorial;

public class Factorial {
    public Integer compute(int i) {
        return (i == 0) ? 1 : (i*compute(i-1));
    }
}
