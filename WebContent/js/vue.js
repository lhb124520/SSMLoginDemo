new Vue({
	el: '#example1',
	data: {
		ip: '',
		port: '',
		UserID: '',
		password: ''
	},
	methods: {
		onclick: function(event) {
			var url1 = "http://192.168.8.35:8889/LoginDemo/login";	
			var user={name:'hh',password:'123'};
			var params = {"UserID":$("#UserID").val(),"Password":$("#password").val()};
			alert("提交的数据：" + JSON.stringify(params));
			$.ajax({
				type: "POST",
				url: url1,
				contentType: "application/json; charset=utf-8",
				data: JSON.stringify(params),
				dataType: "json",
				success: function(data) {
					var jsonarray = "";
					$.each(data, function(key, value) {
						jsonarray += key + "=" + value + ",";

					});
					if(navigator.userAgent.toLowerCase().match(/(android)/)) {
						MyObject.showDialog(jsonarray);
					} else {
						alert(jsonarray);
					}
					if(data.IsOK.toString() == "true") {
						if(navigator.userAgent.toLowerCase().match(/(android)/)) {
							MyObject.showDialog(data);							
						} else {
							alert("登录成功！");
						}
					} else {
						if(navigator.userAgent.toLowerCase().match(/(android)/)) {
							MyObject.showDialog(data.Msg);
						} else {
							alert(data.Msg);
						}
					}
				},
				error: function(data) {
					if(navigator.userAgent.toLowerCase().match(/(android)/)) {
						MyObject.showDialog("提交数据失败！");
					} else {
						alert("提交数据失败！");
					}
				}
				
			});			
		}
	}
})