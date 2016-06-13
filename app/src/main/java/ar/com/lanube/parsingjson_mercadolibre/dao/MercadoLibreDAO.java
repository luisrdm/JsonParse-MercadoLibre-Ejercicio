package ar.com.lanube.parsingjson_mercadolibre.dao;

import android.content.Context;

import ar.com.lanube.parsingjson_mercadolibre.model.MercadoLibreContainer;

/**
 * Created by izu on 09/06/2016..
 */
public class MercadoLibreDAO extends GenericDAO {

    public MercadoLibreContainer getMercadoLibreData (Context context){
        MercadoLibreContainer mercadoLibreContainer = (MercadoLibreContainer) getObject(context,MercadoLibreContainer.class,"mercadoLibre.json");
        return mercadoLibreContainer;
    }

}
