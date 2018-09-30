<%@include file="view/bootstrapModal.jsp"%>
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
            var sex=$('input:radio:checked');
            //var sex=$('.radio-inline:input:checked');
            $('input:radio').
            sex.blur(function(){
                alert(sex.val());
            });
            */
            /*
            var sex;
            $(':radio').click(function(){
                sex=$(this).val();
                alert(sex);
            });
            */

        });
    </script>
</head>
<body>
<h2>Hello World!</h2>
<span id="btnGet" class="btn btn-primary">getData</span>
<span id="btnClear" class="btn btn-danger">clear</span>
<p id="content"></p>
<span id="btnAdd" class="btn btn-success">addUser</span>
<span id="btnDel" class="btn btn-danger">delUser</span>
<span id="btnUpdate" class="btn btn-primary">updateUser</span>
<!--
        <input type="radio" name="optionsRadios" id="options1" value="male" checked>male
        <input type="radio" name="optionsRadios" id="options2" value="female" >female
-->

</body>
</html>
