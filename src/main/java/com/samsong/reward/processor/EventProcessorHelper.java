package com.samsong.reward.processor;

import com.samsong.reward.WorkflowEngine;
import com.samsong.reward.config.State;
import com.samsong.reward.dao.DataStoreFactory;

public class EventProcessorHelper {

    public static void process(String customerId, EventProcessor eventProcessor) {
        State currentState = eventProcessor.getStartState();
        DataStoreFactory.getDataStore().save(customerId, currentState);
        while(currentState != eventProcessor.getEndState()){
            currentState = WorkflowEngine.nextState(currentState);
            if(currentState != null){
                DataStoreFactory.getDataStore().save(customerId, currentState);
            }
        }
    }
}
