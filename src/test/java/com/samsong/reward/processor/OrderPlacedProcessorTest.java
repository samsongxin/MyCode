package com.samsong.reward.processor;

import com.samsong.reward.config.State;
import com.samsong.reward.dao.DataStoreFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrderPlacedProcessorTest {
    final private OrderPlacedProcessor target = new OrderPlacedProcessor();
    final private String CUSTOMER_ID = "customer3";

    @Test
    public void processTest() {
        target.process(CUSTOMER_ID);
        State state = DataStoreFactory.getDataStore().getCustomerCurrentState(CUSTOMER_ID);
        assertEquals(State.BUDGET_RESERVED, state);

        assertThrows(IllegalArgumentException.class, () -> target.process(CUSTOMER_ID));
    }
}
