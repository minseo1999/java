<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body onload="init()">
	<jsp:include page="common/header.jsp"/>
	<div class="content">
		<br><br>

		<div class="innerOuter">
			<h4>게시글 TOP5</h4>
			<br>
			<table id="boardList" class="table table-hover" align="center">
				<thead>
					<tr>
						<th>글번호</th>
						<th>제목</th>
						<th>작성자</th>
						<th>작성일</th>
						<th>첨부파일</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td colspan="6" rowspan="4" align="center"><div class="spinner-border"></div></td>
					</tr>
				</tbody>
			</table>
		</div>
	</div>
	<script>
		function init(){
			//5개 가져와서 보여주기
			getTopBoardList(boardList)
			console.log(boardList)
			drawTopListBody(document.querySelector("#boardList > tbody"), boardList)
		}

		function drawTopListBody(parant, boardList){
			$(parant).empty();

			for(const b of boardList){
				const tr = document.createElement("tr");
				tr.innerHTML = "<td>" + b.boardNo + "</td>"
							 + "<td>" + b.boardTitle + "</td>"
							 + "<td>" + b.boardWriter + "</td>"
							 + "<td>" + b.count + "</td>"
							 + "<td>" + b.createDate + "</td>"
							 + "<td>" + (b.originName != null ? "*" : "") + "</td>";
				parant.appendChild(tr);

				tr.onclick = function(){
					location.href = "detail.bo?bno =" + b.boardNo;
				}
			}
		}

		function getTopBoardList(callback){
			$.ajax({
				url: "topList.bo",
				success: callback,
				error: function(){
					console.log("ajax top5 실패")
				}
			})
		}
	</script>
	<jsp:include page="common/footer.jsp"/>
</body>
</html>