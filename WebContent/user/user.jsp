<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xml:lang="zh-CN" xmlns="http://www.w3.org/1999/xhtml" lang="zh-CN">
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8" />
<link href="/css/manage.css" media="screen" rel="stylesheet" type="text/css" />
<script src="/js/jquery-1.4.4.min.js" type="text/javascript" ></script>
</head>
<body>
	<div class="manage_container">
	<div class="manage_head">
			<div id="nav">
				<a href="/jfinal_tomcat_demo/"><b>首页</b></a>
			</div>
		</div>
		<div class="main">
<h1 align="center">User管理&nbsp;&nbsp;</h1>
<a href="/jfinal_tomcat_demo/user/add">创建User</a>
<div class="table_box">
	<table class="list" border="1">
		<tbody>
			<tr>
				<th width="4%">id</th>
				<th width="10%">姓名</th>
				<th width="35%">电子邮箱</th>
				<th width="20%">操作</th>
			</tr>
			<c:forEach items="${userList}" var="user">
			<tr>
				<td style="text-align:left;"><c:out value="${user.id}" default=""/></td>
				<td style="text-align:left;">${user.username}</td>
				<td style="text-align:left;">${user.email}</td>
				<td style="text-align:left;">
					&nbsp;&nbsp;<a href="/jfinal_tomcat_demo/user/delete/${user.id}">删除</a>
					&nbsp;&nbsp;<a href="/jfinal_tomcat_demo/user/edit/${user.id}">编辑</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
		</div>
	</div>
</body>
</html>