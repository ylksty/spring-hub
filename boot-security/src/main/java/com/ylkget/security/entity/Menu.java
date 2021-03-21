package com.ylkget.security.entity;

import lombok.Data;

/**
 * <p>
 * Menu
 * </p>
 *
 * @author joe 2021/3/21 09:16
 */
@Data
public class Menu {
    private Long id;
    private String name;
    private String url;
    private Long parentId;
    private String permission;
}
