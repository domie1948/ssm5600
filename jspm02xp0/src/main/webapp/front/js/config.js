
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.jsp'
}, 
]


var indexNav = [

{
	name: '招聘信息',
	url: './pages/zhaopinxinxi/list.jsp'
}, 

{
	name: '新闻资讯',
	url: './pages/news/list.jsp'
},
]

var adminurl =  "http://localhost:8080/jspm02xp0/index.jsp";

var cartFlag = false

var chatFlag = false

var systemName = '毕业生就业信息管理系统'




var menu = [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"就业导师","menuJump":"列表","tableName":"jiuyedaoshi"}],"menu":"就业导师管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"企业","menuJump":"列表","tableName":"qiye"}],"menu":"企业管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"招聘信息","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"历届毕业生就业信息","menuJump":"列表","tableName":"lijiebiyeshengjiuyexinxi"}],"menu":"历届毕业生就业信息管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"面试邀请","menuJump":"列表","tableName":"mianshiyaoqing"}],"menu":"面试邀请管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"投递的简历","menuJump":"列表","tableName":"toudidejianli"}],"menu":"投递的简历管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"就业资讯","tableName":"news"},{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["投递简历","查看"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"企业","menuJump":"列表","tableName":"qiye"}],"menu":"企业管理"},{"child":[{"buttons":["投递简历","查看"],"menu":"招聘信息","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息管理"},{"child":[{"buttons":["查看"],"menu":"历届毕业生就业信息","menuJump":"列表","tableName":"lijiebiyeshengjiuyexinxi"}],"menu":"历届毕业生就业信息管理"},{"child":[{"buttons":["查看"],"menu":"面试邀请","menuJump":"列表","tableName":"mianshiyaoqing"}],"menu":"面试邀请管理"},{"child":[{"buttons":["查看"],"menu":"投递的简历","menuJump":"列表","tableName":"toudidejianli"}],"menu":"投递的简历管理"}],"frontMenu":[{"child":[{"buttons":["投递简历","查看"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["查看"],"menu":"企业","menuJump":"列表","tableName":"qiye"}],"menu":"企业管理"},{"child":[{"buttons":["新增","查看","修改","删除","审核"],"menu":"招聘信息","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息管理"},{"child":[{"buttons":["查看"],"menu":"历届毕业生就业信息","menuJump":"列表","tableName":"lijiebiyeshengjiuyexinxi"}],"menu":"历届毕业生就业信息管理"},{"child":[{"buttons":["查看"],"menu":"就业资讯","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"buttons":["投递简历","查看"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"就业导师","tableName":"jiuyedaoshi"},{"backMenu":[{"child":[{"buttons":["查看"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增"],"menu":"招聘信息","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息管理"},{"child":[{"buttons":["查看","新增","修改"],"menu":"面试邀请","menuJump":"列表","tableName":"mianshiyaoqing"}],"menu":"面试邀请管理"},{"child":[{"buttons":["面试邀请","查看"],"menu":"投递的简历","menuJump":"列表","tableName":"toudidejianli"}],"menu":"投递的简历管理"}],"frontMenu":[{"child":[{"buttons":["投递简历","查看"],"menu":"招聘信息列表","menuJump":"列表","tableName":"zhaopinxinxi"}],"menu":"招聘信息模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"企业","tableName":"qiye"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
