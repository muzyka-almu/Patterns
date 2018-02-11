package structuralPatterns.decorator.impl.service;

import structuralPatterns.decorator.api.DataSource;

import java.util.ArrayList;
import java.util.List;

public class FileDataSource implements DataSource {
    private String file = "";

    @Override
    public void writeData(String data) {
        System.out.println("FileDataSource.writeData:" + data);
        file += data;
    }

    @Override
    public String readData() {
        System.out.println("FileDataSource.readData:" + file);
        return file;
    }
}
