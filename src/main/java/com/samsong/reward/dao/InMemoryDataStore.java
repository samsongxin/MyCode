package com.samsong.reward.dao;

import com.samsong.reward.config.State;

import java.util.HashMap;
import java.util.Map;

/**
 * An In memory data store for testing
 */
public class InMemoryDataStore implements DataStore{
    private final Map<String, State> inMemoryDB = new HashMap<>();
    @Override
    public void save(String customerId, State state) {
        inMemoryDB.put(customerId, state);
    }

    @Override
    public State getCustomerState(String customerId) {
        return inMemoryDB.get(customerId);
    }
}
