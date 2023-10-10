<template>

    <div class="nav">
        <route-link to="/" href="#">Home Page</route-link>
        <route-link to="/add" href="#">Add Restaurant</route-link>
        <route-link to="/update" href="#">Update Restaurant</route-link>
        <route-link v-on:click="logout" href="#">Logout</route-link>
    </div>
    
</template>

<script>
    export default{
        name:'HeaderComp',
        methods:{
            logout(){
                // To logout, clear the local storage
                localStorage.clear();
                // After logout, redirect to login page
                this.$router.push({name:'LogIn'})
            }
        }
    }
</script>

<style>
    .nav{
        background-color: #333;
        overflow: hidden;
    }

    .nav route-link{
        float: left;
        color: #f2f2f2;
        text-align: center;
        padding: 16px 14px;
        text-decoration: none;
        font-size: 16px;
        margin-right: 4px;
    }

    .nav route-link:hover{
        background: #ddd;
        color: #222;
    }
</style>
