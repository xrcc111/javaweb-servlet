<%--
  Created by IntelliJ IDEA.
  User: 徐锐
  Date: 2023/5/9
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="./WEB-INF/pages/common/taglibs.jsp" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
<style>
    .login {
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%, -50%);
    }

    .demo-login-container {
        width: 320px;
        margin: 21px auto 0;
    }

    .demo-login-other .layui-icon {
        position: relative;
        display: inline-block;
        margin: 0 2px;
        top: 2px;
        font-size: 26px;
    }
</style>
<div class="login">
    <form class="layui-form">
        <div class="demo-login-container">
            <div class="layui-form-item">
                <div class="layui-input-wrap">
                    <div class="layui-input-prefix">
                        <i class="layui-icon layui-icon-username"></i>
                    </div>
                    <input type="text" id="username" name="username" value="" lay-verify="required" placeholder="用户名"
                           lay-reqtext="请填写用户名"
                           autocomplete="off" class="layui-input" lay-affix="clear">
                </div>
            </div>
            <div class="layui-form-item">
                <div class="layui-input-wrap">
                    <div class="layui-input-prefix">
                        <i class="layui-icon layui-icon-password"></i>
                    </div>
                    <input type="password" id="password" name="password" value="" lay-verify="required" placeholder="密   码"
                           lay-reqtext="请填写密码" autocomplete="off" class="layui-input" lay-affix="eye">
                </div>
            </div>
            <div class="layui-form-item">
               <button class="layui-btn  layui-btn-fluid" id="to-login">登录</button>
            </div>
        </div>
    </form>
</div>
<script src="${ctx}/resources/js/login/index.js"></script>
</body>
</html>
