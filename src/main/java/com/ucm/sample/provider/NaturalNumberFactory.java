package com.ucm.sample.provider;

import io.reactivex.rxjava3.core.Observable;

public class NaturalNumberFactory {

    public Observable<Integer> getGenerator() {
        return Observable.fromIterable(() -> new NaturalNumberIterator());
    }
}
