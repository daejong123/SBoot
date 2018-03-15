$(function () {
    layui.use('element', function(){
        var element = layui.element;
        element.on('nav(nav1)', function(elem){
            console.log(elem); //得到当前点击的DOM对象
        });
    });

    var local_data = [{id:1, username:"dottie", sex:"male", city:"shanghai", sign:"sgin",experience:"hello",score:100, classify:"code",wealth:"1023"}
        ,{id:2, username:"dottie2", sex:"male", city:"shanghai", sign:"sgin",experience:"hello",score:100, classify:"code",wealth:"1023"}
        ,{id:3, username:"dottie3", sex:"male", city:"shanghai", sign:"sgin",experience:"hello",score:100, classify:"code",wealth:"1023"}
        ,{id:4, username:"dottie4", sex:"male", city:"shanghai", sign:"sgin",experience:"hello",score:100, classify:"code",wealth:"1023"}
        ,{id:5, username:"dottie", sex:"male", city:"shanghai", sign:"sgin",experience:"hello",score:100, classify:"code",wealth:"1023"}
        ,{id:6, username:"dottie2", sex:"male", city:"shanghai", sign:"sgin",experience:"hello",score:100, classify:"code",wealth:"1023"}
        ,{id:7, username:"dottie3", sex:"male", city:"shanghai", sign:"sgin",experience:"hello",score:100, classify:"code",wealth:"1023"}
        ,{id:8, username:"dottie4", sex:"male", city:"shanghai", sign:"sgin",experience:"hello",score:100, classify:"code",wealth:"1023"}
        ,{id:9, username:"dottie", sex:"male", city:"shanghai", sign:"sgin",experience:"hello",score:100, classify:"code",wealth:"1023"}
        ,{id:10, username:"dottie2", sex:"male", city:"shanghai", sign:"sgin",experience:"hello",score:100, classify:"code",wealth:"1023"}
        ,{id:11, username:"dottie3", sex:"male", city:"shanghai", sign:"sgin",experience:"hello",score:100, classify:"code",wealth:"1023"}
        ,{id:12, username:"dottie4", sex:"male", city:"shanghai", sign:"sgin",experience:"hello",score:100, classify:"code",wealth:"1023"}];

    layui.use('table', function(){
        var table = layui.table;
        //第一个实例
        table.render({
            elem: '#demo'
            ,height: 500
            // ,skin: 'line' //行边框风格
            // ,even: true //开启隔行背景
            // ,size: 'sm' //小尺寸的表格 lg
            // ,url: '/demo/table/user/' //数据接口
            ,data: local_data
            ,page: true //开启分页
            ,limit: 10
            ,limits: [10, 20, 30]
            ,cols: [[ //表头
                {field: 'id', title: 'ID', width:50, sort: true, fixed: 'left'}
                ,{field: 'username', title: '用户名', width:80, event:"del"} //event事件函数
                ,{field: 'sex', title: '性别', width:80, sort: true}
                ,{field: 'city', title: '城市', width:120}
                ,{field: 'sign', title: '签名', width: 130}
                ,{field: 'experience', title: '积分', width: 80, sort: true}
                ,{field: 'score', title: '评分', width: 80, sort: true}
                ,{field: 'classify', title: '职业', width: 80}
                ,{field: 'wealth', title: '财富', width: 135, sort: true}
                ,{fixed: 'right',title: '操作', align:'center', toolbar: '#barDemo', width: 200} //绑定操作
            ]]
        });

        //table的事件
        table.on('tool(test)', function(obj){ //注：tool是工具条事件名，test是table原始容器的属性 lay-filter="对应的值"
            var data = obj.data; //获得当前行数据
            var layEvent = obj.event; //获得 lay-event 对应的值（也可以是表头的 event 参数对应的值）
            var tr = obj.tr; //获得当前行 tr 的DOM对象
            if(layEvent === 'detail'){ //查看
                //do somehing
            } else if(layEvent === 'del'){ //删除
                layer.confirm('真的删除行么', function(index){
                    obj.del(); //删除对应行（tr）的DOM结构，并更新缓存
                    layer.close(index);
                    //向服务端发送删除指令
                });
            } else if(layEvent === 'edit'){ //编辑
                //do something
                //同步更新缓存对应的值
                obj.update({
                    username: '123'
                    ,title: 'xxx'
                });
            }
        });


    });
});