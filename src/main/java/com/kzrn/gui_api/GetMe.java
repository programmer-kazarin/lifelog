package com.kzrn.gui_api;

import com.kzrn.ApplicationProperties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/isOK")
public class GetMe extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            ApplicationProperties properties = new ApplicationProperties(getServletContext());
            String okMessage = properties.getProperty("ok_message");
            resp.getWriter().println(okMessage);
        } catch (Exception e) {
            resp.getWriter().println(e.getMessage());
        }
    }
}
