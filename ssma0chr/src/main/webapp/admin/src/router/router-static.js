import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import xueshengpingjia from '@/views/modules/xueshengpingjia/list'
    import xuefenxinxi from '@/views/modules/xuefenxinxi/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import chengjixinxi from '@/views/modules/chengjixinxi/list'
    import zhuanyexinxi from '@/views/modules/zhuanyexinxi/list'
    import baokaoxinxi from '@/views/modules/baokaoxinxi/list'
    import jiaoshi from '@/views/modules/jiaoshi/list'
    import huojiangxinxi from '@/views/modules/huojiangxinxi/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/xueshengpingjia',
        name: '学生评价',
        component: xueshengpingjia
      }
      ,{
	path: '/xuefenxinxi',
        name: '学分信息',
        component: xuefenxinxi
      }
      ,{
	path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
      ,{
	path: '/chengjixinxi',
        name: '成绩信息',
        component: chengjixinxi
      }
      ,{
	path: '/zhuanyexinxi',
        name: '专业信息',
        component: zhuanyexinxi
      }
      ,{
	path: '/baokaoxinxi',
        name: '报考信息',
        component: baokaoxinxi
      }
      ,{
	path: '/jiaoshi',
        name: '教师',
        component: jiaoshi
      }
      ,{
	path: '/huojiangxinxi',
        name: '获奖信息',
        component: huojiangxinxi
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
