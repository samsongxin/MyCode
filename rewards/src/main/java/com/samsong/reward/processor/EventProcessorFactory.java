package com.samsong.reward.processor;

import com.samsong.reward.config.EventType;

public class EventProcessorFactory {
    public static EventProcessor getProcessor(EventType eventType){
        EventProcessor eventProcessor;
        switch (eventType){
            // TODO: BUG: missing break statement
            case LANDING_PAGE_VISIT: eventProcessor = new LandingPageVisitProcessor();
            case ORDER_PLACED: eventProcessor = new OrderPlacedProcessor(); break;
            case ORDER_SHIPPED: eventProcessor = new OrderShippedProcessor(); break;
            default: throw new IllegalArgumentException("Unknown eventType="+ eventType);
        }
        return eventProcessor;
    }
}
