<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="../common/common.jsp" %>

<style type="text/css">

.err{
	font-size :9px;
	font-weight : bold;
	color : red;
}

</style>

travelInsertForm.jsp<br>
<form:form commandName="travel" method="post" action="insert.tv">
	<h1><span>여행 정보 등록 화면</span></h1>
	<p>
		<label for="name">이름</label>
		<input type="text" name="name" value="${travel.name }">
		<form:errors class="err" path="name"/>
	</p>

	<p>
		<label for="age">나이</label>
		<input type="text" name="age" value="${travel.age }">
		<form:errors class="err" path="age"/>
	</p>
	<p>
		<label for="area">관심지역</label>

		<input type="checkbox" name="area" value="유럽"<c:if test="${fn:contains(travel.area,'유럽') }">checked></c:if>>유럽
		<input type="checkbox" name="area" value="동남아"<c:if test="${fn:contains(travel.area,'동남아') }">checked</c:if>>동남아
		<input type="checkbox" name="area" value="일본"<c:if test="${fn:contains(travel.area,'일본') }">checked</c:if>>일본
		<input type="checkbox" name="area" value="중국"<c:if test="${fn:contains(travel.area,'중국') }">checked</c:if>>중국
		<form:errors class="err" path="area"/>
	</p>
	
	<p>
		<label for="style">여행 타입</label>
		<input type="radio" name="style"  value="패키지" <c:if test="${travel.style eq '패키지' }">checked</c:if>>패키지
		<input type="radio" name="style"  value="크루즈" <c:if test="${travel.style eq '크루즈' }">checked</c:if>>크루즈
		<input type="radio" name="style"  value="자유여행" <c:if test="${travel.style eq '자유여행' }">checked</c:if>>자유여행
		<input type="radio" name="style"  value="골프여행" <c:if test="${travel.style eq '골프여행' }">checked</c:if>>골프여행
		<form:errors class="err" path="style"/>
	</p>
	
	 <p>
		<label for="price">가격</label>
		<select name = "price">
			<option value="">선택하세요</option><!--  value는 비워둔다.  -->
			<option value="100~200" <c:if test="${travel.price eq '100~200' }">selected</c:if>>100~200</option>
			<option value="200~300" <c:if test="${travel.price eq '200~300' }">selected</c:if>>200~300</option>
			<option value="300~400" <c:if test="${travel.price eq '300~400' }">selected</c:if>>300~400</option>
			<option value="400~500" <c:if test="${travel.price eq '400~500' }">selected</c:if>>400~500</option>
		</select>
		<form:errors cssClass="err" path="price"></form:errors>
	</p>
	<p>
			<input type="submit" value="추가하기" >		
	</p>
</form:form>
