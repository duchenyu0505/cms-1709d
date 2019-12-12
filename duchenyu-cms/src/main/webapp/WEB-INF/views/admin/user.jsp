<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  	<form class="form-inline">
	  <div class="form-group mx-sm-3 mb-2">
	    <input type="text" name="name" class="form-control" placeholder="请输入登录名">
	  </div>
	  <div class="form-group mx-sm-3 mb-2">
	    <input type="text" name="nickname" class="form-control" placeholder="请输入昵称">
	  </div>
	  <input type="hidden" name="pageNum">
	  <button type="button" class="btn btn-primary mb-2" onclick="query()">查询</button>
	</form>
  
  	<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">登录名称</th>
      <th scope="col">用户昵称</th>
      <th scope="col">是否禁用</th>
      <th scope="col">操作</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${pageInfo.list }" var="u">
    	<tr>
    		<th scope="row">${u.id }</th>
    		<td>${u.username }</td>
    		<td>${u.nickname }</td>
    		<td>
				${u.locked==1?'禁用':'启用' }
    		</td>
    		<td>
    			<c:if test="${u.locked==0 }">
    				<button type="button" class="btn btn-primary" onclick="locked(${u.id})">禁用</button>
    			</c:if>
    			<c:if test="${u.locked==1 }">
    				<button type="button" class="btn btn-primary" onclick="unlocked(${u.id})">启用</button>
    			</c:if>
    		</td>
    	</tr>
    </c:forEach>
  </tbody>
</table>
<jsp:include page="../common/page.jsp"></jsp:include>

<script>

	function locked(id) {
		$.post('/admin/user/locked',{userId:id},function(flag){
			if(flag){
				reload();
			}
		})
	}
	
	function unlocked(id) {
		$.post('/admin/user/unlocked',{userId:id},function(flag){
			if(flag){
				reload();
			}
		})
	}
	
	function gotoPage(pageNo) {
		$("[name=pageNum]").val(pageNo);
		concole.log(pageNo);
		query();
	}
	
	function query(){
		var params = $("form").serialize();
		reload(params);
	}
</script>