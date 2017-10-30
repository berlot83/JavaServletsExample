<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update your Varitech</title>
</head>

<% System.out.println("Falta completar todo"); %>

<script>
	function doAccept() {
		var frm = document.frmTakeOff;
		frm.submit();

	}
</script>

<body>
	<h1>Take Off your Varitech to your DataBase</h1>
	<form name="frmUpdate" action="/JavaServlet/VaritechUpdate" method="post">
		<table>
			<tr>
				<td><input type="hidden" name="flightHours" value="123"></input></td>
			</tr>

			<tr>
				<td><input type="hidden" name="id" value="678"></input></td>
			</tr>
			<tr>
				<td>Varitech Model:</td>
				<td><input type="text" name="model"></input></td>
			</tr>
			<tr>
				<td>Base name:</td>
				<td><input type="text" name="base"></input></td>
			</tr>
			<tr>
				<td>Autonomy:</td>
				<td><input type="number" name="autonomy"></input></td>
			</tr>
			<tr>
				<td><img alt="send" src="img/veritechButton.png"
					onclick="doAccept()" /></td>
			</tr>
		</table>
	</form>

	<br>

	<a href="index.jsp"> <--- Back ---> </a>
	<br>
	<a href="varitechAdmin.jsp"> <--- Varitech Admin Center ---> </a>

</body>
</html>>