package ar.com.lanube.parsingjson_mercadolibre.model;

import java.util.List;

/**
 * Created by izu on 09/06/2016.
 */
public class MercadoLibreContainer {
    private String site_id;
    private Paging paging;
    private List<Results> results;

    @Override
    public String toString() {
        return "MercadoLibreContainer{" +
                "site_id=" + site_id +
                ", paging=" + paging +
            //    ", results=" + results +
                '}';
    }
}
