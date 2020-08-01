/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockito.testServlet;


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.io.*;
import javax.servlet.http.*;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import servlet.LoginServlet;
import servlet.LogoutServlet;

/**
 * @author Phạm Ngọc Hoàng - B16DCCN159
 */
public class TestLoginServlet extends Mockito {

    @Test
    public void testLoginServlet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        when(request.getSession()).thenReturn(session);
        when(request.getParameter("maSinhVien")).thenReturn("B16DCCN001");
        when(request.getParameter("matKhau")).thenReturn("010198");

        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);
        new LoginServlet().doPost(request, response);
        Assert.assertEquals("Login OK!", stringWriter.toString().trim());
    }
}
