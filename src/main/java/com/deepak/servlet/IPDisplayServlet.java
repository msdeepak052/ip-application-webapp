package com.deepak.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ipdisplay")
public class IPDisplayServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String clientIp = request.getRemoteAddr();
        String serverIp = request.getLocalAddr();

        request.setAttribute("clientIp", clientIp);
        request.setAttribute("serverIp", serverIp);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}

