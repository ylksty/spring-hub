package com.ylkget.pattern.structure.decorators.decode;

import com.ylkget.pattern.structure.decorators.decode.decorators.*;

/**
 * <p>
 * Client
 * </p>
 *
 * @author joe 2021/3/29 20:44
 */
public class Client {
    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        String path = "/Users/yanglinkai/IdeaProjects/spring-hub/boot-pattern/src/main/resources/out/OutputDemo.txt";
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource(path)));
        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource(path);

        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
    }
}
