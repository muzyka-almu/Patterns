package structuralPatterns.decorator.impl.decorator;

import structuralPatterns.decorator.api.DataSource;

public abstract class DataSourceDecorator implements DataSource {
    protected DataSource wrappee;

    public DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }
}
