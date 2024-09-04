package com.saurgupta.design_patterns.Learning.Creational.AbstractFactoryMethod;

import com.saurgupta.design_patterns.Learning.Creational.AbstractFactoryMethod.Creator.AsusManufacturer;
import com.saurgupta.design_patterns.Learning.Creational.AbstractFactoryMethod.Creator.Company;
import com.saurgupta.design_patterns.Learning.Creational.AbstractFactoryMethod.Creator.MsiManufacturer;
import com.saurgupta.design_patterns.Learning.Creational.AbstractFactoryMethod.Products.IGpu;
import com.saurgupta.design_patterns.Learning.Creational.AbstractFactoryMethod.Products.IMonitor;

public class Main {
    public static void main(String[] args) {
        Company msi = new MsiManufacturer();
        IGpu iMsiGpu = msi.createGpu();
        IMonitor iMsiMonitor = msi.createMonitor();

        Company asus = new AsusManufacturer();
        IGpu iAsusGpu = asus.createGpu();
        IMonitor iAsusMonitor = asus.createMonitor();
    }
}
