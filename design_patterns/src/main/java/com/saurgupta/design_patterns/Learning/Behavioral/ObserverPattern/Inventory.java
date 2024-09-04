package com.saurgupta.design_patterns.Learning.Behavioral.ObserverPattern;

public class Inventory {
    private InventoryItemType inventoryItemType;
    private int units;

    public Inventory(InventoryItemType inventoryItemType, int units) {
        this.inventoryItemType = inventoryItemType;
        this.units = units;
    }

    public InventoryItemType getInventoryItemType() {
        return inventoryItemType;
    }

    public int getUnits() {
        return units;
    }
}
