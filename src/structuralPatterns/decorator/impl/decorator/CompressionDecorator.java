package structuralPatterns.decorator.impl.decorator;

import structuralPatterns.decorator.api.DataSource;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        System.out.println("CompressionDecorator.writeData: DO COMPRESSION!!!");
        this.wrappee.writeData(data);
    }

    @Override
    public String readData() {
        System.out.println("CompressionDecorator.readData: DO DECOMPRESSION!!!");
        return this.wrappee.readData();
    }
}
