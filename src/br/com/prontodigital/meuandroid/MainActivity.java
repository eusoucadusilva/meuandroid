package br.com.prontodigital.meuandroid;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	private EditText nomeEditText;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //capturando referencias ao inciar a aplicação
        this.nomeEditText 	  = (EditText) findViewById(R.id.nomeEditText);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    //onclick
    public void supreenderUsuario(View view){
    	
    	Intent intent = new Intent(SaudacaoActivity.ACAO_EXIBIR_SAUDACAO);
    	intent.addCategory(SaudacaoActivity.CATEGORIA_SAUDACAO);

    	String texto = nomeEditText.getText().toString();
    	
    	intent.putExtra(SaudacaoActivity.EXTRA_NOME_USUARIO, texto);
    	startActivity(intent);
   
    }
}
