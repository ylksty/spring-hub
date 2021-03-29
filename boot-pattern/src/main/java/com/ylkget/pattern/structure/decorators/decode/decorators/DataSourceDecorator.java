package com.ylkget.pattern.structure.decorators.decode.decorators;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/29 20:45
 */
public class DataSourceDecorator implements DataSource {
    private DataSource wrappee;

    DataSourceDecorator(DataSource source) {
        this.wrappee = source;
    }

    @Override
    public void writeData(String data) {
        wrappee.writeData(data);
    }

    @Override
    public String readData() {
        return wrappee.readData();
    }
}
