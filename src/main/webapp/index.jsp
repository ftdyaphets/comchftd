<%@include file="view/bootstrapModal.jsp"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <link href="//static.yovole.com/bootstrap/css/bootstrap.css" rel="stylesheet">
    <link href="css/index.css" rel="stylesheet">

    <script src="//static.yovole.com/yv/js/libs/jquery-1.11.1.min.js?v=2017121309"></script>
    <script src="//static.yovole.com/bootstrap/js/bootstrap.min.js?v=2017121309"></script>
    <script src="js/index.js"></script> <!--路径写成 ../js/index.js也能找得到-->

    <script type="text/javascript">
        $(document).ready(function(){
            /*
            $('#test input:radio').on('change',function(){
                var op=$(this);
                console.log(this);
                console.log(this.value);
            });

            $('#op1').bind('click',function(){
                $('#test input:radio').eq(0).prop('checked',true);
                $('#test input:radio').eq(1).prop('checked',false);
                console.log($('#test input:radio:checked').val());
            });

            $('#op2').bind('click',function(){
                $('#test input:radio').eq(0).prop('checked',false);
                $('#test input:radio').eq(1).prop('checked',true);
                console.log($('#test input:radio:checked').val());
            });
            */

        });
    </script>
</head>
<body>
<h2>User Management</h2>
<span id="btnGet" class="btn btn-primary">getData</span>
<span id="btnClear" class="btn btn-danger">clear</span>
<p id="content">中文测试</p>
<span id="btnAdd" class="btn btn-success">addUser</span>
<span id="btnDel" class="btn btn-danger">delUser</span>
<span id="btnUpdate" class="btn btn-primary">updateUser</span>
<!--
<div id="test" class="input-group">
    <span class="input-group-addon">sex:</span>
    <input type="radio" name="optionsRadios" id="test1" value="male" checked>male
    <input type="radio" name="optionsRadios" id="test2" value="female" >female
    <span id="op1" class="btn btn-primary" style="margin-left:20px;">male</span>
    <span id="op2" class="btn btn-primary" style="margin-left:20px;">female</span>
</div>
-->
</body>
</html>
