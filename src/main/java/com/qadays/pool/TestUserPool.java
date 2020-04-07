package com.qadays.pool;

import org.apache.commons.pool2.PooledObjectFactory;
import org.apache.commons.pool2.impl.GenericObjectPool;

public class TestUserPool extends GenericObjectPool<TestUser> {

    public TestUserPool(PooledObjectFactory<TestUser> factory) {
        super(factory);
    }
}
