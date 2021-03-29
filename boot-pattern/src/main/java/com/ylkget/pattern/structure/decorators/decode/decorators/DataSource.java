package com.ylkget.pattern.structure.decorators.decode.decorators;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/29 20:45
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
