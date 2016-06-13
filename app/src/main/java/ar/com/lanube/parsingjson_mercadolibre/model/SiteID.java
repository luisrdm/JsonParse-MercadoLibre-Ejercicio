package ar.com.lanube.parsingjson_mercadolibre.model;

/**
 * Created by izu on 09/06/2016.
 */
public class SiteID {
    private String site_id;
    private Paging paging;

    @Override
    public String toString() {
        return "SiteID{" +
                "site_id='" + site_id + '\'' +
                ", " + paging.toString() +
                '}';
    }

}
