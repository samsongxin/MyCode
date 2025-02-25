package com.samsong.reward.dao;

import com.samsong.reward.config.State;

public interface DataStore {
    void save(String customerId, State state);
    State getCustomerState(String customerId);
}
