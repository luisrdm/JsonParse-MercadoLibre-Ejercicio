package ar.com.lanube.parsingjson_mercadolibre.model;

/**
 * Created by izu on 09/06/2016.
 */
public class PagingContainer {
    private Paging paging;

    @Override
    public String toString() {
        return paging.toString();
    }
}
