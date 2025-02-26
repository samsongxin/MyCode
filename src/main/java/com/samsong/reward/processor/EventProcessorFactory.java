package com.samsong.reward.processor;

import com.samsong.reward.config.EventType;

public class EventProcessorFactory {
    public static EventProcessor getProcessor(EventType eventType){
        switch (eventType){
            case LANDING_PAGE_VISIT: return new LandingPageVisitProcessor();
            case ORDER_PLACED: return new OrderPlacedProcessor();
            case ORDER_SHIPPED: return new OrderShippedProcessor();
            default: throw new IllegalArgumentException("Unknown eventType="+ eventType);
        }
    }
}
