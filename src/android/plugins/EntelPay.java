package plugins;

import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;



public class EntelPay extends CordovaPlugin {

    @Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Log.e("Ingreso",action);

        if(action.equals("encriptar")) {

            try{
                String dato = args.getString(0)+"one";
                    
                    JSONObject result = new JSONObject();
                    result.put("result", dato);

                    callbackContext.success(result.toString());

                    return true;

            }
            catch(Exception e){
                callbackContext.error(e.getMessage());
                return false;
            }
            
            
        }
        if(action.equals("desencriptar")) {
            return true;
        }
        else
            return false;
    }
}