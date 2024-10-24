import {createRouter, createWebHashHistory, createWebHistory} from "vue-router";
import SearchResults from "@/views/SearchResults.vue";
import RegisterView from "@/views/RegisterView.vue";
import TosView from "@/views/TosView.vue";
import LoginView from "@/views/LoginView.vue";
import FindIdView from "@/views/FindIdView.vue";
import MainPageBefore from "@/views/MainPageBefore.vue";
import Cart from "@/views/Cart.vue";
import DbtiTestView from "@/views/DbtiTestView.vue";
import PayFail from "@/views/PayFail.vue";
import PayComplete from "@/views/PayComplete.vue";
import MypageResMsg from "@/views/MypageResMsg.vue";
import MypageInfo from "@/views/MypageInfo.vue";
import MypageSendMsg from "@/views/MypageSendMsg.vue";

const router = createRouter({
    history: createWebHistory(),
    routes: [
        {
            path: '/',
            component: MainPageBefore
        },
        {
            path: '/search',
            component: SearchResults // 검색 결과 페이지
        },
        {
            path: '/register/tos',
            component: TosView  // 약관동의 페이지
        },
        {
            path: '/register',
            component: RegisterView // 회원가입 페이지
        },
        {
            path: '/login',
            component: LoginView    // 로그인 페이지
        },
        {
            path: '/find-id',
            component: FindIdView   // 아이디 찾기
        },
        {
            path: '/cart-goods',
            component: Cart  // 장바구니
        },
        {
            path: '/payment/fail',
            component: PayFail
        },
        {
            path: '/payment/complete',
            component: PayComplete
        },
        {
            path: '/test',
            component: DbtiTestView // 성향 테스트
        },
        {
            path: '/mypage/info',
            component: MypageInfo
        },
        {
            path: '/mypage/resMsg',
            component: MypageResMsg
        },
        {
            path: '/mypage/sendMsg',
            component: MypageSendMsg
        }
    ]
});

export default router;