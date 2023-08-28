<template>
    <HeaderComp />
    <h1>Hello user, Welcome to Add Restaurent Page</h1>
</template>

<script>

    import HeaderComp from './Header.vue';
    export default{
        name:'AddResto',
        components:{
            HeaderComp
        },
        mounted(){
            let user = localStorage.getItem('user-info');
            if(!user){
                this.$router.push({name:'SignUp'})
            }
        }
    }
</script>