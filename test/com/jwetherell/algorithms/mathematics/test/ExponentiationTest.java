package com.jwetherell.algorithms.mathematics.test;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import com.jwetherell.algorithms.mathematics.Exponentiation;


import static org.junit.Assert.assertEquals;


public class ExponentiationTest {

    @Test
    public void recusriveExponentiationTest() {
        List<Integer> baseList = Arrays.asList(1, 2, 4, 6, 8, 17, 24);
        List<Integer> exponentList = Arrays.asList(1000, 27, 14, 11, 10, 7, 5);
        List<Integer> expectedResultList = Arrays.asList(1, 134217728, 268435456, 362797056, 1073741824, 410338673, 7962624);

        for (int i = 0; i < expectedResultList.size(); i++)
            assertEquals(expectedResultList.get(i), Exponentiation.recursiveExponentiation(baseList.get(i), exponentList.get(i)));
    }

    @Test
    public void fastRecusriveExponentiationTest() {
        List<Integer> baseList = Arrays.asList(1, 2, 4, 6, 8, 17, 24);
        List<Integer> exponentList = Arrays.asList(1000, 27, 14, 11, 10, 7, 5);
        List<Integer> expectedResultList = Arrays.asList(1, 134217728, 268435456, 362797056, 1073741824, 410338673, 7962624);

        for (int i = 0; i < expectedResultList.size(); i++)
            assertEquals(expectedResultList.get(i), Exponentiation.fastRecursiveExponentiation(baseList.get(i), exponentList.get(i)));
    }

    @Test
    public void fastRecusriveExponentiationModuloTest() {
        List<Integer> baseList = Arrays.asList(1, 2, 4, 6, 8, 17, 24);
        List<Integer> exponentList = Arrays.asList(1000, 27, 14, 11, 10, 7, 5);
        List<Integer> divisorList = Arrays.asList(2, 6, 3, 2, 9, 11, 5);
        List<Integer> expectedResultList = Arrays.asList(1, 2, 1, 0, 1, 8, 4);

        for (int i = 0; i < expectedResultList.size(); i++)
            assertEquals(expectedResultList.get(i), Exponentiation.fastRecursiveExponentiationModulo(baseList.get(i), exponentList.get(i), divisorList.get(i)));
    }
}
