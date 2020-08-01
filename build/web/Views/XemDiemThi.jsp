<%-- 
    Document   : index
    Created on : Mar 7, 2020, 9:03:25 AM
    Author     : hoangpn
--%>

<%@page import="model.SinhVien"%>
<%@page import="model.BangDiem"%>
<%@page import="model.Diem"%>
<%@page import="service.BangDiemService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Cổng thông tin đào tạo Học viện Công nghệ Bưu chính Viễn thông</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="../res/main-css.css">
        <% SinhVien sinhVien = (SinhVien) session.getAttribute("maSinhVien");
            if (sinhVien == null) {
                response.sendRedirect("../Views/login.jsp");
            } %>

        <style>
            table {
                border: 2px solid black;
                border-collapse: collapse;
                height: 5px;
            }
            
            th, td {
                border: 2px solid black;
                border-collapse: collapse;
            
            }
            th{
                padding-left: 5px;
                padding-right: 5px;
            }
            table tr:nth-child(odd){
            background-color:#eee;
            }
            table tr:nth-child(even){
                background-color:white;
            }
            table tr:nth-child(1){
                background-color:skyblue;
            }
      
        </style>
    </head>
    <body><div id="header">
            <div id="h1"></div>
            <div id="h2">
                <% if (sinhVien == null) {%>
                <button onclick="window.location.href = 'Views/login.jsp'">Đăng nhập</button>
                <% } else {%>
                <span style="color: yellow; font-weight: bolder">
                    Chào bạn, <%= sinhVien.getHoTen()%>&nbsp;(<%= sinhVien.getMaSV()%>) 
                </span> <button><a style="text-decoration: none" href="/logout">Đăng xuất</a></button>
                <% }%>
            </div>
        </div>
            <div id="content" >
            <div id="menu">
                <a class="menu-items" href="../index.jsp">TRANG CHỦ</a>
                <a class="menu-items" href=../Views/XemDiemThi.jsp>XEM KẾT QUẢ HỌC TẬP</a>
            </div>
            <div id="main-content">
                <div style="margin-left: 35%; margin-right: 43%">
                    <% if (sinhVien != null) {%>
                    <p style="border-style: double;">
                        Họ và tên : <%= sinhVien.getHoTen()%><br>
                        Mã sinh viên : <%= sinhVien.getMaSV()%><br>
                        Lớp : <%= sinhVien.getLop()%><br>
                        Khóa : <%= sinhVien.getKhoaHoc()%><br>
                        Hệ đào tạo : <%= sinhVien.getHeDaoTao()%><br>
                        Khoa : <%= sinhVien.getKhoa()%><br>
                        Ngành : <%= sinhVien.getNganh()%>
                    </p>
                        <% } %>
                        <a href="../Views/XemDiemThi.jsp?hocKy=all" style="color: black; margin-left: 15%">Xem toàn bộ kết quả học tập</a>
                    <br>
                    <br>
                </div>
                <div style="margin-left: 32%">
                    <form action="/Views/XemDiemThi.jsp" method="GET">
                        <input type="text" size="65" name="hocKy" placeholder="Nhập học kỳ xem điểm thi, vd 20161-Kỳ 1 năm 2016...">
                        <input type="submit" value="Tìm kiếm">
                    </form>
                </div>
                <br>
                <% String hocKy = request.getParameter("hocKy");
                    if (hocKy != null && !hocKy.isEmpty()) {
                %>
                <% if(!hocKy.equals("all")){
                %>
                <p style="margin-left: 40px">Học kỳ <%= hocKy.substring(4) %> Năm học <%= hocKy.substring(0,4) %> </p>
                <% }
                %>
                <table style="margin-left: 40px; overflow: auto">
                    <tr style="font-weight: normal; font-style: normal; background-color: darkgray; ">
                        <th>STT</th>
                        <th>Mã môn</th>
                        <th>Tên môn</th>
                        <th>TC</th>
                        <th>%CC</th>
                        <th>%KT</th>
                        <th>%TH</th>
                        <th>%BT</th>
                        <th>%Thi</th>
                        <th>Điểm CC</th>
                        <th>Điểm KT</th>
                        <th>Điểm TH</th>
                        <th>Điểm BT</th>
                        <th>Thi L1</th>
                        <th>Thi L2</th>
                        <th>TK(10)</th>
                        <th>TK(CH)</th>
                        <th>KQ</th>
                        <th>Môn TL</th>
                    </tr>
                    <% BangDiemService bangDiemService = new BangDiemService();
                        BangDiem bangDiem = bangDiemService.getBangDiem("B16DCCN001", hocKy);
                        int stt = 1;
                        for (Diem i : bangDiem.getDiems()) {%>
                        <tr>
                        <td><%= stt%></td>
                        <td><%= i.getHocPhan().getMa()%></td>
                        <td style="text-align: left"><%= i.getHocPhan().getTen()%></td>
                        <td><%= i.getHocPhan().getSoTC()%></td>
                        <td><%= i.getpCC()%></td>
                        <td><%= i.getpKT()%></td>
                        <td><%= i.getpTH()%></td>
                        <td><%= i.getpBT()%></td>
                        <td><%= i.getpThi()%></td>
                        <td><%= i.getCc()%></td>
                        <td><%= i.getKt()%></td>
                        <td><%= i.getTh()%></td>
                        <td><%= i.getBt()%></td>
                        <td><%= i.getThiL1()%></td>
                        <td><%= i.getThiL2()%></td>
                        <td><%= i.getTkHe10()%></td>
                        <td><%= i.getTkHeChu()%></td>
                        <td><%= i.getKQ()%></td>
                        <td><%= i.getHocPhan().getMonTL()%></td
                    </tr>
                    <%  stt++;
                        }
                    %>
                </table>
                    <p style="margin-left: 40px">Số tín chỉ đạt: <%= bangDiem.getSoTinChiDat()%></p>
                    <p style="margin-left: 40px">Điểm trung bình học kỳ hệ 4 : <%= bangDiem.getTbHocKyHe4()%></p>
                    <p style="margin-left: 40px">Số tín chỉ tích lũy : <%= bangDiem.getSoTinChiTichLuy()%></p>
                    <p style="margin-left: 40px">Điểm trung bình tích lũy hệ 4 : <%= bangDiem.getTbTichLuyHe4()%></p>
                    <p style="margin-left: 40px">Đánh giá: <%= bangDiem.getDanhGia()%></h3>
                <%}%>
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
