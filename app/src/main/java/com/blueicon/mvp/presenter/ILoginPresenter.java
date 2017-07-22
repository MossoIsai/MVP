package com.blueicon.mvp.presenter;

import com.blueicon.mvp.model.request.UsuarioRequest;

/**
 * Created by developer on 21/07/17.
 */

public interface ILoginPresenter  {
    public void clear();
    public void executeService(UsuarioRequest usuarioRequest);
}

