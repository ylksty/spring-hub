package com.ylkget.pattern.behavior.chain.login;


import com.ylkget.pattern.behavior.chain.login.middleware.Middleware;
import com.ylkget.pattern.behavior.chain.login.middleware.RoleCheckMiddleware;
import com.ylkget.pattern.behavior.chain.login.middleware.ThrottlingMiddleware;
import com.ylkget.pattern.behavior.chain.login.middleware.UserExistsMiddleware;
import com.ylkget.pattern.behavior.chain.login.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <p>
 * Client
 * </p>
 *
 * @author joe 2021/3/30 15:18
 */
public class Client {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components.
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
