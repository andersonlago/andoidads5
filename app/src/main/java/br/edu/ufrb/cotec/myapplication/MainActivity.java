package br.edu.ufrb.cotec.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RestTemplate navegador = new RestTemplate();

        navegador.getMessageConverters().add( new GsonHttpMessageConverter());

        Result r = navegador.getForObject("https://randomuser.me/api/?gender={q}", Result.class, "female");

        Toast.makeText(getBaseContext(), r.getEmail(), Toast.LENGTH_LONG).show();



    }
}
