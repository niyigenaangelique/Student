import java.io.IOException;
/*import jakarta.servlet.RequestDispatcher;*/
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class SignInServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Retrieve user data from session
        HttpSession session = request.getSession();
        String sessionEmail = (String) session.getAttribute("email");
        String sessionPassword = (String) session.getAttribute("password");

        // Check if the user data matches the session data
        if (email.equals(sessionEmail) && password.equals(sessionPassword)) {
            // Redirect to admission page
        	response.sendRedirect("admission.jsp");
        } else {
            // Redirect to SignIn page with an error message
            request.setAttribute("error", "Invalid email or password");
            response.sendRedirect("signin.jsp");
        }
    }
}