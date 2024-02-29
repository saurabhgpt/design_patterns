package com.saurgupta.design_patterns.Learning.AbstractFactoryMethod.Creator;

import com.saurgupta.design_patterns.Learning.AbstractFactoryMethod.Products.IGpu;
import com.saurgupta.design_patterns.Learning.AbstractFactoryMethod.Products.IMonitor;
import com.saurgupta.design_patterns.Learning.AbstractFactoryMethod.Products.MsiGpu;
import com.saurgupta.design_patterns.Learning.AbstractFactoryMethod.Products.MsiMonitor;

public class MsiManufacturer extends Company{
    @Override
    public IGpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public IMonitor createMonitor() {
        return new MsiMonitor();
    }
}
