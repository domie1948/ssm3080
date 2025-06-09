const base = {
    get() {
        return {
            url : "http://localhost:8080/ssma0chr/",
            name: "ssma0chr",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssma0chr/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校学生综合素质评价系统"
        } 
    }
}
export default base
