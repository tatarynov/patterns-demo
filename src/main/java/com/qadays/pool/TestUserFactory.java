package com.qadays.pool;

import lombok.extern.java.Log;
import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

import java.util.concurrent.atomic.AtomicInteger;

@Log
public class TestUserFactory extends BasePooledObjectFactory<TestUser> {

    private static AtomicInteger count = new AtomicInteger(1);
    private static final int LIMIT_OF_USERS = 100;

    @Override
    public TestUser create() {
        TestUser testUserToBeCreated;

        if (count.incrementAndGet() > LIMIT_OF_USERS) {
            throw new IllegalStateException("All users are used! Please reuse created ones!");
        } else {
            testUserToBeCreated = new TestUser(count.get());
        }

        return testUserToBeCreated;
    }

    @Override
    public PooledObject<TestUser> wrap(TestUser obj) {
        return new DefaultPooledObject<>(obj);
    }


    @Override
    public PooledObject<TestUser> makeObject() throws Exception {
        return super.makeObject();
    }

    @Override
    public void destroyObject(PooledObject<TestUser> p) throws Exception {
        super.destroyObject(p);
    }

    @Override
    public boolean validateObject(PooledObject<TestUser> p) {
        return super.validateObject(p);
    }

    @Override
    public void activateObject(PooledObject<TestUser> p) throws Exception {
        super.activateObject(p);
    }

    @Override
    public void passivateObject(PooledObject<TestUser> p) throws Exception {
        super.passivateObject(p);
    }
}
