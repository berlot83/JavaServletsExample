<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.macross.model.Varitech"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<script>
	function doAccept() {
		var frm = document.frmRetriveAllVaritech;
		frm.submit();
	}

	function doSearch() {
		var frm = document.frmDoSearch;
		frm.submit();
	}
</script>

<body>
	<h1>Varitech Admin Center</h1>
	<br>
	<br>
	<form name="frmRetriveAllVaritech" action="/JavaServlet/VaritechAdmin"
		method="post">
		<img alt="Look Available Varitech" src="img/veritechButton.png"
			onclick="doAccept()">
	</form>
	<br>
	<table>
		<thead>
			<tr>
				<td><strong>Flight Hours</strong></td>
				<td><strong>Model</strong></td>
				<td><strong>Base</strong></td>
				<td><strong>Autonomy</strong></td>
			</tr>
		</thead>
		<tbody>
			<%
				ArrayList<Varitech> vcVaritech = (ArrayList<Varitech>) request.getAttribute("vcVaritech");

				if (vcVaritech != null) {
					for (Varitech item : vcVaritech) {
						out.write("<tr>");
						out.write("<td>");
						out.print(item.getHours());
						out.write("</td>");
						out.write("<td>");
						out.write(item.getModel());
						out.write("</td>");
						out.write("<td>");
						out.write(item.getBase());
						out.write("</td>");
						out.write("<td>");
						out.print(item.getAutonomy());
						out.write("</td>");
						out.write("<tr>");
					}
				}
			%>
		</tbody>
	</table>

	<br>

	<form name="frmDoSearch" action="/JavaServlet/VaritechSearch"
		method="post">
		<table>
			<tr>
				<td>Buscar Modelo:</td>
				<td><input type="text" name="id" /></td>
				<td><img alt="Buscar Varitech" src="img/searchIcon.png"
					onclick="doSearch()" /></td>
			</tr>
		</table>

		<table>
			<thead>
				<tr>
					<td><strong>Flight Hours</strong></td>
					<td><strong>Model</strong></td>
					<td><strong>Base</strong></td>
					<td><strong>Autonomy</strong></td>
				</tr>
			</thead>
			<tbody>
				<%
					Varitech varitech = (Varitech) request.getAttribute("varitech");

					if (varitech != null) {

						out.write("<tr>");
						out.write("<td>");
						out.print(varitech.getHours());
						out.write("</td>");
						out.write("<td>");
						out.write(varitech.getModel());
						out.write("</td>");
						out.write("<td>");
						out.write(varitech.getBase());
						out.write("</td>");
						out.write("<td>");
						out.print(varitech.getAutonomy());
						out.write("</td>");
						out.write("<tr>");

					}
				%>
			</tbody>
		</table>
	</form>

	<a href="/index.jsp">Inicio</a>

</body>
</html>