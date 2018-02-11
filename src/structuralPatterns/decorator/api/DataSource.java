package structuralPatterns.decorator.api;

public interface DataSource {
    void writeData(String data);
    String readData();
}
