
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ageCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("age");
        String message = "";
        
        request.setAttribute("yourAge", age);
        
        if (age == null || age.equals("")) {
            message = "You must give your current age.";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        
        try {
            int newAge = Integer.parseInt(age);
            newAge++;
            message = "Your age next brithday will be " + newAge;
        } catch (NumberFormatException e) {
            message = "You must enter a number.";
        }
        request.setAttribute("message", message);
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
    }
}
