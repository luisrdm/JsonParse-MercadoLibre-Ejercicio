package ar.com.lanube.parsingjson_mercadolibre.model;

/**
 * Created by izu on 09/06/2016.
 */
public class Results {
    private String id;
    private String site_id;
    private String title;
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
    private InstallmentsContainer installments;
    private AdressContainer address;
    private ShippingContainer shipping;
    private SellerAdress seller_address;
    private Attributes attributes;
    private Boolean original_price;
    private String category_id;
    private Boolean official_store_id;

    @Override
    public String toString() {
        return "results.toString";
    }
}
