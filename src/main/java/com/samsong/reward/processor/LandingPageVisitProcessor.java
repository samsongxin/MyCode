package com.samsong.reward.processor;

import com.samsong.reward.WorkflowEngine;
import com.samsong.reward.config.State;
import com.samsong.reward.dao.DataStoreFactory;

public class LandingPageVisitProcessor implements EventProcessor{
    @Override
    public void process(String customerId) {
         EventProcessorHelper.process(customerId,this);
    }

    @Override
    public State getStartState() {
        return State.ELIGIBLE;
    }

    @Override
    public State getEndState() {
        return State.ELIGIBLE;
    }
}
