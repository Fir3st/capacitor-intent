package cz.firest.intent;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import android.util.Log;
import android.content.Intent;
import android.net.Uri;
import android.content.ActivityNotFoundException;

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
                this.startActivityForResult(call, intent, 1);
                call.success();
            } catch (ActivityNotFoundException activityError) {
                call.error(activityError.getMessage());
            }
        } else {
            call.error("No action provided");
        }
    }
}
