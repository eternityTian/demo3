var login = new Vue({
    el:"#login",
    data:{
        username:"",
        password:""
    },
    methods: {
        loginUser: function (){
            axios.post("http://localhost:8080/login",
                {
                    username:this.username,
                    password:this.password,
                })
                .then(function(response) {
                    if (response.data == 1) alert("登陆成功");
                    else alert("用户或密码错误");
                })
        }
    }
})
