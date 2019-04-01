<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort() +request.getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
	<base href="<%=basePath %>">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>QQ注册</title>
</head>
<body>
<center>
    <table width="600px" border="1px">
        <form action="<%=basePath %>/admin/qqzhuche.do" method="post">
            <tr>
            <td>昵称:</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="psw"></td>
        </tr>
        <tr>
            <td>手机:</td>
            <td><input type="text" name="phone"></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td><input type="submit" value="注册"></td>
            <td><input type="reset" name="取消"></td>
        </tr>
        </form>
    </table>
</center>
</body>
</html>
