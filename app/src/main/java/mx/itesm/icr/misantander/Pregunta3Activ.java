package mx.itesm.icr.misantander;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Pregunta3Activ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);
    }



    public void openPregunta2(View v){

        Intent intent = new Intent( this, Pregunta4Activ.class);

        startActivity(intent);

    }
}
