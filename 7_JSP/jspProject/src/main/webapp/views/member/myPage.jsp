<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Document</title>

<style>
    .outer{
        background-color: black;
        color: white;
        width: 1000px;
        margin: auto;
        margin-top: 50px;
        padding: 20px 0px 50px;
    }

    table{
        margin: auto;
    }
</style>
</head>
<body>
    <%@include file="../common/menubar.jsp"%>
    <%
        String userId = loginUser.getUserId();
        String userName = loginUser.getUserName();
        String phone = loginUser.getPhone() == null ? "" : loginUser.getPhone();
        String email = loginUser.getEmail() == null ? "" : loginUser.getEmail();
        String address = loginUser.getAddress() == null ? "" : loginUser.getAddress();
        String interest = loginUser.getInterest() == null ? "" : loginUser.getInterest();
    %>



<div class="outer">
    <br>
    <h2 align="center">마이페이지</h2>
    <form action="<%=contextPath %>/insert.me" method="post" id="update-form">
    	<input type="hidden" name="userId" value="<%=userId%>"></input>
        <table>
            <tr>
                <td>* 아이디</td>
                <td><input type="text" name="userId" maxlength="12" value="<%=userId%>" readonly></td>
            </tr>
            <tr>
                <td>* 이름</td>
                <td><input type="text" name="userName" maxlength="6" value="<%=userName%>" readonly></td>
                <td></td>
            </tr>
            <tr></tr>
                <td>전화번호</td>
                <td><input type="text" name="phone" placeholder="- 포함 입력" value="<%=phone%>"></td>
                <td></td>
            </tr>
            <tr>
                <td>이메일</td>
                <td><input type="text" name="email" value="<%=email%>"></td>
                <td></td>
            </tr>
            <tr>
                <td>주소</td>
                <td><input type="text" name="address" value="<%=address%>"></td>
                <td></td>
            </tr>
            <tr>
                <td>관심분야</td>
                <td colspan="1">
                    <label>
                        <input type="checkbox" name="interest" value="운동">
                        운동
                    </label>
                    <label>
                        <input type="checkbox" name="interest" value="등산">
                        등산
                    </label>
                    <label>
                        <input type="checkbox" name="interest" value="낚시">
                        낚시
                    </label>
                    <br>
                    <label>
                        <input type="checkbox" name="interest" value="요리">
                        요리
                    </label>
                    <label>
                        <input type="checkbox" name="interest" value="게임">
                        게임
                    </label>
                    <label>
                        <input type="checkbox" name="interest" value="영화">
                        영화
                    </label>
                    <label>
                        <input type="checkbox" name="interest" value="기타">
                        기타
                    </label>
                </td>
            </tr>
        </table>
        
        <script>
        	const interest = "<%=interest%>";
        	const inputArr = document.querySelectorAll("input[name=interest]");
        	
        	for(let input of inputArr){
        		if(interest.includes(input.value)){
        			input.checked = true;
        		}
        	}
        </script>
        <br><br>
        <div align="center">
            <button type="submit" class="btn btn-secondary" onclick="<%=contextPath%>/update.me">정보 변경</button>
            <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#update-pwd-Modal">비밀번호 변경</button>
            <button type="button" class="btn btn-sm btn-danger" data-bs-toggle="modal" data-bs-target="#delete-Modal">회원탈퇴</button>
        </div>
    </form>
</div>
<div class="container mt-3">
  </div>
  
  <!-- 비밀번호 변경 -->
  <div class="modal" id="update-pwd-Modal">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
  
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">비밀번호 변경</h4>
          <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
        </div>
  
        <!-- Modal body -->
        <div class="modal-body" align="center">
          <form action="<%=contextPath%>/updatePwd.me">
            <input type="hidden" name="userId" value="<%=userId%>">
            <table>
                <tr>
                    <td>현재 비밀번호</td>
                    <td><input type="password" name="userPwd" required></td>
                </tr>
                <tr>
                    <td>변경할 비밀번호</td>
                    <td><input type="password" name="updatePwd" required></td>
                </tr>
                <tr>
                    <td>변경할 비밀번호 확인</td>
                    <td><input type="password" name="checkPwd" required></td>
                </tr>
            </table>
            <br>
            <button type="submit" class="btn btn-sm btn-secondary" id="edit-pwd-btn">
                비밀번호 변경
            </button>
          </form>
        </div>
      </div>
    </div>
  </div>
  
  <div class="container mt-3">
  </div>
  
  <!-- 회원 탈퇴-->
  <div class="modal" id="delete-Modal">
    <div class="modal-dialog modal-dialog-centered">
      <div class="modal-content">
  
        <!-- Modal Header -->
        <div class="modal-header">
          <h4 class="modal-title">회원 탈퇴</h4>
          <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
        </div>
  
        <!-- Modal body -->
        <div class="modal-body" align="center">
          <form action="<%=contextPath%>/delete.me" method="post">
          	<b>
          		탈퇴 후 복구가 불가능합니다.<br>
          		정말 탈퇴하시겠습니까?
          	</b>
          	<br><br>
            <input type="hidden" name="userId" value="<%=userId%>">
            비밀번호 : <input type="password" name="userPwd" required>
            <br>
            	<button type="submit" class="btn btn-sm btn-danger" >
	        		탈퇴하기
	        	</button>
          </form>
        </div>
      </div>
    </div>
  </div>

<script>
    document.getElementById("edit-pwd-btn").onclick = function(){
        const pwd = document.querySelector("input[name=updatePwd]").value
        const pwdCheck = document.querySelector("input[name=checkPwd]").value

        if(pwd !== pwdCheck){
            alert("비밀번호가 일치하지 않습니다.")
            return false
        }else{
            
        }
    }
</script>
</body>
</html>