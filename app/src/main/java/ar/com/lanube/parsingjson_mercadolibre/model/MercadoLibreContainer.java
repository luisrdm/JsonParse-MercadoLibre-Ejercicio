package ar.com.lanube.parsingjson_mercadolibre.model;

import java.util.List;

/**
 * Created by izu on 09/06/2016.
 */
public class MercadoLibreContainer {
    private SiteID site_id;
    private PagingContainer paging;
    private List<Results> results;
/*    private Installments installments;
    private Address address;
    private Shipping shipping;
    private SellerAdress seller_address;
    private Country country;
    private State state;
    private City city;
    private List<Attributes> attributes;*/

    @Override
    public String toString() {
        return "MercadoLibreContainer{";/* +
                "installments=" + installments.toString() +
                ", address=" + address.toString() +
                ", shipping=" + shipping.toString() +
                ", seller_address=" + seller_address.toString() +
                ", country=" + country.toString() +
                ", state=" + state.toString() +
                ", city=" + city.toString() +
                ", attributes=" + attributes.toString() +
                '}';*/
    }
}
