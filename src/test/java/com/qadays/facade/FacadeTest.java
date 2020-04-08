package com.qadays.facade;

import org.junit.Before;
import org.junit.Test;

public class FacadeTest {

    private FacadeApiClient apiClient;

    @Before
    public void setUp() {
        apiClient = new FacadeApiClient();
    }

    @Test
    public void testFacade() {
        // just use any of facade methods without knowing which client inside
        apiClient.get();
        apiClient.post();
        apiClient.delete();
        apiClient.put();
    }
}
