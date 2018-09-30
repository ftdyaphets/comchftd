$(document).ready(function(){
    $('#btnGet').bind('click',function(){
        $.ajax({
            url:'ch/getAllUsers',
            type:'get',
            success:function(data){
                //alert('get data success!');
                $('#content').html(data);
            },
            error:function(){
                alert('get data error');
            }
        });
    });

    $('#btnClear').unbind().bind('click',function(){
        $('#content').text('');
    });



    $('#btnAdd').bind('click',function(){
        $('#myModal').modal('show');
        $('#userInfoInput input').val('');
        var sex;
        $('#sexInput input:radio').click(function(){
            sex=$(this).val();
            alert("select"+sex);
        });
        $('#save').unbind().bind('click',function(){
            var name = $('#name').val();
            var password = $('#password').val();
            //var sex = $('#sexInput input:radio:checked').val();
            alert(sex);
            var age = $('#age').val();
            var score = $('#score').val();
            $('#myModal').modal('hide');
            $.ajax({
                url:'ch/addUser',
                type:'get',
                data:{
                    name:name,
                    password:password,
                    sex:sex,
                    age:age,
                    score:score
                },
                success:function(data){
                    //alert('get data success!');
                    $('#content').html(data);
                },
                error:function(){
                    alert('get data error');
                }
            });
        });
    });

    $('#btnDel').unbind().bind('click',function(){
        $('#delUserModal').modal('show');
        $('#delUserInfoInput input').val('');
        $('#delUserSave').unbind().bind('click',function(){
            var name = $('#delUserName').val();
            $('#delUserModal').modal('hide');
            $.ajax({
                url:'ch/delUser',
                type:'get',
                data:{
                    name:name,
                },
                success:function(data){
                    //alert('get data success!');
                    $('#content').html(data);
                },
                error:function(){
                    alert('get data error');
                }
            });
        });
    });

    $('#btnUpdate').bind('click',function(){
        $('#updateUserModal').modal('show');
        $('#userUpdateInfoInput input').val('');
        $('#updateName').blur(function(){
            var name = $('#updateName').val();
            $.ajax({
                url:'ch/getUser',
                type:'get',
                data:{
                    name:name,
                },
                success:function(data){
                    var userInfo = JSON.parse(data);
                    if(userInfo.sex=='female'){
                        $('#updateSexInput input:radio').eq(0).attr('checked',false);
                        $('#updateSexInput input:radio').eq(1).attr('checked',true);
                    }else{
                        $('#updateSexInput input:radio').eq(0).attr('checked',true);
                        $('#updateSexInput input:radio').eq(1).attr('checked',false);
                    }
                    $('#updateAge').val(userInfo.age);
                    $('#updateScore').val(userInfo.score);

                    $('#updateSave').unbind().bind('click',function(){
                        var updateName = $('#updateName').val();
                        var updateSex = $('#updateSexInput input:radio:checked').val();
                        var updateAge = $('#updateAge').val();
                        var updateScore = $('#updateScore').val();
                        $('#updateUserModal').modal('hide');
                        $.ajax({
                            url:'ch/updateUser',
                            type:'get',
                            data:{
                                name:updateName,
                                sex:updateSex,
                                age:updateAge,
                                score:updateScore
                            },
                            success:function(data){
                                //alert('get data success!');
                                $('#content').html(data);
                            },
                            error:function(){
                                alert('get data error');
                            }
                        });
                    });

                },
                error:function(){
                    alert('get data error');
                }
            });
        });

        /*
        $('#save').unbind().bind('click',function(){
            var name = $('#name').val();
            var sex = $('#sexInput input:radio:checked').val();
            var age = $('#age').val();
            var score = $('#score').val();
            $('#myModal').modal('hide');
            $.ajax({
                url:'ch/addUser',
                type:'get',
                data:{
                    name:name,
                    sex:sex,
                    age:age,
                    score:score
                },
                success:function(data){
                    //alert('get data success!');
                    $('#content').html(data);
                },
                error:function(){
                    alert('get data error');
                }
            });
        });
        */
    });

});