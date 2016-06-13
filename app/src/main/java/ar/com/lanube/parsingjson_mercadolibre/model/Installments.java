package ar.com.lanube.parsingjson_mercadolibre.model;

/**
 * Created by izu on 09/06/2016.
 */
public class Installments {
    private Integer quantity;
    private Integer amount;
    private String currency_id; //Debería ser tipo Currency

    @Override
    public String toString() {
        return "Installments{";/* +
                "quantity=" + quantity +
                ", amount=" + amount +
                ", currency_id='" + currency_id + '\'' +
                '}';*/
    }
}
