package com.saurgupta.design_patterns.Learning.Creational.AbstractFactoryMethod.Creator;

import com.saurgupta.design_patterns.Learning.Creational.AbstractFactoryMethod.Products.IGpu;
import com.saurgupta.design_patterns.Learning.Creational.AbstractFactoryMethod.Products.IMonitor;

public abstract class Company {
    public abstract IGpu createGpu();
    public abstract IMonitor createMonitor();
}
