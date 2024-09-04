package com.saurgupta.design_patterns.Learning.Creational.AbstractFactoryMethod.Creator;

import com.saurgupta.design_patterns.Learning.Creational.AbstractFactoryMethod.Products.AsusGpu;
import com.saurgupta.design_patterns.Learning.Creational.AbstractFactoryMethod.Products.AsusMonitor;
import com.saurgupta.design_patterns.Learning.Creational.AbstractFactoryMethod.Products.IGpu;
import com.saurgupta.design_patterns.Learning.Creational.AbstractFactoryMethod.Products.IMonitor;

public class AsusManufacturer extends Company{
    @Override
    public IGpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public IMonitor createMonitor() {
        return new AsusMonitor();
    }
}
