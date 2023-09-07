<template>
  <div class="login">
    <div class="card">
      <div class="left-part">
        <div class="login-form_title">Login Page Sample</div>
        <div class="login-form_description">
          Welcome to LoginPageSample! <br>
            Log in securely and enjoy our platform. <br>
            New user? Sign up now! Let's get started!<br>
        </div>
        <form id="login-form">
          <label for="login_id" id="login_id_label">User name or Email</label>
          <input type="text" id="login_id" placeholder="">
          <div class="input_underline"></div>
          <label for="password" id="login_password_label">Password</label>
          <input type="password" id="login_password" placeholder="">
          <div class="input_underline"></div>

          <div class="login_forgot">Forgot Password?</div>
          <br>
          <button type="button" onClick="">Sign In</button>
        </form>
      </div>
      <div class="right-part"></div>
    </div>
  </div>
</template>
<script setup lang="ts">
</script>
<style scoped>
.login {
  position: absolute;
  width: 100vw;
  height: 100vh;
  background-position: top;
  background-size:cover, contain;
  background-image: url("@/assets/login-page-background.png");
  display: flex;
}


.card {
  width: 80vw;
  height: 80vh;
  margin-top: 5%; 
  margin-left: auto;
  margin-right: auto;
  background-color: white;
  border-radius:30px;
  display:flex;
}

.left-part {
  width: 70%;
  height: 100%;
  display: flex;
  flex-direction: column;
  padding-left: 15%;
  border-radius:30px;
  text-align:left;

}

.login-form_title {
  margin-top: 60px;
  font-size: 2em;
  font-family: "Times";
  color: black;
}

.login-form_description {
  margin-top: 40px;
  font-size: 1em;
  font-family: "Times";
  color: grey;
}

#login-form {
  position: relative;
  display: flex;
  flex-direction: column;
  margin-top:50px;
  width: 50%;
}

#login_id_label,
#login_password_label
{
  margin-top: 30px;
  font-size: 0.75em;
  font-family: "Times";
  color: grey;
}
.input_underline {
  position: relative;
  border-top: 1px solid #c2c2c2;
}

.login_forgot {
  text-align: right;
  margin-top: 10px;
  margin-bottom: 50px;
  font-size: 0.75em;
  font-family: "Times";
  color: grey;
}

.right-part {
  width: 100%;
  height: 100%;
  margin-left: auto;
  margin-right: auto;
  font-size: 80px;
  color:ghostwhite ;
  display: flex;
  flex-direction: column;
  border-radius:0 30px 30px 0;
  background-image: linear-gradient(90deg, rgba(233, 233, 233, 1), rgba(172, 172, 172, 1));

}

input {
  border:none;
  box-shadow: none;
  outline: none;
  margin-left: auto;
  margin-right: auto;
  padding: 2px 8px;
  height: 40px;
  width: 400px;
}

button {
  border:none;
  border-radius:30px;
  box-shadow: none;
  margin-left: auto;
  margin-right: auto;
  padding: 2px 8px;
  height: 40px;
  width: 200px;
  background-image: linear-gradient(90deg, rgba(57, 210, 248, 1), rgba(48, 97, 96, 1));
}
</style>

