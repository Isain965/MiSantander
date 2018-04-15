package mx.itesm.icr.misantander;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class FinalPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_page);
    }


    public void cargarCuentaFree(View v){

        String download_link = "https://cuentadigital.santander.com.mx/personas/#/";
        try {
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_link));
            startActivity(myIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "No application can handle this request."
                    + " Please install a webbrowser",  Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

    public void cargarTarjetaDebito(View v){

        String download_link = "https://servicios.santander.com.mx/cuentas/cuenta_basica.html";
        try {
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_link));
            startActivity(myIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "No application can handle this request."
                    + " Please install a webbrowser",  Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

    public void cargarTarjetaCredito(View v){

        String download_link = "https://servicios.santander.com.mx/tarjetas/marca_propia/black.html";
        try {
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_link));
            startActivity(myIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "No application can handle this request."
                    + " Please install a webbrowser",  Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

    public void cargarCreditos(View v){

        String download_link = "http://www.santander.com.mx/creditos/creditosPersonales.html";
        try {
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_link));
            startActivity(myIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "No application can handle this request."
                    + " Please install a webbrowser",  Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }


    public void contacto(View v){

        String download_link = "http://www.santander.com.mx/mx/home/";
            try {
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_link));
            startActivity(myIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "No application can handle this request."
                    + " Please install a webbrowser",  Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

    public void localizanos(View v){

        String download_link = "https://www.google.com.mx/search?dcr=0&source=hp&ei=P1zRWo-6Fs_w_AbP-7TIBg&q=santander&oq=santander&gs_l=mobile-gws-hp.3..0j0i131j0j0i131j5.2639.6496..7090...3....173.1526.2j9..........1..mobile-gws-wiz-hp.....3..35i39j0i10j0i10i203j0i10i30.WNJ%2FgyZSKK4%3D#istate=lrl:mlt";
        try {
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_link));
            startActivity(myIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "No application can handle this request."
                    + " Please install a webbrowser",  Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }

    public void consejos(View v){
        Intent intent = new Intent( this, Consejos.class);
        startActivity(intent);
    }

    public void conocenos(View v){

        String download_link = "http://www.santander.com.mx/mx/home/";
        try {
            Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(download_link));
            startActivity(myIntent);
        } catch (ActivityNotFoundException e) {
            Toast.makeText(this, "No application can handle this request."
                    + " Please install a webbrowser",  Toast.LENGTH_LONG).show();
            e.printStackTrace();
        }
    }









}
