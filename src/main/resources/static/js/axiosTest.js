var logo = new Vue({
	el:"#content",
	methods: {
		submitForm: function (e){
			axios.post("http://localhost:8080/register",
				{
					username:this.username,
					password:this.password,
					phone_num:this.phone_num,
					email:this.email
				})
				.then(function(response) {
					alert(response.data)
				})
		}
	},
	data: {
		username:null,
		password:null,
		phone_num:null,
		email: null
	}
})