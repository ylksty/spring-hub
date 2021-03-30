package com.ylkget.pattern.behavior.chain.login.middleware;

/**
 * <p>
 *
 * </p>
 *
 * @author joe 2021/3/30 15:29
 */
public class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
