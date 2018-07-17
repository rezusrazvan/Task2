package com.example.student.broadcast;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestReceiver extends BroadcastReceiver {

    public TestReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("com.example.student.broadcast.START_APP")){
            Toast.makeText(context,"Aplicatia Merge", Toast.LENGTH_LONG).show();
        }

    }
}
