<template>
    <img class="logo" src="../assets/resto-logo.png"/>
    <h1>LogIn</h1>
    <div class="login">
        <input type="text" placeholder="Enter Email" v-model="email"/>
        <input type="password" placeholder="Enter Password" v-model="password"/>
        <button v-on:click="login">Sign Up</button>
        <p>
            <router-link to="/sign-up">SignUp</router-link>
        </p>
    </div>
</template>

<script>

    import axios from 'axios';

    export default{
        name:'LogIn',
        data(){
            return{
                email:'',
                password:''
            }
        },
        methods:{
            async login(){
                let result = await axios.get(
                    `http://localhost:8082/byEmailAndPass?email=${this.email}&password=${this.password}`
                );

                if(result.status==200 || result.status==201 || result.data.length > 0){

                    // Saving Data to Local Storage
                    localStorage.setItem("user-info", JSON.stringify(result.data[0]))
                    this.$router.push({name:'Home'})
                }
            }
        },
        mounted(){
            let user = localStorage.getItem('user-info');
            if(user){
                this.$router.push({name:'Home'})
            }
        }
    }
</script>

<style>

</style>