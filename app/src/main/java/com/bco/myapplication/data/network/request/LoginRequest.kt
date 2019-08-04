package com.bco.myapplication.data.network.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class LoginRequest {
    data class GoogleLoginRequest internal constructor(@Expose
                                                       @SerializedName("google_user_id")
                                                       internal val googleUserId: String,
                                                       @Expose
                                                       @SerializedName("google_id_token")
                                                       internal val idToken: String)
}
