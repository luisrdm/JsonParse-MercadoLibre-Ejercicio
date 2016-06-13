package ar.com.lanube.parsingjson_mercadolibre.model;

/**
 * Created by izu on 09/06/2016.
 */
public class Adress {
    private String state_id;
    private String state_name;
    private String city_id;
    private String city_name;

    @Override
    public String toString() {
        return "Adress{" +
                "state_id='" + state_id + '\'' +
                ", state_name='" + state_name + '\'' +
                ", city_id='" + city_id + '\'' +
                ", city_name='" + city_name + '\'' +
                '}';
    }
}
