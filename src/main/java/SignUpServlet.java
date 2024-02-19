import java.io.IOException;
/*import jakarta.servlet.RequestDispatcher;*/
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/SignupServlet")
public class SignUpServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Save user data in session
        HttpSession session = request.getSession();
        session.setAttribute("email", email);
        session.setAttribute("password", password);

        // Redirect to login page
        response.sendRedirect("signin.jsp");
    }
}