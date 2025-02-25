package com.samsong.reward.dao;

import com.samsong.reward.config.State;

public class DynamoDBDataStore implements DataStore{
    @Override
    public void save(String customerId, State state) {
        //TODO implement
    }

    @Override
    public State getCustomerState(String customerId) {
        //TODO implement
        return null;
    }
}
