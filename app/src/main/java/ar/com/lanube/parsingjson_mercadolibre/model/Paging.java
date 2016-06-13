package ar.com.lanube.parsingjson_mercadolibre.model;

/**
 * Created by izu on 09/06/2016.
 */
public class Paging {
    private Integer total;
    private Integer offset;
    private Integer limit;

    @Override
    public String toString() {
        return "Paging{" +
                "total=" + total +
                ", offset=" + offset +
                ", limit=" + limit +
                '}';
    }
}
