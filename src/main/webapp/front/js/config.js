
var projectName = '考研助手';
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
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
]


var indexNav = [

{
	name: '考研资讯',
	url: './pages/kaoyanzixun/list.html'
}, 
{
	name: '考研名师',
	url: './pages/kaoyanmingshi/list.html'
}, 
{
	name: '考研信息',
	url: './pages/kaoyanxinxi/list.html'
}, 
{
	name: '院校推荐',
	url: './pages/yuanxiaotuijian/list.html'
}, 

{
	name: '公告资讯',
	url: './pages/news/list.html'
},
]

var adminurl =  "http://localhost:8080/ssmv26k3/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["新增","查看","修改","删除"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"教学秘书","menuJump":"列表","tableName":"jiaoxuemishu"}],"menu":"教学秘书管理"},{"child":[{"appFrontIcon":"cuIcon-form","buttons":["查看","修改","删除"],"menu":"考研资讯","menuJump":"列表","tableName":"kaoyanzixun"}],"menu":"考研资讯管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看","修改","删除"],"menu":"考研名师","menuJump":"列表","tableName":"kaoyanmingshi"}],"menu":"考研名师管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["查看","修改","删除"],"menu":"考研信息","menuJump":"列表","tableName":"kaoyanxinxi"}],"menu":"考研信息管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","修改","删除"],"menu":"咨询信息","menuJump":"列表","tableName":"zixunxinxi"}],"menu":"咨询信息管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","修改","删除"],"menu":"院校推荐","menuJump":"列表","tableName":"yuanxiaotuijian"}],"menu":"院校推荐管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"公告资讯","tableName":"news"},{"appFrontIcon":"cuIcon-circle","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"考研资讯列表","menuJump":"列表","tableName":"kaoyanzixun"}],"menu":"考研资讯模块"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"考研名师列表","menuJump":"列表","tableName":"kaoyanmingshi"}],"menu":"考研名师模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看","咨询"],"menu":"考研信息列表","menuJump":"列表","tableName":"kaoyanxinxi"}],"menu":"考研信息模块"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看"],"menu":"院校推荐列表","menuJump":"列表","tableName":"yuanxiaotuijian"}],"menu":"院校推荐模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","修改","删除"],"menu":"咨询信息","menuJump":"列表","tableName":"zixunxinxi"}],"menu":"咨询信息管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"考研资讯列表","menuJump":"列表","tableName":"kaoyanzixun"}],"menu":"考研资讯模块"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"考研名师列表","menuJump":"列表","tableName":"kaoyanmingshi"}],"menu":"考研名师模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看","咨询"],"menu":"考研信息列表","menuJump":"列表","tableName":"kaoyanxinxi"}],"menu":"考研信息模块"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看"],"menu":"院校推荐列表","menuJump":"列表","tableName":"yuanxiaotuijian"}],"menu":"院校推荐模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-form","buttons":["新增","查看","修改","删除"],"menu":"考研资讯","menuJump":"列表","tableName":"kaoyanzixun"}],"menu":"考研资讯管理"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["新增","查看","修改","删除"],"menu":"考研名师","menuJump":"列表","tableName":"kaoyanmingshi"}],"menu":"考研名师管理"},{"child":[{"appFrontIcon":"cuIcon-keyboard","buttons":["新增","查看","修改","删除","咨询"],"menu":"考研信息","menuJump":"列表","tableName":"kaoyanxinxi"}],"menu":"考研信息管理"},{"child":[{"appFrontIcon":"cuIcon-link","buttons":["查看","审核"],"menu":"咨询信息","menuJump":"列表","tableName":"zixunxinxi"}],"menu":"咨询信息管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["新增","查看","修改","删除"],"menu":"院校推荐","menuJump":"列表","tableName":"yuanxiaotuijian"}],"menu":"院校推荐管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看"],"menu":"考研资讯列表","menuJump":"列表","tableName":"kaoyanzixun"}],"menu":"考研资讯模块"},{"child":[{"appFrontIcon":"cuIcon-goods","buttons":["查看"],"menu":"考研名师列表","menuJump":"列表","tableName":"kaoyanmingshi"}],"menu":"考研名师模块"},{"child":[{"appFrontIcon":"cuIcon-similar","buttons":["查看","咨询"],"menu":"考研信息列表","menuJump":"列表","tableName":"kaoyanxinxi"}],"menu":"考研信息模块"},{"child":[{"appFrontIcon":"cuIcon-discover","buttons":["查看"],"menu":"院校推荐列表","menuJump":"列表","tableName":"yuanxiaotuijian"}],"menu":"院校推荐模块"}],"hasBackLogin":"是","hasBackRegister":"是","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"教学秘书","tableName":"jiaoxuemishu"}]


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
