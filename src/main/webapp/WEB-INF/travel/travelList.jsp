<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/common.jsp"%>

travelList.jsp
<br>

<center>
	<h1>
		<span>여행 리스트 화면</span>
	</h1>
	<!-- submit누르면 list.tv요청된다.whatColumn,keyword 넘겨 Listcontroller로이동 -->
<form action="list.tv" method="get"> 
	<select name="whatColumn"> 
		<option value="">전체검색</option>
		<option value="area">관심지역</option>
		<option value="style">여행타입</option>
	</select>
	<input type="text" name="keyword" value="유럽">
	<input type="submit" value="검색">
</form>
	<table border="1">
		<tr>
			<td colspan="8" align="right">
			<input type="button" value="추가하기"	onclick="insert()" /></td>
		</tr>

		<tr>
			<td>번호</td>
			<td>이름</td>
			<td>나이</td>
			<td>관심지역</td>
			<td>여행타입</td>
			<td>예상비용</td>
			<td>삭제</td>
			<td>수정</td>
		</tr>
		
		<c:forEach var="t" items="${lists }">
			<tr>
				<td>${t.num }</td>
				<td>${t.name }</td>
				<td>${t.age }</td>
				<td>${t.area }</td>
				<td>${t.style }</td>
				<td>${t.price }</td>
				<td><a href="">삭제</a></td>
				<td><input type="button" value="수정" /></td>
			</tr>
		</c:forEach>
	</table>
</center>