package com.blueicon.mvp.model.request;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by developer on 21/07/17.
 */

public class UsuarioRequest {

    @SerializedName("Usuario")
    @Expose
    private String usuario;
    @SerializedName("Password")
    @Expose
    private String password;

    public UsuarioRequest(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public UsuarioRequest() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
