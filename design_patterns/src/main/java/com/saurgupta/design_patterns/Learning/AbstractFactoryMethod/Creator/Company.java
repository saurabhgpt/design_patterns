package com.saurgupta.design_patterns.Learning.AbstractFactoryMethod.Creator;

import com.saurgupta.design_patterns.Learning.AbstractFactoryMethod.Products.IGpu;
import com.saurgupta.design_patterns.Learning.AbstractFactoryMethod.Products.IMonitor;

public abstract class Company {
    public abstract IGpu createGpu();
    public abstract IMonitor createMonitor();
}
