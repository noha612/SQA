<%-- 
    Document   : login
    Created on : Mar 15, 2020, 9:54:58 PM
    Author     : ntnhu
--%>

<%@page import="model.SinhVien"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Cổng thông tin đào tạo Học viện Công nghệ Bưu chính Viễn thông</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="../res/main-css.css">
        <% SinhVien sinhVien = (SinhVien) session.getAttribute("maSinhVien");
//        if (sinhVien == null) response.sendRedirect("index.jsp"); %>
    </head>
    <body>
        <div id="header">
            <div id="h1"></div>
            <div id="h2">
                <% if (sinhVien == null) {%>
                <button onclick="window.location.href = 'Views/login.jsp'">Đăng nhập</button>
                <% } else {%>
                <span style="color: yellow; font-weight: bolder">
                    Chào bạn, <%= sinhVien.getHoTen()%>&nbsp;(<%= sinhVien.getMaSV() %>)
                </span> <button><a style="text-decoration: none" href="/logout">Đăng xuất</a></button>
                <% }%>
            </div>
        </div>
            <div id="content" style="height: 600px">
            <div id="menu">
                <a class="menu-items" href="../index.jsp">TRANG CHỦ</a>
                <a class="menu-items" href=../Views/XemDiemThi.jsp>XEM KẾT QUẢ HỌC TẬP</a>
            </div>
            <div id="main-content" style=" font-size: 20px;">
                <form action="/login" method="POST" style="margin-left: 30%; margin-top: 10%;">
                    <label>Mã sinh viên:</label><br>
                    <input type="text" name="maSinhVien" size="40"><br>
                    <label>Mật khẩu:</label><br>
                    <input type="password" name="matKhau" size="40"><br><br>
                    <input type="submit" value="Đăng nhập">
                </form>
            </div>
        </div>
        <div id="footer">
            <br>
            <h3 style="margin-left: 5%">HỌC VIỆN CÔNG NGHỆ BƯU CHÍNH VIỄN THÔNG</h3>
            <div id="footer11">
                <div id="beginfooter"></div>
                <div id="footer1">
                    <p style="margin-bottom: 0px;">Trụ sở chính:</p>
                    <p style="margin-top: 0px;">122 Hoàng Quốc Việt, Q.Cầu Giấy, Hà Nội.</p>
                    <p style="margin-bottom: 0px;">Cơ sở đào tạo tại Hà Nội:</p>
                    <p style="margin-top: 0px;">Km10, Đường Nguyễn Trãi, Q.Hà Đông, Hà Nội</p>  
                    <a href="https://www.facebook.com/HocvienPTIT"><img class="contactIcon" src="../res/fbb.png" style="border-radius: 5px"></a>
                    <a href="http://portal.ptit.edu.vn/"><img class="contactIcon" src="../res/ptit.png"></a>
                   
                </div>
                <div id="footer2">
                    <p style="margin-bottom: 0px;">Học viện cơ sở tại TP. Hồ Chí Minh:</p>
                    <p style="margin-top: 0px;">11 Nguyễn Đình Chiểu, P. Đa Kao, Q.1 TP Hồ Chí Minh</p>
                    <p style="margin-bottom: 0px;">Cơ sở đào tạo tại TP Hồ Chí Minh:</p>
                    <p style="margin-top: 0px;">Đường Man Thiện, P. Hiệp Phú, Q.9 TP Hồ Chí Minh</p>
                    
                </div>
                <div id="footer3">
                    <br>
                    <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3725.301678832317!2d105.78570991486083!3d20.98054088602447!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3135acce762c2bb9%3A0xbb64e14683ccd786!2zSOG7jWMgdmnhu4duIEPDtG5nIG5naOG7hyBCxrB1IGNow61uaCBWaeG7hW4gdGjDtG5nIC0gUFRJVA!5e0!3m2!1svi!2s!4v1585330320219!5m2!1svi!2s"
                            width="400" height="100" frameborder="0" style="border:0;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
                </div>
            </div>
        </div>        
    </body>