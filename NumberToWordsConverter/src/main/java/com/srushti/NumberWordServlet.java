package com.srushti;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/convert")
public class NumberWordServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        int num = Integer.parseInt(request.getParameter("num"));

        String[] words = {
                "", "One", "Two", "Three", "Four",
                "Five", "Six", "Seven", "Eight",
                "Nine", "Ten", "Eleven", "Twelve",
                "Thirteen", "Fourteen", "Fifteen",
                "Sixteen", "Seventeen", "Eighteen",
                "Nineteen", "Twenty"
        };

        String[] roman = {
                "", "I", "II", "III", "IV",
                "V", "VI", "VII", "VIII",
                "IX", "X", "XI", "XII",
                "XIII", "XIV", "XV", "XVI",
                "XVII", "XVIII", "XIX", "XX"
        };

        out.println("<html><body>");

        out.println("<h1>Result</h1>");

        if (num >= 1 && num <= 20) {

            out.println("<h2>Number : " + num + "</h2>");

            out.println("<h2>In Words : "
                    + words[num] + "</h2>");

            out.println("<h2>Roman Number : "
                    + roman[num] + "</h2>");

        } else {

            out.println("<h2>Enter number between 1 to 20</h2>");
        }

        out.println("</body></html>");
    }
}