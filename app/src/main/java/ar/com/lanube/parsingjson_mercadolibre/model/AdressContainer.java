package ar.com.lanube.parsingjson_mercadolibre.model;

import android.location.Address;

/**
 * Created by izu on 09/06/2016.
 */
public class AdressContainer {
    private Address address;

    @Override
    public String toString() {
        return address.toString();
    }
}
