package com.qadays.pool;

import lombok.extern.java.Log;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@Log
public class ObjectPoolTest {

    private TestUser testUser;

    @Before
    public void setUpData() throws Exception {
        testUser = new TestUserPool(new TestUserFactory()).borrowObject();
    }

    @Test
    public void testUserFields() {
        Assert.assertFalse("User password is empty", testUser.getPassword().isEmpty());
        Assert.assertFalse("User email is empty", testUser.getEmail().isEmpty());
    }
}
