import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class App extends HttpServlet {
  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws IOException {
    PrintWriter out = resp.getWriter();
    for(int index = 0 ; index < 10 ; index++)
    out.println("Done");
    System.out.println(out.toString());
  }
}
