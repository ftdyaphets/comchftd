<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/9/29
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<!-- 模态框（Modal） -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">添加用户</h4>
            </div>
            <div class="modal-body">
                <form id="userInfoInput" class="bs-example bs-example-form" role="form">
                    <div id="nameInput" class="input-group">
                        <span class="input-group-addon">name:</span>
                        <input id="name" type="text" class="form-control">
                    </div>
                    <br>
                    <div id="passwordInput" class="input-group">
                        <span class="input-group-addon">password:</span>
                        <input id="password" type="password" class="form-control">
                    </div>
                    <br>
                    <div id="sexInput" class="input-group">
                        <span class="input-group-addon">sex:</span>
                        <input type="radio" name="optionsRadios" id="optionsRadios1" value="male" checked>male
                        <input type="radio" name="optionsRadios" id="optionsRadios2" value="female" >female
                    </div>
                    <br>
                    <div id="ageInput" class="input-group">
                        <span class="input-group-addon">age:</span>
                        <input id="age" type="text" class="form-control">
                    </div>
                    <br>
                    <div id="scoreInput" class="input-group">
                        <span class="input-group-addon">score:</span>
                        <input id="score" type="text" class="form-control">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button id="save" type="button" class="btn btn-primary">提交</button>
                <button id="cancel" type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<div class="modal fade" id="delUserModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="delUserModalLabel">删除用户</h4>
            </div>
            <div class="modal-body">
                <form id="delUserInfoInput" class="bs-example bs-example-form" role="form">
                    <div id="delUserNameInput" class="input-group">
                        <span class="input-group-addon">name:</span>
                        <input id="delUserName" type="text" class="form-control">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button id="delUserSave" type="button" class="btn btn-primary">提交</button>
                <button id="delUserCancel" type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

<div class="modal fade" id="updateUserModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="updateUserModalLabel">修改用户</h4>
            </div>
            <div class="modal-body">
                <form id="userUpdateInfoInput" class="bs-example bs-example-form" role="form">
                    <div id="updateNameInput" class="input-group">
                        <span class="input-group-addon">name:</span>
                        <input id="updateName" type="text" class="form-control">
                    </div>
                    <br>
                    <div id="updateSexInput" class="input-group">
                        <span class="input-group-addon">sex:</span>
                        <input type="radio" name="updateOptionsRadios" id="updateOptionsRadios1" value="male" checked>male
                        <input type="radio" name="updateOptionsRadios" id="updateOptionsRadios2" value="female" >female
                    </div>
                    <br>
                    <div id="updateAgeInput" class="input-group">
                        <span class="input-group-addon">age:</span>
                        <input id="updateAge" type="text" class="form-control">
                    </div>
                    <br>
                    <div id="updateScoreInput" class="input-group">
                        <span class="input-group-addon">score:</span>
                        <input id="updateScore" type="text" class="form-control">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button id="updateSave" type="button" class="btn btn-primary">提交</button>
                <button id="updateSancel" type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>

</body>
</html>
