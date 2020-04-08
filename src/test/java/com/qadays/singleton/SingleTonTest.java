package com.qadays.singleton;

import org.junit.Test;

public class SingleTonTest {

    @Test
    public void testSingleton() {
        Singleton.getInstance();
//      Creating the new object using new Singleton(); is not possilbe since constructor is private
    }
}
