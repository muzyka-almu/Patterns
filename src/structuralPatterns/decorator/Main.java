package structuralPatterns.decorator;

import structuralPatterns.decorator.api.DataSource;
import structuralPatterns.decorator.impl.decorator.CompressionDecorator;
import structuralPatterns.decorator.impl.decorator.EncryptionDecorator;
import structuralPatterns.decorator.impl.service.FileDataSource;

public class Main {
    public static void main(String ...args) {
        System.out.println("------------------------------");
        DataSource ds1 = new EncryptionDecorator(new FileDataSource());
        client(ds1);
        System.out.println("------------------------------");


        System.out.println("------------------------------");
        DataSource ds2 = new EncryptionDecorator(new CompressionDecorator(new FileDataSource()));
        client(ds2);
        System.out.println("------------------------------");
    }

    public static void client(DataSource dataSource) {
        String text = "Some useful text here";
        dataSource.writeData(text);

        System.out.println(dataSource.readData());
    }
}
