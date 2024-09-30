import javax.servlet.http.*;
import java.io.*;
public class HelloWorld extends HttpServlet {

    @Override
    public void service(HttpServletRequest req,
                        HttpServletResponse res)
            throws IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<html><head><title>" +
                "Hello World!</title></head>");
        out.println("<body><h1>Hello World!</h1></body></html>");
    }
}