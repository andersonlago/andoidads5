package br.edu.ufrb.cotec.myapplication;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

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

        //define a classe que fara o tratamento do retorno (Json) para converter em um Objeto Java
        navegador.getMessageConverters().add( new GsonHttpMessageConverter());

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
            }
        });

    }
}
