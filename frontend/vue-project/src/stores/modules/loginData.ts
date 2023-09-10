import { defineStore } from 'pinia'
import axios from "axios";

export const loginDataStore = defineStore('loginDataStore', {
  state: () => ({
    loginId: 'sample',
    loginPassword: 'sample',
  }),
  getters: {
    loginIdPassword(state) {
      return state.loginId + '/' + state.loginPassword;
    },
  },
  actions: {
    reset() {
      this.loginId = '';
      this.loginPassword = '';
    },
    onSignInClick (loginId, loginPassword) {
      this.loginId = loginId;
      this.loginPassword = loginPassword;

      const loginData = new FormData();

      loginData.append('loginId', this.loginId);
      loginData.append('loginPassword', this.loginPassword);

      axios.post('http://localhost:8080/login', loginData).then(response => {
        console.log(response);
      }).catch(error => {
        console.log(error);
      });
    }
  }
})
