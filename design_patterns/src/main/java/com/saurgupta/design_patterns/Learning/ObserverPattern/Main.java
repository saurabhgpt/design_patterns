package com.saurgupta.design_patterns.Learning.ObserverPattern;

import com.saurgupta.design_patterns.Learning.ObserverPattern.Listeners.EmailMsgListener;
import com.saurgupta.design_patterns.Learning.ObserverPattern.Publisher.EventEnum;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        store.getNotificationService().subscribe(
                EventEnum.SALE,
                new EmailMsgListener("xyz@gmail.com")
        );

        store.getNotificationService().subscribe(
                EventEnum.NEW_ITEM,
                new EmailMsgListener("xyz@gmail.com")
        );

        store.getNotificationService().subscribe(
                EventEnum.NEW_ITEM,
                new EmailMsgListener("abc@gmail.com")
        );

        store.newItemPromotion();
        store.salePromotion();
    }
}
