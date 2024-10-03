package com.saurgupta.design_patterns.Learning.Structural.CompositePattern.FileSystem;

public class File implements IFileSystem {
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println(this.fileName);
    }
}
