package com.estandarte.rizalianna;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i = new Intent(this, MyService.class);
        this.startService(i);
    }

    public void process (View v){
        Intent i=null, chooser=null;
        if (v.getId() == R.id.btn2)
        {
            i = new Intent(this, SecondActivity.class);
            startActivity(i);
        }
        else if (v.getId() == R.id.btnMap)
        {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.5792,120.9723"));
            chooser = Intent.createChooser(i, "Select an app");
            startActivity(chooser);
        }
    }
}