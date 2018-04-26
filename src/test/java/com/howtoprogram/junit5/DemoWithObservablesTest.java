package com.howtoprogram.junit5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class DemoWithObservablesTest {

    @Test
    void verifyListObs(){
        DemoWithObservables demoWithObservables = new DemoWithObservables();

        List<Integer> numberList = new ArrayList<>();

        demoWithObservables.getListOfObject().subscribe(x -> {
            numberList.add(x);
        },
        error -> {},
        () -> Assert.assertArrayEquals(new Integer[]{10,20}, numberList.toArray()));
    }
}
