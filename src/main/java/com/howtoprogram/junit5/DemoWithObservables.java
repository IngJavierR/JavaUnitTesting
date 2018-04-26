package com.howtoprogram.junit5;

import io.reactivex.Observable;

import java.util.ArrayList;

public class DemoWithObservables {

    public Observable<Integer> getListOfObject(){
        final Integer[] numbers = {1,5,10,20};

        return Observable.fromArray(numbers).filter(x -> x >= 10);
    }
}
