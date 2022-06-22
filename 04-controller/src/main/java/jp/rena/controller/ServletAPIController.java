package jp.rena.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServletAPIController {

    @GetMapping("/servletapi/s1")
    public void s1(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.getWriter().println("Hello Spring by resp.getWriter().println() ");
    }

    @GetMapping("/servletapi/s2")
    public void s2(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect("../index.jsp");
    }

    @GetMapping("/servletapi/s3")
    public void s3(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setAttribute("msg", "RequestDispatcher");
        req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req, resp);
    }

}
