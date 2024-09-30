<%@page import="com.kh.board.model.vo.Board"%>
<%@page import="com.kh.board.model.vo.Attachment"%>
<%@page import="com.kh.board.model.vo.Category"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ArrayList<Category> list = (ArrayList<Category>)request.getAttribute("list");

	Board b  = (Board)request.getAttribute("b");
	
	Attachment at = (Attachment)request.getAttribute("at");
    //null이거나
    //있으면 파일번호, 원본명, 수정명, 파일경로
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
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
            }

            .outer > form input, .outer > form textarea{
                width: 100%;
                box-sizing: border-box;
            }
        </style>
    </head>
    <body>
        <%@ include file="../common/menubar.jsp"%>
        <div class="outer">
            <br>
            <h2 align="center">일반게시글 수정하기</h2>
            <br>
            <form id="updateForm" action="<%=contextPath%>/update.bo" method="post" enctype="multipart/form-data">
                <input type="hidden" name="boardNo" value="<%=b.getBoardNo()%>">
                <table border="1" align="center">
                    <tr>
                        <th width="70">카테고리</th>
                        <td width="500">
                            <select name="Category">
                                <% for(Category c : list) { %>
                                	<option value="<%=c.getCategoryNo() %>"><%=c.getCategoryName() %></option>
                                <% } %>
                            </select>
                            <script>
                                const opList = document.querySelectorAll("#updateForm");
                                for(let opt of opList){
                                    if(opt.innerText === "<%=b.getCategoryNo()%>"){
                                        opt.selected = true;
                                    }
                                }
                            </script>
                        </td>
                    </tr>
                    <tr>
                        <th width="70">제목</th>
                        <td width="350">
                            <input type="text" name="title" required value="<%=b.getBoardTitle()%>"> 
                        </td>
                    </tr>
                    <tr>
                        <th>내용</th>
                        <td colspan="3">
                            <textarea name="content" style="resize: none;" rows="10"><%=b.getBoardContent()%></textarea>
                        </td>
                    </tr>
                    <tr>
                        <th>첨부파일</th>
                        <td colspan="3">
                            <% if(at != null){ %>
                                <%=at.getOriginName()%>
                                <input type="hidden" name="originFileNo" value="<%=at.getFile_no()%>">
                            <% } %>
                            <input type="file" name="upfile">
                        </td>
                    </tr>
                </table>
              	<div align="center">
                	<button type="submit">작성하기</button>
                	<button type="reset">취소하기</button>
            	</div>
            </form>
            <br>
    
            
        </div>
    </body>
</html>