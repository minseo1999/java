<%@page import="com.kh.board.model.vo.Attachment"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.kh.board.model.vo.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
   
<%
    Board b = (Board)request.getAttribute("board");

	ArrayList<Attachment> list = (ArrayList<Attachment>)request.getAttribute("list");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<style>
    .outer{
        background: black;
        color: white;
        width: 1000px;
        margin: auto;
        margin-top: 50px;
        padding: 10px 0 50px 0px;
    }

    .outer table{
        border: 1px solid white;
        border-collapse: collapse;
    }
    .outer > table tr, .outer > table td{
        border: 1px solid white;
    }
    .outer > form input, .outer > form textarea{
        width: 100%;
        box-sizing: border-box;
    }
    
    .outer img:hover{
    	cursor: pointer;
        background: gray;
    }
</style>

</head>
<body>

    <%@ include file="../common/menubar.jsp" %>
    <div class="outer">
        <br>
        <h2 align="center">사진게시글 작성하기</h2>
        <br>
        <input type="hidden" name="userName" value="<%=loginUser.getUserNo()%>">
        <table border="1" align="center">         
            <tr>
                <th width="100">제목</th>
                <td colspan="3">
                    <%=b.getBoardTitle() %>
                </td>
            </tr>
            <tr>
                <th>작성자</th>
                <td><%=b.getBoardWriter() %></td>
                <th>작성일</th>
                <td><%=b.getCreateDate() %></td>
            </tr>
            <tr></tr>
                <th>내용</th>
                <td colspan="3">
                    <p><%=b.getBoardContent() %></p>
                </td>
            </tr>
            <tr>
    <th>대표이미지</th>
    <td colspan="3">
        <img width="250" height="170" src="<%=contextPath%>/${list[0].filePath}${list[0].changeName}">
    </td>
</tr>
<tr>
    <th>상세이미지</th>
    <c:forEach var="attachment" items="${list}" varStatus="status">
        <c:if test="${!status.first}">
            <td>
                <img width="150" height="120" src="<%=contextPath%>/${attachment.filePath}${attachment.changeName}">
            </td>
        </c:if>
    </c:forEach>
</tr>

        </table>
        
        <div style="display: none;">
            <input type="file" name="file1" id="file1" required onchange="loadImg(this, 1)">
            <input type="file" name="file2" id="file2" onchange="loadImg(this, 2)">
            <input type="file" name="file3" id="file3" onchange="loadImg(this, 3)">
            <input type="file" name="file4" id="file4" onchange="loadImg(this, 4)">
        </div>


        <br>
        
        <div align="center">
            <a href="<%=contextPath%>/list.th" class="btn btn-sm btn-secondary">목록가기</a>
        </div>
    </div>
</body>
</html>