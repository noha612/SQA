package mockito.testServlet;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import servlet.LoginServlet;
import servlet.LogoutServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.mockito.Mockito.mock;

public class TestLogoutServlet  extends Mockito {

    @Test
    public void TestLogoutServlet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        new LogoutServlet().doGet(request, response);
        Assert.assertEquals("Logout OK!", stringWriter.toString().trim());
    }
}
