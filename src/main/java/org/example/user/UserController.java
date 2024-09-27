package org.example.user;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class UserController extends HttpServlet {

    private final UserRepository userRepository = new UserRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        List<String> users = userRepository.getUsers();
        out.println("<html><body>");
        out.println("<h1>User List</h1>");
        for (String user : users) {
            out.println("<p>" + user + "</p>");
        }
        out.println("</body></html>");
    }
}

