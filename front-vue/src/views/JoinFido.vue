<template>
          <div class="l-wrap" >
            <div class="l-header">
                <h1 class="logo"><a href=""></a></h1>
            </div>


            <section class="page-join fido">

                <header class="ui-header w-inner">
                    <h2>FIDO 등록</h2>
                    <p>FIDO인증 사용을 위해 사전 등록을 해 주세요.</p>
                </header>

                <main class="w-inner"> 
                    <div id="fidoReg">
                    <form class="form-box" >
                        <ul >
                            <li>
                                <label>휴대폰 번호</label>
                            </li>
                            <li>
                               <input type="text" placeholder="휴대폰 번호" v-model="joinFido.phoneNo" id="phoneNo" />
                               <!--
                               <input type="text" placeholder="" v-if="joinFido.isDossId" v-model="joinFido.dossId" id="" disabled="disabled"/>
                               <input type="text" placeholder="" v-if="isActivecode" v-model="joinFido.activecode" id="" disabled="disabled"/>
                               -->
                               <div id="activeDiv">
                                    <ul>
                                        <li>dossId      : {{ this.$data.joinFido.dossId }}</li> 
                                        <li>활성화코드   : {{ this.$data.joinFido.activecode }}</li> 
                                    <!--<input type="text"  v-if="!isHidden" v-model="joinFido.dossId" id="" disabled="disabled"/>      -->
                                    <!--<input type="text"  v-if="isHidden" v-model="joinFido.activecode" id="" disabled="disabled"/>   -->   
                                    <ul>
                                <div>
                            </li>
                            <!--
                            <li>
                                   doss id : {{ this.$route.params.dossId }} 
                                   활성화코드 : {{ this.$route.params.activecode }}

                            </li>-->
                        </ul>
                        
                        <button class="btn-lg btn-brand" @click.self.prevent="regFido">FIDO 등록</button>
                        
                    </form>
                    </div>
                </main>

            </section>

            <div class="l-footer">
                COPYRIGHT© SK TELECOM ALL RIGHTS RESERVED.
            </div>
            
        </div>
        
</template>

<script lang="ts">

//import IsRegPushInfo from "@/components/fido/IsRegPushInfo.vue";
import axios from "axios";

//import HelloWorld from '@/components/JoinFido.vue'; // @ is an alias to /src

const instance = axios.create({
    baseURL: "http://localhost:8090",
    headers: {"Content-Type": "application/json; charset = utf-8"}
    //timeout: 1000
})


</script>