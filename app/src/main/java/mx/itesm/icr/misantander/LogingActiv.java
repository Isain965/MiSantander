package mx.itesm.icr.misantander;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LogingActiv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loging);
    }

    public void cargarPreguntas(View v){
        Intent intent = new Intent(this, Pregunta1Activ.class);
        System.out.println("***************************************************************");
        startActivity(intent);
    }
}
