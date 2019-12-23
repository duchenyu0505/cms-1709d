<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form id="editForm">
	<div class="form-group row">
		<label for="inputEmail3" class="col-sm-2 col-form-label">名称</label>
		<div class="col-sm-6">
			<input type="text" id="text" name="name" value="${me.name }" class="form-control" placeholder="请输入名称">
		</div>
	</div>
	<input type="hidden" id="id" name="id" value="${me.id }">
	<div class="form-group row">
		<div class="col-sm-10">
			<button type="button" class="btn btn-primary" onclick="save();">保存</button>
		</div>
	</div>
</form>
<div class="alert alert-danger" role="alert" style="display: none"></div>
<script type="text/javascript">
	function save(){
		var text = $("#text").val();
		var url = $("#url").val();
		if(text==null || text==""){
			$(".alert").html("名称不能为空");
			$(".alert").show();
			return;
		}
		//封装form表单
		var formData = $("#editForm").serialize();
		alert(formData)
		$.post("/admin/me/save",formData,function(res){
			console.log(res);
			reload();
		})
	}
</script>