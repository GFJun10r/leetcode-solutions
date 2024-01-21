package com.gfjunior.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Problem1207Test {

    @Test
    public void test(){
        int[] example1 = {1,2,2,1,1,3};
        int[] example2 = {1,2};
        int[] example3 = {-3,0,1,-3,1,1,1,-3,10,0};

        assertTrue(Problem1207.uniqueOccurrences(example1));
        assertFalse(Problem1207.uniqueOccurrences(example2));
        assertTrue(Problem1207.uniqueOccurrences(example3));
    }

}