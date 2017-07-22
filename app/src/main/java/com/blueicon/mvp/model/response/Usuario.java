package com.blueicon.mvp.model.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by developer on 21/07/17.
 */

public class Usuario {

    @SerializedName("UsuarioId")
    @Expose
    private Integer usuarioId;
    @SerializedName("Nombre")
    @Expose
    private String nombre;
    @SerializedName("Usuario")
    @Expose
    private String usuario;
    @SerializedName("Email")
    @Expose
    private String email;
    @SerializedName("Foto")
    @Expose
    private String foto;
    @SerializedName("FechaNacimiento")
    @Expose
    private String fechaNacimiento;
    @SerializedName("Mensaje")
    @Expose
    private String mensaje;
    @SerializedName("Estatus")
    @Expose
    private boolean estatus;

    public Usuario(Integer usuarioId, String nombre, String usuario, String email, String foto, String fechaNacimiento, String mensaje, boolean estatus) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.usuario = usuario;
        this.email = email;
        this.foto = foto;
        this.fechaNacimiento = fechaNacimiento;
        this.mensaje = mensaje;
        this.estatus = estatus;
    }

    public Integer getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isEstatus() {
        return estatus;
    }

    public void setEstatus(boolean estatus) {
        this.estatus = estatus;
    }


}
