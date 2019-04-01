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
   <button id="btn">提交</button>
    <script type="text/javascript">
        $("#btn").click(function () {
            $.ajax({
                url:"<%=basePath %>/admin/qqzhuche.do",
                type:"POST",
                dataType:"json",
                date:{
                    "id":"admin",
                    "psw":"123456"
                },
                success:function (rs) {
                    alert(rs)
                }
            })
        })
    </script>
</center>
</body>
</html>
