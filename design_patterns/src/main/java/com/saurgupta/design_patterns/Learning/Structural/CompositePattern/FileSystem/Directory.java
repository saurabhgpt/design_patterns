package com.saurgupta.design_patterns.Learning.Structural.CompositePattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements IFileSystem {
    String directoryName;
    List<IFileSystem> IFileSystems;


    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.IFileSystems = new ArrayList<>();
    }

    public void add(IFileSystem IFileSystem) {
        IFileSystems.add(IFileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory name - " + directoryName);
        for (IFileSystem IFileSystem : IFileSystems) {
            IFileSystem.ls();
        }
    }
}
