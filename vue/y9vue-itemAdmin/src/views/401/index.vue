<!--
 * @Author: error: git config user.name && git config user.email & please set dead value or install git
 * @Date: 2022-08-02 10:51:50
 * @LastEditors: error: git config user.name && git config user.email & please set dead value or install git
 * @LastEditTime: 2022-08-02 11:12:06
 * @Description: 无权限
-->

<template>
    <div class="login">
        <div class="form">
            <h1 class="title"> 401 Error </h1>
            <p class="msg">抱歉，该用户不是管理员人员，没有权限！！！</p>
            <el-button size="mini" type="primary" @click="logout">退出重新登录</el-button>
        </div>
    </div>
</template>
<script lang="ts" setup>
    import { $y9_SSO } from '@/main';

    function logout() {
        try {
            const params = {
                redirect_uri: window.location.origin + import.meta.env.VUE_APP_PUBLIC_PATH
            };
            $y9_SSO.ssoLogout(params);
        } catch (error) {
            ElMessage.error(error.msg || 'Has Error');
        }
    }
</script>
<style scoped>
    .login {
        display: flex;
        width: 100%;
        height: 100vh;
        min-height: 300px;
        overflow: auto;
        /* background-image: url("../../assets/images/bg.jpg"); */
        background-color: #f5f7f9;
        background-repeat: no-repeat;
        background-position: center center;
        background-attachment: fixed;
        background-size: cover;
        align-items: center;
    }

    .form {
        flex: none;
        width: 420px;
        padding: 60px;
        margin: 0 auto;
        border-radius: 4px;
        background-color: rgba(255, 255, 255, 0);
        text-align: center;
        color: rgba(0, 0, 0, 0.5);
    }

    .title {
        font-weight: 300;
    }

    .msg {
        padding: 8px;
    }
</style>
