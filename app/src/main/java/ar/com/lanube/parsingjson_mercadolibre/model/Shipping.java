package ar.com.lanube.parsingjson_mercadolibre.model;

/**
 * Created by izu on 09/06/2016.
 */
public class Shipping {
    private  Boolean free_shipping;
    private String mode;

    @Override
    public String toString() {
        return "Shipping{" +
                "free_shipping=" + free_shipping +
                ", mode='" + mode + '\'' +
                '}';
    }
}
