
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 671749
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

 

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            request.setAttribute("message", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String num1 = request.getParameter("firstNum");
        String num2 = request.getParameter("secondNum");
        if(((num1.equals("") || num1 == null) || (num2.equals("") || num2 == null))||(!num1.chars().allMatch(Character::isDigit) || !num2.chars().allMatch(Character::isDigit))) {
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
         
        }else if (request.getParameter("+") != null){
            int result = Integer.parseInt(num1) + Integer.parseInt(num2) ;
            request.setAttribute("message", result);
            request.setAttribute("num1", num1);
            request.setAttribute("num2", num2);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
            
        }else if (request.getParameter("-") != null){
            int result = Integer.parseInt(num1) - Integer.parseInt(num2) ;
            request.setAttribute("message", result);
            request.setAttribute("num1", num1);
            request.setAttribute("num2", num2);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
            
        }else if (request.getParameter("*") != null){
            int result = Integer.parseInt(num1) * Integer.parseInt(num2) ;
            request.setAttribute("message", result);
            request.setAttribute("num1", num1);
            request.setAttribute("num2", num2);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
            
        }else if (request.getParameter("%") != null){
            int result = Integer.parseInt(num1) % Integer.parseInt(num2) ;
            request.setAttribute("message", result);
            request.setAttribute("num1", num1);
            request.setAttribute("num2", num2);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
            
        }
    }



}
