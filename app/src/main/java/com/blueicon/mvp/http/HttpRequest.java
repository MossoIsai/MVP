package com.blueicon.mvp.http;

import com.blueicon.mvp.model.response.Usuario;
import com.blueicon.mvp.model.request.UsuarioRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by developer on 21/07/17.
 */

public interface HttpRequest {


    @POST("Usuario/LoguearUsuario")
    @Headers("Accept: application/json")
    Call<Usuario> loggin(@Body UsuarioRequest request);
}
