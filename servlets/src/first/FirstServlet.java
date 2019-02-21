package first;

import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();

        out.println(request.getParameter("message"));

        for(Product p : Inventory.INVENTORY.getProductList()) {
            out.println("<li>Name: " + p.getName() + ", Description: " + p.getDesc() + ", Product ID: " + p.getProductID() + "</li>");
        }

    }


}