package com.samsong.reward.processor;

import com.samsong.reward.config.State;
import com.samsong.reward.dao.DataStoreFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OrderShippedProcessorTest {
    final private OrderShippedProcessor target = new OrderShippedProcessor();
    final private String CUSTOMER_ID = "customer2";

    @Test
    public void processTest() {
        target.process(CUSTOMER_ID);
        State state = DataStoreFactory.getDataStore().getCustomerCurrentState(CUSTOMER_ID);
        assertEquals(State.CUSTOMER_NOTIFIED, state);

        assertThrows(IllegalArgumentException.class, () -> target.process(CUSTOMER_ID));
    }
}
