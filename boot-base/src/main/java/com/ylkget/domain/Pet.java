package com.ylkget.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <p>
 * Pet
 * </p>
 *
 * @author joe 2021/3/18 16:18
 */
@ToString
@Data
@NoArgsConstructor  //无参构造器
@AllArgsConstructor  //全参构造器
public class Pet {

    private String name;

}
