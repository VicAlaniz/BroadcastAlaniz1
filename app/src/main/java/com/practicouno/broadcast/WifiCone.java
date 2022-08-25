package com.practicouno.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.util.Log;

public class WifiCone extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {


        boolean con= intent.getBooleanExtra(WifiManager.EXTRA_SUPPLICANT_CONNECTED, false);
        if (con) { // Hacer llamado cuando desconecta wifi
            String no = "2664553747";

            Intent callintent = new Intent("android.intent.action.CALL");
            callintent.setData(Uri.parse("tel:" +no));
            context.startActivity(callintent);


        }


                else {Log.d("Salida", "desconectado");}



    }
}
