package com.samsong.reward.dao;

import com.samsong.reward.config.State;

public class RDPDataStore implements DataStore{
    @Override
    public void save(String customerId, State state) {
        //TODO implement
    }

    @Override
    public State getCustomerCurrentState(String customerId) {
        //TODO implement
        return null;
    }

    @Override
    public boolean alreadyProcessed(String customerId, State state) {
        //TODO implement
        return false;
    }
}
