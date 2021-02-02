import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCalculater", value = "/ServletCalculater")
public class ServletCalculater extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstOperand =Float.parseFloat(request.getParameter("first-operand"));
        float secondOperand =Float.parseFloat(request.getParameter("second-operand"));
        char operand=request.getParameter("operand").charAt(0);
        PrintWriter writer= response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Result: ");
        try {
            float result = Calculater.calculater(firstOperand,secondOperand,operand);
            writer.println(firstOperand+" "+operand+" "+secondOperand+"="+result);
        }catch (Exception e){
            writer.println("404");
        }
        writer.println("</html>");

    }
}
