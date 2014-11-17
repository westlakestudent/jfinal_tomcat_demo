<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<fieldset class="solid">
	<legend>创建User</legend>
	<input type="hidden" name="user.id" value="${user.id}" />
	<div>
		<label>姓名</label>
		<input type="text" name="user.username"  value="${user.username}" />${username}
	</div>
	<div>
		<label>邮箱</label>
		<input type="text" name="user.email" value="${user.email}" />${email}
	</div>
	<div>
		<label>&nbsp;</label>
		<input value="提交" type="submit">
	</div>
</fieldset>