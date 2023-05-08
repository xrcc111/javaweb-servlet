<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<%
    for (int i = 0; i < 10; i++) {
       out.write("<li>"+ i+"</li>");
    }
%>

<%=100+200%>

<script>
    function getName() {
        console.log("何华----------------")
    }
    getName()
</script>

<%--
jsp 语法总结
1.<%%>  翻译到service方法内部，里面是一条一条的java语句
2.<%!%> 翻译到service方法之外
3.<%=%> 翻译到方法体内部,可作为拼接或者输出
4. <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
设置响应内容
--%>
