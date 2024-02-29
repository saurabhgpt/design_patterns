package com.saurgupta.design_patterns.Learning.ObserverPattern;

import com.saurgupta.design_patterns.Learning.ObserverPattern.Publisher.EventEnum;
import com.saurgupta.design_patterns.Learning.ObserverPattern.Publisher.NotificationService;

public class Store {
    private final NotificationService notificationService;
    public Store() {
        this.notificationService = new NotificationService();
    }

    public void newItemPromotion() {
        notificationService.notify(EventEnum.NEW_ITEM);
    }

    public void salePromotion() {
        notificationService.notify(EventEnum.SALE);
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }
}
