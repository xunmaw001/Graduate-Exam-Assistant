const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmv26k3/",
            name: "ssmv26k3",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmv26k3/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "考研助手"
        } 
    }
}
export default base
