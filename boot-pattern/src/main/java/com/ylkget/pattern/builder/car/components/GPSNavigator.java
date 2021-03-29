package com.ylkget.pattern.builder.car.components;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/29 09:35
 */
public class GPSNavigator {
    private String route;

    public GPSNavigator() {
        this.route = "221b, Baker Street, London  to Scotland Yard, 8-10 Broadway, London";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }
}
