layui.use('element', function() {
	var element = layui.element;

});

$(function() {
	// 监听导航栏收缩
	$('#myToggle').on('click', function() {
		if (localStorage.log == 0) {
			navShow(500);
		} else {
			navHide(500);
		}
	});

	$(".navItem").eq(0).addClass("layui-nav-itemed");

	$('.rightmenu').parents().click(function() {
		$('.rightmenu').hide();
	});

	/*主题颜色切换*/
	$("#nac dd").click(function() {
		var href = $(this).attr("color-href");
		setStyleSheet(href);

		$("#titlebg").html($(this).text())
		$(".navc").hide();
	});

	/*顶部菜单操作部分*/
	layui.use('layer', function() {
		var layer = layui.layer;

		$("#nac1 dd").click(function() {
			var ty = $(this).attr("ty");
			if (ty == "self") {
				layer.open({
					type: 2,
					title: '个人中心信息',
					area: ['860px', '550px'],
					content: 'html_assist/self.html',
					anim: 2,
					btnAlign: 'c',
					maxmin: true
				})
			} else if (ty == "pwd") {
				layer.open({
					type: 2,
					title: '个人密码',
					area: ['780px', '350px'],
					content: 'html_assist/modifyPwd.html',
					anim: 2,
					btnAlign: 'c',
					maxmin: true
				})
			} else if (ty == "logout") {
				alert("注销了！！！")
			}
		})
	})

	//右菜单点击事件
	$(".rightmenu li").on("click", function() {

		var dt = $(this).attr("data-type");
		var index = parseInt($(this).parent().attr("index"));
		switch (dt) {
			case "closethis": //关闭当前，如果开始了tab可关闭，实际意义不大
				if ($(".layLoading:nth-of-type(" + (index + 1) + ")").hasClass('layui-this')) {
					var ty = $(".layLoading:nth-of-type(" + (index + 1) + ")").prev().attr("lay-html");
					$(".layLoading:nth-of-type(" + (index + 1) + ")").prev().addClass("layui-this");
					$("#iframe").attr("src", ty);
				}
				$(".layLoading:nth-of-type(" + (index + 1) + ")").hide();
				break;
			case "closeall": //关闭所有
				var ty = $(".layLoading:nth-of-type(1)").attr("lay-html");
				$(".layLoading:nth-of-type(1)").addClass("layui-this");
				$("#iframe").attr("src", ty);
				$(".layLoading:nth-of-type(n+2)").hide();

				break;
			case "closeothers": //关闭非当前

				var ty = $(".layLoading:nth-of-type(" + (index + 1) + ")").attr("lay-html");
				$(".layLoading:nth-of-type(" + (index + 1) + ")").addClass("layui-this");
				$("#iframe").attr("src", ty);
				$(".layLoading:nth-of-type(" + (index + 1) + ")").siblings(".layLoading:nth-of-type(n+2)").hide();

				break;
			case "closeleft": //关闭左侧全部
				if ($(".layLoading:lt(" + index + ")").hasClass('layui-this')) {
					var ty = $(".layLoading:nth-of-type(1)").attr("lay-html");
					$(".layLoading:nth-of-type(1)").addClass("layui-this");
					$("#iframe").attr("src", ty);
				}
				$(".layLoading:gt(0):lt(" + (index - 1) + ")").hide();

				break;
			case "closeright": //关闭右侧全部

				if ($(".layLoading:gt(" + (index - 1) + ")").hasClass('layui-this')) {
					var ty = $(".layLoading:nth-of-type(" + (index + 1) + ")").attr("lay-html");
					$(".layLoading:nth-of-type(" + (index + 1) + ")").addClass("layui-this");
					$("#iframe").attr("src", ty);
				}
				$(".layLoading:gt(" + index + ")").hide();

				break;

			default:
				$('.rightmenu').hide();

		}
		$('.rightmenu').hide();
	})
})

/*vue数据绑定*/
var vm = new Vue({
	el: "#sec",
	data: {
		leftNavs: [],
		colors: []
	},

	methods: {
		myclick: function(e) {
			var tp = $(e.target).find(".leftNav_href").val();
			var pd = true;
			var tid = $(e.target).find(".leftNav_id").val();

			$("#layuiTab").children().each(function() {
				$(this).removeClass("layui-this");
			})

			$("#layuiTab").children().each(function() {
				if ($(this).attr("lay-id") == tid) {
					$(this).addClass("layui-this");
					$(this).show();
					pd = false;
				}
			})
			if (pd) {
				var li = "<li class='layui-this layLoading' lay-id='" + tid + "' lay-html='" + tp + "'><span class='colors'>" +
					"<i class='layui-icon colors'>&#xe638;</i>" + $(e.target).find(".leftNav_name").val() + "</span>" +
					"<i class='layui-icon layui-unselect layui-tab-close tabClose'>ဆ</i></li>";

				$("#layuiTab").append($(li));
			}


			/*计算选项卡长度溢出
			 * var allwidth= $("#layuiTab").width()+300;
				var temp=0;
				$.each($("#layuiTab .layLoading"), function() {
					temp+=$(this).width();
				});
				if(allwidth<temp){
					
				}else{
				
				}
				*/
			$("#iframe").attr("src", tp)
		}
	},
	created: function() {
		//菜单数据源   menuJson.js
		this.leftNavs = convert(leftNav);
		//颜色数据源   colorCss.js
		this.colors = colors;
	}
});

$(document).on("click", ".tabClose", function(event) {
	//防止事件向上传递
	event.stopImmediatePropagation(); //IE
	event.stopPropagation();
	$("#layuiTab").children().each(function() {

		$(this).removeClass("layui-this");
	})
	$(this).parent().prev().addClass("layui-this");
	var ty = $(this).parent().prev().attr("lay-html");
	$("#iframe").attr("src", ty);
	$(this).parent().hide();
})

$(document).on("click", ".layLoading", function() {

	$(this).addClass("layui-this");
	var ty = $(this).attr("lay-html");
	$("#iframe").attr("src", ty);
})

//屏蔽Tab右键菜单
$(document).on('contextmenu', '.layLoading', function() {
	return false;
})

$(document).on("contextmenu", ".layLoading:nth-of-type(n+2)", function(e) {

	var popupmenu = $(".rightmenu");
	popupmenu.attr("index", $(this).index())
	l = ($(document).width() - e.clientX) < popupmenu.width() ? (e.clientX - popupmenu.width()) : e.clientX;
	t = ($(document).height() - e.clientY) < popupmenu.height() ? (e.clientY - popupmenu.height()) : e.clientY;
	popupmenu.css({
		left: l,
		top: t
	}).show();
	return false;
})
