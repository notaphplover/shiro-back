package com.ucm.sample.provider;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.reactivex.rxjava3.core.Observable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NaturalNumberFactoryTest {

    @DisplayName("The first number provided must be the number one")
    @Test
    public void itReturnsOneAsTheFirstNumberProvided() {
        NaturalNumberFactory factory = new NaturalNumberFactory();
        Observable<Integer> numberGenerator = factory.getGenerator();

        Integer first = numberGenerator.first(0).blockingGet();

        assertEquals(1, first);
    }
}
