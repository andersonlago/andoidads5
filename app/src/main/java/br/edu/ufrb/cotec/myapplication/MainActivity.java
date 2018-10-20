package br.edu.ufrb.cotec.myapplication;

import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.springframework.http.HttpAuthentication;
import org.springframework.http.HttpBasicAuthentication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView nome, email, phone;
    EditText e;
    Button b;
    //objeto para fazer a requisição
    RestTemplate navegador = new RestTemplate();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        nome = (TextView) findViewById(R.id.Nome);
        email = (TextView) findViewById(R.id.Email);
        phone = (TextView) findViewById(R.id.Phone);
        e = (EditText) findViewById(R.id.editText);
        b = (Button) findViewById(R.id.button);


        HttpAuthentication authHeader = new HttpBasicAuthentication("1621699", "esig");
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.setAuthorization(authHeader);
        HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);


        //define a classe que fara o tratamento do retorno (Json) para converter em um Objeto Java
        navegador.getMessageConverters().add( new GsonHttpMessageConverter());
        navegador.getMessageConverters().add( new StringHttpMessageConverter());

        ResponseEntity<Usuario> response =
                navegador.exchange("http://preproducao.ufrb.edu.br/sigrh/rest/mobile/logon/",
                        HttpMethod.GET, requestEntity, Usuario.class);

         String s = response.getBody().getEmail();
         Toast.makeText(getBaseContext(), s, Toast.LENGTH_LONG).show();

        // OBS: usar http://www.jsonschema2pojo.org para gerar classes pojos do webservice
        Pessoa r = navegador.getForObject("https://randomuser.me/api/?gender={q}", Pessoa.class, "female");

        Toast.makeText(getBaseContext(), r.getResults().get(0).getEmail(), Toast.LENGTH_LONG).show();

        nome.setText(r.getResults().get(0).getName().getFirst());
        email.setText(r.getResults().get(0).getEmail());
        phone.setText(r.getResults().get(0).getPhone());

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // OBS: usar http://www.jsonschema2pojo.org para gerar classes pojos do webservice
                Endereco en = navegador.getForObject("https://viacep.com.br/ws/{p}/json/", Endereco.class,  e.getText().toString()   );
                Toast.makeText(getApplicationContext(), en.getLocalidade(), Toast.LENGTH_LONG).show();
                nome.setText( en.getComplemento() + en.getBairro() + en.getLogradouro());


                //instanciar Intent para iniciar uma tela (Activity)
                Intent i = new Intent(getApplicationContext(), MainActivity.class);

                //Passar paramentro para a outra tela
                i.putExtra("Nome", nome.getText().toString() + " "  + nome.getText().toString()  );

                //Como pegar o paramentro na outra tela     getIntent().getExtras("Login")
                startActivity(i);


            }
        });

    }
}
