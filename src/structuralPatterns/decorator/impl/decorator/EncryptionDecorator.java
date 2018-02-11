package structuralPatterns.decorator.impl.decorator;

import structuralPatterns.decorator.api.DataSource;

public class EncryptionDecorator extends DataSourceDecorator {
    private Integer SHIFT = 5;

    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        String encryptionData = this.doShift(data, SHIFT);
        this.wrappee.writeData(encryptionData);
    }

    @Override
    public String readData() {
        String data = this.wrappee.readData();

        return this.doShift(data, -SHIFT);
    }

    private String doShift(String data, Integer shift) {
        String result = "";

        for(int i = 0; i < data.length(); i++) {
            result += (char)(data.charAt(i) + shift);
        }

        return result;
    }
}
