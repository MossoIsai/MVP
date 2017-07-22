package com.blueicon.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.blueicon.mvp.model.request.UsuarioRequest;
import com.blueicon.mvp.presenter.ILoginPresenter;
import com.blueicon.mvp.presenter.LoginPresenter;
import com.blueicon.mvp.view.ILoginView;

public class LoginActivity extends AppCompatActivity  implements ILoginView {

    private EditText usuario;
    private EditText correo;
    private Button btnSenData;
    private LoginPresenter loginPresenter;
    private ILoginView iLoginView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }
    @Override
    public void clearText() {
        usuario.setText("");
        correo.setText("");
    }
   public void initView(){
       usuario = (EditText) findViewById(R.id.usuario);
       correo = (EditText) findViewById(R.id.correo);
       btnSenData = (Button)findViewById(R.id.btnSend);
       btnSenData.setOnClickListener(listener);
   }
   View.OnClickListener listener = new View.OnClickListener() {
       @Override
       public void onClick(View v) {
          loginPresenter = new LoginPresenter(iLoginView);
          loginPresenter.executeService(new UsuarioRequest(usuario.getText().toString(),correo.getText().toString()));
       }
   };


    @Override
    public void onLoginResult(boolean resultado, int code) {
        if(resultado){
         //Si
        }else{
            //Else
        }
    }

}
