<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.kh.member.model.vo.Member"%>
<%
	String contextPath = request.getContextPath();

	Member loginUser = (Member)session.getAttribute("loginUser");
	
	String alertMsg = (String)session.getAttribute("alertMsg");
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Insert title here</title>
    <!--bootstrap-->
    <!-- Latest compiled and minified CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
    <!--jqurey-->
    <script
    src="https://code.jquery.com/jquery-3.7.1.min.js"
    integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
    crossorigin="anonymous"></script>
    <script
    src="https://code.jquery.com/ui/1.14.0/jquery-ui.min.js"
    integrity="sha256-Fb0zP4jE3JHqu+IBB9YktLcSjI1Zc6J2b6gTjB0LpoM="
    crossorigin="anonymous"></script>
    <style>
        a{
            text-decoration: none;
            color: black;
        }

        .login-area{
            float: right;
        }

        .login-area input[type="button"],
        .login-area input[type="submit"]{
            width: 50%;
            float: left;
        }

        .nav-area{
            background-color: black;
        }

        .menu{
            display: table-cell;
            width: 150px;
            height: 50px;
        }

        .menu a{
            color: white;
            font-size: 20px;
            font-weight: bold;
            text-align: center;
            width: 100%;
            height: 100%;
            display: block;
            line-height: 50px;
        }
    </style>
</head>
<body>
	<% if(alertMsg != null) {%>
		<script>
			alert("<%=alertMsg%>")
		</script>
		<% session.removeAttribute("alertMsg"); %>
	<%} %>
    <h1 align="center">Welcome KH World</h1>
    <div class="login-area">
        <!--로그인 전-->
        <%--if (loginUser == null){ --%>
        <c:choose>
        <c:when test="${empty loginUser }">
        <form action="<%=contextPath %>/Login.me" method="post"> <!--/jsp -> contextpath-->
            <table>
                <tr>
                    <th>아이디</th>
                    <td><input type="text" name="userId" required></td>
                </tr>
                <tr>
                    <th>비밀번호</th>
                    <td><input type="password" name="userPwd" required></td>
                </tr>
                <tr>
                    <th colspan="2">
                        <input type="submit" value="로그인">
                        <input type="button" value="회원가입" onclick="enrollPage();">
                    </th>
                </tr>
            </table>
            <script>
            	function enrollPage(){
            		//location.href = "<%=contextPath%>/views/member/memberEnrollForm.jsp";
            		//웹 애플리케이션의 디렉토리 구조가 url에 노출되면 보안에 취약
            		
            		location.href = "<%=contextPath%>/enrollForm.me";
            		//단순한 페이지 요청도 서블릿을 거쳐갈 것(즉, url에는 서블릿 매핑값만 나타나도록)
            	}
            </script>
        </form>
        </c:when>
        <c:otherwise>
        <%--} else { --%>
        
        <div>
            <b><%=loginUser.getUserName() %></b>의 방문을 환영합니다. <br><br>
        </div>
        <div>
            <a href="<%=contextPath %>/myPage.me">마이페이지</a>
            <a href="<%=contextPath %>/logout.me">로그아웃</a>
        </div>
        <%--} --%>
        </c:otherwise>
        </c:choose>
    </div>

    <br clear="both">
    <div class="nav-area">
        <div class="menu"><a href="<%=contextPath%>">HOME</a></div>
        <div class="menu"><a href="">공지사항</a></div>
        <div class="menu"><a href="<%=contextPath%>/list.bo?cpage=1">일반게시판</a></div>
        <div class="menu"><a href="<%=contextPath%>/list.th">사진게시판</a></div>
    </div>
</body>
</html>