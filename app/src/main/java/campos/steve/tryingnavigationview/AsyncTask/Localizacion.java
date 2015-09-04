package campos.steve.tryingnavigationview.AsyncTask;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONObject;

import campos.steve.tryingnavigationview.RestApi.RestApi;

/**
 * Created by Usuario on 04/09/2015.
 */
public class Localizacion extends AsyncTask<String, String, String> {

    String TAG_API_LOCALIZACION = "API LOCALIZACION";
    JSONObject jsonObject = null;

    @Override
    protected String doInBackground(String... strings) {
        RestApi api = new RestApi();
        String device = strings[0];
        String latitud = strings[1];
        String longitud = strings[2];

        try {
            jsonObject = api.InsUpdLocalizacionPrueba(device, latitud, longitud);
            Log.d(TAG_API_LOCALIZACION, jsonObject.toString());
        } catch (Exception e) {
            e.printStackTrace();
            Log.d(TAG_API_LOCALIZACION, e.getMessage());
        }
        return null;
    }
}
