package com.blueicon.mvp.presenter;

import com.blueicon.mvp.http.ClientRetrofit;
import com.blueicon.mvp.http.HttpRequest;
import com.blueicon.mvp.model.request.UsuarioRequest;
import com.blueicon.mvp.model.response.Usuario;
import com.blueicon.mvp.view.ILoginView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by developer on 21/07/17.
 */

public class LoginPresenter  implements ILoginPresenter{
    private ILoginView iLoginView;


    public LoginPresenter(ILoginView iLoginView){
           this.iLoginView = iLoginView;
    }

    @Override
    public void clear() {
        iLoginView.clearText();
    }

    @Override
    public void executeService(UsuarioRequest usuarioRequest) {
        
        HttpRequest httpRequest = ClientRetrofit.getSharedInstance().create(HttpRequest.class);
        Call<Usuario> usuarioCall = httpRequest.loggin(usuarioRequest);
        usuarioCall.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
             boolean isLoginSuccess = false;
                if(response.body().isEstatus()){
                    isLoginSuccess =  true;
                    System.out.println("");
                }else{
                    isLoginSuccess = false;
                }
            }

            @Override
            public void onFailure(Call<Usuario> call, Throwable t) {

            }
        });
    }


}
