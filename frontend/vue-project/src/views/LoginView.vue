<template>
  <div :class="login.pagebackground">
    <div :class="login.content_card">
      <div :class="login.left_part">
        <div :class="login.title">Login Page Sample</div>
        <div :class="login.description">
          Welcome to LoginPageSample! <br />
          Log in securely and enjoy our platform. <br />
          New user? Sign up now! Let's get started!<br />
        </div>
        <form id="login-form">
          <label id="login_id_label">User name or Email</label>
          <input type="text" id="login_id" placeholder="" v-model="inputLoginId" />
          <div :class="login.input_underline"></div>
          <label id="login_password_label">Password</label>
          <input type="password" id="login_password" placeholder="" v-model="inputLoginPassword" />
          <div :class="login.input_underline"></div>

          <div :class="login.forgot_text">Forgot Password?</div>
          <br />
          <button type="button" @click="onSignInClick(inputLoginId, inputLoginPassword)">
            Sign In
          </button>
        </form>
      </div>
      <div :class="login.right_part"></div>
    </div>
  </div>
</template>
<script setup lang="ts">
import { ref } from 'vue'
import { loginDataStore } from '@/stores/modules/loginData'

// setup pinia
const loginStore = loginDataStore()
const { onSignInClick } = loginStore

// setup filed
const inputLoginId = ref('')
const inputLoginPassword = ref('')
</script>
<style module="login">
.pagebackground {
  position: absolute;
  width: 100vw;
  height: 100vh;
  background-position: top;
  background-size: cover, contain;
  background-image: url('@/assets/login-page-background.png');
  display: flex;
}

.content_card {
  width: 80vw;
  height: 80vh;
  margin-top: 5%;
  margin-left: auto;
  margin-right: auto;
  background-color: white;
  border-radius: 30px;
  display: flex;
}

.left_part {
  width: 70%;
  height: 100%;
  display: flex;
  flex-direction: column;
  padding-left: 15%;
  border-radius: 30px;
  text-align: left;
}

.title {
  margin-top: 60px;
  font-size: 2em;
  font-family: 'Times';
  color: black;
}

.description {
  margin-top: 40px;
  font-size: 1em;
  font-family: 'Times';
  color: grey;
}

.input_underline {
  position: relative;
  border-top: 1px solid #c2c2c2;
}

.forgot_text {
  text-align: right;
  margin-top: 10px;
  margin-bottom: 50px;
  font-size: 0.75em;
  font-family: 'Times';
  color: grey;
}

.right_part {
  width: 100%;
  height: 100%;
  margin-left: auto;
  margin-right: auto;
  font-size: 80px;
  color: ghostwhite;
  display: flex;
  flex-direction: column;
  border-radius: 0 30px 30px 0;
  background-image: linear-gradient(90deg, rgba(233, 233, 233, 1), rgba(172, 172, 172, 1));
}
</style>

<style scoped>
#login-form {
  position: relative;
  display: flex;
  flex-direction: column;
  margin-top: 50px;
  width: 50%;
}

#login_id_label,
#login_password_label {
  margin-top: 30px;
  font-size: 0.75em;
  font-family: 'Times';
  color: grey;
}

input {
  border: none;
  box-shadow: none;
  outline: none;
  margin-left: auto;
  margin-right: auto;
  padding: 2px 8px;
  height: 40px;
  width: 400px;
}

button {
  border: none;
  border-radius: 30px;
  box-shadow: none;
  margin-left: auto;
  margin-right: auto;
  padding: 2px 8px;
  height: 40px;
  width: 200px;
  background-image: linear-gradient(90deg, rgba(57, 210, 248, 1), rgba(48, 97, 96, 1));
}
</style>
