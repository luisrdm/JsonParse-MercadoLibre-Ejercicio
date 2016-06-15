package ar.com.lanube.parsingjson_mercadolibre.controller;

import java.util.List;

import ar.com.lanube.parsingjson_mercadolibre.dao.MercadoLibreDAO;
import ar.com.lanube.parsingjson_mercadolibre.model.MercadoLibreContainer;
import ar.com.lanube.parsingjson_mercadolibre.util.ResultListener;

/**
 * Created by izu on 09/06/2016.
 */
public class MercadoLibreController {

    public void getMercadoLibreData (final ResultListener<List<MercadoLibreContainer>> listener){
        MercadoLibreDAO dao = new MercadoLibreDAO();

        dao.getMercadoLibreData(new ResultListener<List<MercadoLibreContainer>>(){

            @Override
            public void finish(List<MercadoLibreContainer> result) {
                listener.finish(result);
            }
        });
    }
}
