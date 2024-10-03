package com.saurgupta.design_patterns.Learning.Structural.CompositePattern.FileSystem;

public class Main {
    public static void main(String[] args) {
        Directory mainFolder = new Directory("mainFolder");
        Directory subFolder = new Directory("subFolder");
        File mainFile = new File("mainFile");
        File subFile = new File("subFile");
        mainFolder.add(subFolder);
        mainFolder.add(mainFile);
        subFolder.add(subFile);
        mainFolder.ls();
    }
}
