package com.saurgupta.design_patterns.Learning.ObserverPattern.Publisher;

import com.saurgupta.design_patterns.Learning.ObserverPattern.Listeners.IEventListener;

import java.util.*;

public class NotificationService {
    private final Map<EventEnum, List<IEventListener>> customers;

    public NotificationService() {
        customers = new HashMap<>();
        Arrays.stream(EventEnum.values()).forEach(eventEnum ->
                customers.put(eventEnum, new ArrayList<>()));
    }

    public void subscribe(EventEnum eventEnum, IEventListener listener) {
        customers.get(eventEnum).add(listener);
    }

    public void unsubscribe(EventEnum eventEnum, IEventListener listener) {
        customers.get(eventEnum).remove(listener);
    }

    public void notify(EventEnum eventEnum) {
        customers.get(eventEnum).forEach(listener ->
                listener.update());
    }
}
