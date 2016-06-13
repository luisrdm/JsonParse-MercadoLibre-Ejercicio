package ar.com.lanube.parsingjson_mercadolibre.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import ar.com.lanube.parsingjson_mercadolibre.R;
import ar.com.lanube.parsingjson_mercadolibre.controller.MercadoLibreController;
import ar.com.lanube.parsingjson_mercadolibre.model.MercadoLibreContainer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickMercadoLibreData (View view) {

        MercadoLibreController controller = new MercadoLibreController();
        MercadoLibreContainer mercadoLibreContainer = controller.getMercadoLibreData(this);

        String data = mercadoLibreContainer.toString();

        Log.d("INFO MERCADOLIBRE DATA!", data);

    }

}
