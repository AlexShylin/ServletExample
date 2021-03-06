package com.gd.ashylin.crawler;

import com.gd.ashylin.crawler.health.HealthService;
import com.gd.ashylin.crawler.health.HealthServiceImpl;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HealthServlet extends HttpServlet {

    private HealthService healthService = new HealthServiceImpl();


    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String health = healthService.healthCheck();
        resp.getWriter().println(health);
    }
}
