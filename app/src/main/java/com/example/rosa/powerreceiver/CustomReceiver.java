package com.example.rosa.powerreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {
    static final String ACTION_CUSTOM_BROADCAST =
            "com.example.android.powerreceiver.ACTION_CUSTOM_BROADCAST";

    public CustomReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String intentAction = intent.getAction();
        String toastMessage = null;

        switch (intentAction){
            case Intent.ACTION_POWER_CONNECTED:
                toastMessage = "Power connected!";
                break;
            case Intent.ACTION_POWER_DISCONNECTED:
                toastMessage = "Power disconnected!";
                break;
            case ACTION_CUSTOM_BROADCAST:
                toastMessage = "Custom Broadcast Received";
        }

        Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
    }
}
