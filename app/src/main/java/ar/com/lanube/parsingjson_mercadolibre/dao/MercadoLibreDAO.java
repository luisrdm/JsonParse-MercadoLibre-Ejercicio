package ar.com.lanube.parsingjson_mercadolibre.dao;

import android.os.AsyncTask;
import android.util.Xml;

import com.google.gson.Gson;

import org.xmlpull.v1.XmlPullParser;

import java.io.InputStream;
import java.util.List;

import ar.com.lanube.parsingjson_mercadolibre.model.MercadoLibreContainer;
import ar.com.lanube.parsingjson_mercadolibre.util.DAOException;
import ar.com.lanube.parsingjson_mercadolibre.util.HTTPConnectionManager;
import ar.com.lanube.parsingjson_mercadolibre.util.ResultListener;

/**
 * Created by izu on 09/06/2016..
 */
public class MercadoLibreDAO extends GenericDAO {

    public void getMercadoLibreData (ResultListener<List<MercadoLibreContainer>> listener){
        RetrieveFeedTask retrieveFeedTask = new RetrieveFeedTask(listener);
        retrieveFeedTask.execute();
    }

    class RetrieveFeedTask extends AsyncTask<String, Void, List<MercadoLibreContainer>> {

        private ResultListener<List<MercadoLibreContainer>> listener;

        public RetrieveFeedTask(ResultListener<List<MercadoLibreContainer>> listener) {
            this.listener = listener;
        }

        @Override
        protected List<MercadoLibreContainer> doInBackground(String... params) {

            HTTPConnectionManager connectionManager = new HTTPConnectionManager();
            String input = null;

            try {
                input = connectionManager.getRequestString("https://api.mercadolibre.com/sites/MLA/search?q=tennis");
            } catch (DAOException e) {
                e.printStackTrace();
            }

            Gson gson = new Gson();
            MercadoLibreContainer mercadoLibreContainer = gson.fromJson(input, MercadoLibreContainer.class);
            return mercadoLibreContainer;







            XmlPullParser parser = Xml.newPullParser();
            try{
                parser.setInput(input, null);
                Integer status = parser.getEventType();
                while (status != XmlPullParser.END_DOCUMENT){
                    switch (status){
                        case XmlPullParser.START_DOCUMENT:
                            break;
                        case XmlPullParser.START_TAG:
                            break;
                    }
                    status = parser.next();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
            return result;
        }

        @Override
        protected void onPostExecute(List<MercadoLibreContainer> input) {
            this.listener.finish(input);
        }
    }

}
