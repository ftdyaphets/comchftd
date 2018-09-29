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
        $.ajax({
            url:'ch/addUser',
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
});