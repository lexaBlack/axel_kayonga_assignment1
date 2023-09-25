import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Hard-coded username and password (replace with your own)
        String correctUsername = "axel.kayonga";
        String correctPassword = "password-24571";

        // Get user-entered credentials
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            // Successful login, redirect to the home page or another protected resource
            response.sendRedirect("home.jsp");
        } else {
            // Incorrect credentials, redirect to the forgot password page
            response.sendRedirect("forgotPassword.jsp");
        }
    }
}
