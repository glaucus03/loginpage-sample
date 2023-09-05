<template>
  <div class="login">
    <div class="card">
      <div class="left-part"></div>
      <div class="center-part">
        <div>Login</div>
        <form id="login-form">
          <input type="id" name="id" placeholder="ID">
          <br>
          <input type="password" name="pass" placeholder="Password">
          <br>
          <button type="button" onClick="">submit</button>
        </form>
      </div>
      <div class="right-part"></div>
    </div>
  </div>
</template>

<script>

export default {
  name: 'LoginView',
  components: {
  }
}
</script>
<style scoped>
.login {
  position: absolute;
  width: 100vw;
  height: 100vh;
  background-position: top;
  background-size:cover;
  background-image: linear-gradient(90deg, rgba(57, 210, 248, 1), rgba(48, 97, 96, 1));
}

.card {
  width: 80vw;
  height: 60vw;
  margin-left: auto;
  margin-right: auto;
  margin-top: 60px; 
  background-image: linear-gradient(90deg, rgba(85, 85, 85, 1), rgba(0, 0, 0, 1));
}

.center-part {
  width: 80vw;
  height: 50vw;
  position: absolute;
  margin-left: auto;
  margin-right: auto;
  margin-top: 20px; 
  font-size: 80px;
  color:ghostwhite ;
  display: flex;
  flex-direction: column;

}

#login-form {
  position: relative;
  display: flex;
  flex-direction: column;
  margin-top:100px;
  margin-left: auto;
  margin-right: auto;
  width: 40vw;
}

input {
  border:none;
  border-radius:30px;
  box-shadow: none;
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

