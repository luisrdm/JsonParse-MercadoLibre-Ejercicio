package ar.com.lanube.parsingjson_mercadolibre.dao;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by izu on 09/06/2016.
 */
public class GenericDAO {

    public Object getObject(Context context, Class aClass, String fileName){

        Object object = null;
        try{

            AssetManager manager = context.getAssets();
            InputStream inputStream = manager.open(fileName);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            Gson gson = new Gson();
            object = gson.fromJson(bufferedReader, aClass);
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return object;
    }

}
