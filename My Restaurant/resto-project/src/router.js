import Home from './components/Home.vue'
import SignUp from './components/SignUp.vue'
import LogIn from './components/LogIn.vue'
import AddResto from './components/AddResto.vue'
import UpdateResto from './components/UpdateResto.vue'

import {createRouter, createWebHistory} from 'vue-router'

const routes=[
    {
        name:'Home',
        component:Home,
        path:'/'
    },
    {
        name:'SignUp',
        component:SignUp,
        path:'/sign-up'
    },
    {
        name:'LogIn',
        component:LogIn,
        path:'/log-in'
    },
    {
        name:'AddResto',
        component:AddResto,
        path:'/add'
    },
    {
        name:'UpdateResto',
        component:UpdateResto,
        path:'/update'
    }
]

const router = createRouter({
    history:createWebHistory(),
    routes
})

export default router