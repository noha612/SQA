<%@page import="model.SinhVien"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Cổng thông tin đào tạo Học viện Công nghệ Bưu chính Viễn thông</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="./res/main-css.css">
        <% SinhVien sinhVien = (SinhVien) session.getAttribute("maSinhVien");
//        if (sinhVien == null) response.sendRedirect("index.jsp"); %>
    </head>
    <body>
        <div id="header">
            <div id="h1"></div>
            <div id="h2">
                <% if (sinhVien == null) {%>
                <button id="btn_dang_nhap" onclick="window.location.href = 'Views/login.jsp'">Đăng nhập</button>
                <% } else {%>
                <span style="color: yellow; font-weight: bolder">
                    Chào bạn, <%= sinhVien.getHoTen()%>&nbsp;(<%= sinhVien.getMaSV() %>) 
                </span> <button><a style="text-decoration: none" href="/logout">Đăng xuất</a></button>
                
                <% }%>
            </div>
        </div>
        <div id="content">
            <div id="menu">
                <a class="menu-items" href="../index.jsp" >TRANG CHỦ</a>
                <a class="menu-items" href=../Views/XemDiemThi.jsp >XEM KẾT QUẢ HỌC TẬP</a> 
            </div>
            <div id="main-content" style="height: 730px; margin: 10px 20px 10px 20px; border-style: double;">
                <h2 style="padding-left: 5px"><u>Thông tin chung</u></h2>
                <h2 style="color: chocolate; padding-left: 5px">
                    THÔNG BÁO:  v/v  RÀ SOÁT THỜI KHÓA BIỂU và ĐĂNG KÝ HỌC GHÉP KỲ 2 NĂM HỌC 2019 - 2020
                </h2>
                <h3 style="padding-left: 5px"><u>Ngày 18/03/2020: </u> 
                    THÔNG BÁO v/v TIẾP NHẬN , HỖ TRỢ ĐĂNG KÝ HỌC GHÉP HỌC KỲ 2
                </h3>
                <p style="font-size: 20px; padding: 0px 0px 5px 5px">
                     Phòng Giáo vụ đã tiếp nhận, xem xét Đơn (qua e-mail đến hết ngày 20/03/2020) về việc đăng ký học ghép, 
                     điều chỉnh đăng ký các học phần học kỳ 2 năm học 2019 - 2020 và thông báo tới các Sinh viên biết kết quả xử lý cụ thể như sau: 
                </p>
                <p style="font-size: 20px; padding: 0px 0px 5px 5px">
                    <b>1- Đăng ký học ghép (học lại, học cải thiện):</b>
                    PGV chỉ hỗ trợ sinh viên trong việc mở số lượng các Nhóm học phần đến mức tối đa cho phép, 
                    chứ không thực hiện việc đăng ký hộ sinh viên. Sinh viên phải trực tiếp thực hiện thao tác đăng ký 
                    trong thời gian mở hệ thống như đã thông báo  (đến 
                    <b>24h ngày chủ nhật, 22/03/2020); </b>
                    
                </p>
                <p style="font-size: 20px; padding: 0px 0px 10px 5px">
                    <b>2- Điều chỉnh đăng ký: (bổ sung, rút bớt các học phần theo đúng tiến trình đào
                        tạo chuẩn của kỳ học)
                    </b>
                </p>
                <p style="font-size: 20px; padding: 0px 0px 0px 5px">
                    - Tất cả các trường hợp sinh viên xin rút bớt học phần sẽ được PGV giải quyết 
                    trước ngày 24/03/2020
                </p>
                <p style="font-size: 20px; padding: 0px 0px 0px 5px">
                    - Các trường hợp đăng ký bổ sung học phần đúng quy định (Bổ sung học phần còn 
                    thiếu chưa đăng ký trong Phiếu đăng ký tháng 12/2019)sẽ được PGV hỗ trợ đăng ký;
                </p>
                <p style="font-size: 20px; padding: 0px 0px 0px 5px">
                    - Các trường hợp đăng ký bổ sung không đúng quy định (Không nộp phiếu nhờ hỗ trợ 
                    xử lý lỗi đăng ký đúng thời gian trong đợt đăng ký chính thức của Khóa/ngành) 
                    sẽ không được hỗ trợ đăng ký.
                </p>
                <p style="font-size: 20px; padding: 0px 0px 10px 5px">
                    <b>
                        3- Đề nghị: 
                    </b>
                    Tất cả sinh viên rà soát lại lịch học cá nhân trên hệ thống quản lý đào tạo 
                    để chuẩn bị tham gia học tập kỳ 2 năm học theo kế hoạch Học viện đã thông báo, 
                    có vấn đề vướng mắc sinh viên liên hệ theo số điện thoại hỗ trợ của 
                    Phòng giáo vụ trước ngày 24/03/2020 để được giải đáp ( 0915 114 306).
                </p>
                <h3>Trân trọng./.</h3>
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
                    <a href="https://www.facebook.com/HocvienPTIT"><img class="contactIcon" src="res/fbb.png" style="border-radius: 5px"></a>
                    <a href="http://portal.ptit.edu.vn/"><img class="contactIcon" src="res/ptit.png"></a>
                   
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
</html>
