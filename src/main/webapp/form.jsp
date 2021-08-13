<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>フォーム入力画面</title>
</head>
<body>
	<form action="/example/Form" method="post">
		<label for="name">名前:</label>
		<input type="text" name="name" id="name">
		<p>性別:</p>
		<label for="man">男</label>
		<input type="radio" name="gender" value="0" id="man">
		<label for="woman">女</label>
		<input type="radio" name="gender" value="1" id="woman"><br>
		<input type="submit" value="登録">
	</form>
	
</body>
</html>