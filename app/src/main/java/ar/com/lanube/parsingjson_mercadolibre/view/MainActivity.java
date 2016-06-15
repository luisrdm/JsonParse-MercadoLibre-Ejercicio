package ar.com.lanube.parsingjson_mercadolibre.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import ar.com.lanube.parsingjson_mercadolibre.R;
import ar.com.lanube.parsingjson_mercadolibre.controller.MercadoLibreController;
import ar.com.lanube.parsingjson_mercadolibre.model.MercadoLibreContainer;
import ar.com.lanube.parsingjson_mercadolibre.util.ResultListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickMercadoLibreData (View view) {

        MercadoLibreController controller = new MercadoLibreController();

        controller.getMercadoLibreData(new ResultListener<List<MercadoLibreContainer>>(){

            @Override
            public void finish(List<MercadoLibreContainer> resultado) {
                Toast.makeText(MainActivity.this, resultado.toString(), Toast.LENGTH_SHORT).show();
            }
        });



/*        String data = mercadoLibreContainer.toString();

        Log.d("INFO MERCADOLIBRE DATA!", data);*/

    }

}
