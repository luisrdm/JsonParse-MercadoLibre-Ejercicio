package ar.com.lanube.parsingjson_mercadolibre.model;

import java.util.List;

/**
 * Created by izu on 09/06/2016.
 */
public class Tags {
    List<String> tags;

    @Override
    public String toString() {
        String tagsToPrint = "";
        for (String tag  : tags) {
            tagsToPrint += ", " + tag;
        }
        return "Tags{" +
                "tags=" + tagsToPrint +
                '}';
    }
}
