package com.samsong.reward.dao;

import com.samsong.reward.config.State;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * An In memory data store for testing
 */
public class InMemoryDataStore implements DataStore{
    private final Map<String, List<State>> inMemoryDB = new HashMap<>();
    @Override
    public void save(String customerId, State state) {
        inMemoryDB.putIfAbsent(customerId, new ArrayList<>());
        inMemoryDB.get(customerId).add(state);
    }

    @Override
    public State getCustomerCurrentState(String customerId) {
       return inMemoryDB.get(customerId).getLast();
    }

    @Override
    public boolean alreadyProcessed(String customerId, State state) {
        return inMemoryDB.get(customerId).contains(state);
    }
}
