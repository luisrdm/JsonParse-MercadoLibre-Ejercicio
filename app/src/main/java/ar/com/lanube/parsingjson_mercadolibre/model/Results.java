package ar.com.lanube.parsingjson_mercadolibre.model;

import java.util.List;

/**
 * Created by izu on 09/06/2016.
 */
public class Results {
    private String id;
    private String site_id;
    private String title;
    private String subtitle;
    private Seller seller;
    private Double price;
    private String currency_id;
    private Integer available_quantity;
    private Integer sold_quantity;
    private String buying_mode;
    private String listing_type_id;
    private String stop_time; //debería ser Date o algo así
    private String condition;
    private String permalink; //debería ser tipo Link o URL o algo así
    private String thumbnail; //debería ser tipo Link o URL o algo así
    private Boolean accepts_mercadopago;
    private Installments installments;
    private Address address;
    private Shipping shipping;
    private SellerAddress seller_address;
    private List<String> attributes;
    private Boolean original_price;
    private String category_id;
    private Boolean official_store_id;

    @Override
    public String toString() {
        return "Results{" +
                "id='" + id + '\'' +
                ", site_id='" + site_id + '\'' +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", seller=" + seller +
                ", price=" + price +
                ", currency_id='" + currency_id + '\'' +
                ", available_quantity=" + available_quantity +
                ", sold_quantity=" + sold_quantity +
                ", buying_mode='" + buying_mode + '\'' +
               ", listing_type_id='" + listing_type_id + '\'' +
                ", stop_time='" + stop_time + '\'' +
                ", condition='" + condition + '\'' +
                ", permalink='" + permalink + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", accepts_mercadopago=" + accepts_mercadopago +
                ", installments=" + installments +
                 ", address=" + address +
                 ", shipping=" + shipping +
                ", seller_address=" + seller_address +
                ", attributes=" + attributes +
                 ", original_price=" + original_price +
                ", category_id='" + category_id + '\'' +
                ", official_store_id=" + official_store_id +
                '}';
    }
}
