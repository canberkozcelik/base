package com.bco.myapplication.data.network

import com.bco.myapplication.data.network.request.LoginRequest

interface ApiHelper {

    fun performGoogleLogin(request: LoginRequest.GoogleLoginRequest)

}