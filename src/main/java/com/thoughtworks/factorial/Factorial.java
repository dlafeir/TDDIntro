package com.thoughtworks.factorial;

import java.util.IllegalFormatCodePointException;

public class Factorial {
    public Integer compute(int i) {
       if(i < 0){
           throw new IllegalArgumentException();
       }
        return (i == 0) ? 1 : (i*compute(i-1));
    }
}
