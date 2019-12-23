<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<form class="form-inline">
	  <div class="form-group mx-sm-3 mb-2">
	    <input type="text" name="name" value="${me.name }" class="form-control" placeholder="请输入名称">
	  </div>
	  <input type="hidden" name="pageNum" value="${pageInfo.pageNum }">
	  <button type="button" class="btn btn-primary mb-2" onclick="query()">查询</button>
	</form>
<table class="table">
	<thead>
		<tr>
			<th><input type="checkbox" id="chkAll"></th>
			<th scope="col">id</th>
			<th scope="col">姓名</th>
			<th scope="col">操作</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${pageInfo.list }" var="item">
			<tr>
				<th><input type="checkbox" value="${item.id }" name="chk_list"> </th>
				 <th scope="row">${item.id }</th>
				  <th>${item.name }</th>
				 <th>
				 	<input type="hidden" name="delId" id="delId">
				 	<button type="button" class="btn btn-primary" onclick="del('${item.id}')">删除</button>
				 	<button type="button" class="btn btn-primary" onclick="edit('${item.id}')">编辑</button>
				 </th>
			</tr>
		</c:forEach>
	</tbody>
</table>
<button onclick="batchDel()">批删</button>
<button onclick="add()">添加</button>
<!-- 分页 -->
<jsp:include page="../common/page.jsp"></jsp:include>
<script src="/public/js/checkbox.js"></script>
<script>
	var delId=null;
	
	//添加
	function add() {
		openPage("me/edit");
	}
	
	//修改
	function edit(id) {
		openPage("me/edit?id="+id);
	}
	
	//分页
	function gotoPage(pageNo) {
		$("[name=pageNum]").val(pageNo);
		query();
	}
	
	//删除提示
	function del() {
		var ids=getCheckboxIds();
		if(confirm("你确定删除吗id为"+ids+"？")){
			if(ids=""){
				$(".alert").html("请选择删除的记录");
				$(".alert").show();
				return;
				
			}
		
		}
		
	}
	
	//批量删除
	function batchDel() {
		var ids=getCheckboxIds();
		concole.log(ids);
		if(confirm("你确定要删除吗？")){
			$.post("/admin/me/delByIds",{ids:ids},function(res){
				if(res){
					alert("删除成功");
					reload();
				}else{
					alert("删除失败");
				}
				
			})
		}
		
	}
	
	//查询
	function query() {
		var params=$("form").serialize();
		reload(params);
	}
</script>