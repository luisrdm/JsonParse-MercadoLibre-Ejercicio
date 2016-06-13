package ar.com.lanube.parsingjson_mercadolibre.controller;

import android.content.Context;

import ar.com.lanube.parsingjson_mercadolibre.dao.MercadoLibreDAO;
import ar.com.lanube.parsingjson_mercadolibre.model.MercadoLibreContainer;

/**
 * Created by izu on 09/06/2016.
 */
public class MercadoLibreController {

    MercadoLibreDAO dao = new MercadoLibreDAO();

    public MercadoLibreContainer getMercadoLibreData (Context context){
        MercadoLibreContainer mercadoLibreContainer = dao.getMercadoLibreData(context);
        return mercadoLibreContainer;
    }
}
