import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet("/StudentAdmissionServlet")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, // 2MB
                 maxFileSize = 1024 * 1024 * 10,      // 10MB
                 maxRequestSize = 1024 * 1024 * 50)   // 50MB
public class AdmissionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String dob = request.getParameter("dob");
        
        Part passportPart = request.getPart("passport");
        String passportFileName = getFileName(passportPart);
        String passportContentType = passportPart.getContentType();
        
        Part certificatesPart = request.getPart("certificates");
        String certificatesFileName = getFileName(certificatesPart);
        String certificatesContentType = certificatesPart.getContentType();
        
        // Save files to desired directory
        // You can implement your logic here
        
        // Dummy response for demonstration
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body style=\"margin-left: 450px;background-color: black;\">");
        out.println("<fieldset style=\"height: 300px; width: 300px; margin-top: 100px; text-align: center; background-color: black; color: white; border-radius: 5px;\">");
        out.println("<h3>Student Details:</h3>");
        out.println("Name: " + name + "<br><br>");
        out.println("Date of Birth: " + dob + "<br><br>");
        out.println("Passport Picture: " + passportFileName + " (" + passportContentType + ")<br><br>");
        out.println("Certificates: " + certificatesFileName + " (" + certificatesContentType + ")<br><br>");
        out.println("<a href=\"success.jsp\" style=\"text-decoration: none;width: 100%; padding: 10px;margin-top: 10px; background-color: blue;color: white; border: none; border-radius: 5px; cursor: pointer;\">Click to Save</a>");
        out.println("</fieldset></body></html>");
    }
    
    private String getFileName(final Part part) {
        final String partHeader = part.getHeader("content-disposition");
        for (String content : partHeader.split(";")) {
            if (content.trim().startsWith("filename")) {
                return content.substring(content.indexOf('=') + 1).trim().replace("\"", "");
            }
        }
        return null;
    }
}
