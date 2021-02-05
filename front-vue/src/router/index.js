import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Login from '../views/Login.vue'
// import CompanyList from '@/components/CompanyList.vue'
import Join from '../views/Join.vue'
import JoinDone from '../views/JoinDone.vue'
import JoinFido from '../views/JoinFido.vue'
import PageNotFound from '../views/error/PageNotFound.vue'


Vue.use(VueRouter)

const routes = [
  { path: '/', name: 'Home', component: Home },
  { path: '/login', name: 'Login', component: Login },
  { path: '/join', name: 'Join', component: Join },
  { path: '/join-done/:dossId', name: 'JoinDone', component: JoinDone },
  { path: '/join-fido', name: 'JoinFido', component: JoinFido },
  // { path: '/CompanyList', name: 'CompanyList', component: CompanyList },
  { path: '/*', component: PageNotFound },
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
