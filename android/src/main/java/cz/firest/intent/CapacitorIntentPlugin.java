package cz.firest.intent;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "CapacitorIntent")
public class CapacitorIntentPlugin extends Plugin {

    public static final String LOG_TAG = "Intent";

    @PluginMethod
    public void startActivity(PluginCall call) {
        JSObject data = call.getData();
        final String action = data.has("action") ? data.getString("action") : null;
        Log.d(LOG_TAG, "Action: " + action);

        if (action != null) {
            final String url = data.has("url") ? data.getString("url") : "";
            final Intent intent = new Intent(action, Uri.parse(url));
            try {
                getActivity().startActivity(intent);
                call.resolve();
            } catch (ActivityNotFoundException activityError) {
                call.reject(activityError.getMessage());
            }
        } else {
            call.reject("No action provided");
        }
    }
}
