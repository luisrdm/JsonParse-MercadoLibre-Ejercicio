package ar.com.lanube.parsingjson_mercadolibre.util;

public interface ResultListener<T> {
    void finish(T resultado);
}