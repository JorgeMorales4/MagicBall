package com.example.magicball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton Ball;
    private TextView respuesta;
    private String [] respuestaArray ={"Eso si pasara", "Quizas mueras mañana", "Si", "Si, porque no?", "Que importa? seras millonario", "Como yo lo veo, sí",
            "Lo más probable", "Good Luck!", "Sí", "mi mamá dice que si", "Respuesta confusa intente de nuevo", "Pregunte de nuevo más tarde",
            "Mejor no decirte ahora", "Nunca pasara", "Mejor fumate uno", "No cuentes con eso",
            "Nop", "Mis fuentes dicen que no", "Estoy ocupado", "Muy dudoso"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencia la imagen
        Ball = findViewById(R.id.btn);
        //referencia texto
        respuesta = findViewById(R.id.respuestavista);

        //proceso
        Ball.setOnClickListener(this);
        Toast.makeText(MainActivity.this, "Consulta tu suerte", Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onClick(View v){
        //creacion metodo switch
        switch (v.getId()){
            case R.id.btn:

                int rand = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[rand]);

                break;
        }
    }
}