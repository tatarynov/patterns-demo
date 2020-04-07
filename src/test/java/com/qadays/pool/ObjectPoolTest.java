package com.qadays.pool;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ObjectPoolTest {

    private TestUser testUser;

    @Before
    public void setUpData() throws Exception {
        testUser = new TestUserPool(new TestUserFactory()).borrowObject();
    }

    @Test
    public void testCreditCard() {
        // check the credit card object instead of verifying each field
        Assert.assertFalse("User password is empty", testUser.getPassword().isEmpty());
        Assert.assertFalse("User email is empty", testUser.getEmail().isEmpty());
    }
}
