jQuery.ajaxSetup({
	timeout: 6000,
	xhrFields: {
		withCredentials: true
	},
	crossDomain: true
});

jQuery(document).ajaxError(function(ex) {
	console.log(ex);
	alert("服务器正忙....");
});

//value 格式为13位unix时间戳
//10位unix时间戳可通过value*1000转换为13位格式
function formatDate (date, fmt) {
    if (/(y+)/.test(fmt)) {
        fmt = fmt.replace(RegExp.$1, (date.getFullYear() + '').substr(4 - RegExp.$1.length));
    }
    let o = {
        'M+': date.getMonth() + 1,
        'd+': date.getDate(),
        'h+': date.getHours(),
        'm+': date.getMinutes(),
        's+': date.getSeconds()
    };
    for (let k in o) {
        if (new RegExp(`(${k})`).test(fmt)) {
            let str = o[k] + '';
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length === 1) ? str : padLeftZero(str));
        }
    }
    return fmt;
};

function padLeftZero (str) {
    return ('00' + str).substr(str.length);
};