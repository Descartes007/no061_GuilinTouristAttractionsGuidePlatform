const base = {
    get() {
        return {
            url : "http://localhost:8080/springbootr6il1/",
            name: "springbootr6il1",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springbootr6il1/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "桂林旅游景点导游平台"
        } 
    }
}
export default base
