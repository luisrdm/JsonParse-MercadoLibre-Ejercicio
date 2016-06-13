package ar.com.lanube.parsingjson_mercadolibre.model;

/**
 * Created by izu on 09/06/2016.
 */
public class SellerAdress {
    private Integer id;
    private String comment;
    private String address_line;
    private String zip_code;
    private Country country;
    private StateContainer state;
    private CityContainer city;
    private String latitude;
    private String longitude;

    @Override
    public String toString() {
        return "SellerAdress{" +
                "id=" + id +
                ", comment='" + comment + '\'' +
                ", address_line='" + address_line + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", country=" + country.toString() +
                ", state=" + state.toString() +
                ", city=" + city.toString() +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}
