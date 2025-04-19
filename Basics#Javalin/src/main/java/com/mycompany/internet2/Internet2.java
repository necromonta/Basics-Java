/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.internet2;

import io.javalin.Javalin;
import io.javalin.http.Context;
import io.javalin.http.Handler;

public class Internet2 {

    public static void main(String[] args) {
         var app = Javalin.create(config -> {
            config.router.contextPath = "/api/v1";
            config.bundledPlugins.enableCors(cors -> {
                cors.addRule(it -> {
                    it.allowHost("http://localhost:" + 5173, "127.0.0.1:" + 5173);
                });
            });
            
        }).start(8080);
         
        // Handle pre-flight OPTIONS request
        app.options("/api/*", ctx -> {
            ctx.status(204); // No content response
        });

        app.get("/flights", ctx -> ctx.result("Flight data response here!"));

        // Endpoint to handle the POST request
        app.post("/submit", ctx -> {
            String message = ctx.body();
            System.out.println("Received message: " + message);
            ctx.json(new Response(message, "success"));
        });
    }

    static class Response {
        public String received;
        public String status;

        public Response(String received, String status) {
            this.received = received;
            this.status = status;
        }
    }
}

    

