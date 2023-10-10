<template>
    <img class="logo" src="../assets/resto-logo.png"/>
    <h1>Sign Up</h1>
    <div class="register">
        <input type="text" placeholder="Enter Name" v-model="name"/>
        <input type="text" placeholder="Enter Email" v-model="email"/>
        <input type="password" placeholder="Enter Password" v-model="password"/>
        <button v-on:click="signUp">Sign Up</button>
        <p>
            <router-link to="/log-in">LogIn</router-link>
        </p>
    </div>
</template>

<script>

    import axios from 'axios';    

    export default{
        name:'SignUp',
        data(){
            return{
                name:'',
                email:'',
                password:''
            }
        },
        methods:{
            async signUp(){
                console.warn("Sign Up: ", this.name, this.email, this.password)
                let result = await axios.post("http://localhost:8082/user", {
                    email:this.email,
                    name:this.name,
                    password:this.password
                });

                console.warn(result)
                if(result.status==201 || result.status==200){

                    // Saving Data to Local Storage
                    localStorage.setItem("userInfo", JSON.stringify(result))
                    this.$router.push({name:'Home'})
                }                
            }
        },
        mounted(){
            let user = localStorage.getItem("userInfo");
            if(user){
                this.$router.push({name:'Home'})
            }
        }
    }
</script>

<style>

</style>