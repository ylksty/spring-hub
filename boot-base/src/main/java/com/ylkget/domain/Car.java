package com.ylkget.domain;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 只有在容器中的组件，才会拥有SpringBoot提供的强大功能
 * </p>
 *
 * @author joe 2021/3/18 17:20
 */
@ToString
@Data
@ConfigurationProperties(prefix = "mycar")
public class Car {
    private String brand;
    private Integer price;
}
