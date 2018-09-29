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
        $('#save').unbind().bind('click',function(){
            var name = $('#name').val();
            var password = $('#password').val();
            $('#myModal').modal('hide');
            $.ajax({
                url:'ch/addUser',
                type:'get',
                data:{
                    name:name,
                    password:password
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
});