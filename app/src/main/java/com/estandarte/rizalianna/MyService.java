package com.estandarte.rizalianna;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyService extends IntentService{
    public MyService() {
        super("MyService");
    }
    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d("4itf", "myService is running");

    }
}